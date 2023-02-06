import java.sql.SQLData;

public class Main2 {
    static final int size = 10000000;
    static final int half = size / 2;


    public void runOneThread(){
        float[] arr=new float[size];
        for (int i=0; i < arr.length; i++) {arr[i]=1.0f;}
        long a=System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5)*Math.cos(0.4f + i/2));
        }
        System.out.println("One Thread ends with -> "+(System.currentTimeMillis()-a));
    }

    public void runTwoThreads(){
        long a=System.currentTimeMillis();
        float[] arr=new float[size];
        float[] arr1=new float[half];
        float[] arr2=new float[half];


        System.arraycopy(arr,0,arr1,0,half);
        System.arraycopy(arr,half,arr2,0,half);

        Thread forArr1=new Thread(){
            public void run(){
                for (int i = 0; i < arr1.length; i++)
                {
                    arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5)*Math.cos(0.4f + i/2));
                }
            }
        };

        Thread forArr2=new Thread() {
            public void run(){
                for (int i = 0, j=half; i < arr2.length; i++,j++)
                {
                    arr2[i] = (float)(arr2[i] * Math.sin(0.2f + j/5) * Math.cos(0.2f + j/5)*Math.cos(0.4f + j/2));
                }
            }

        };
        forArr1.start();
        forArr2.start();

        try {
            forArr1.join();
            forArr2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.arraycopy(arr1,0,arr,0,half);
        System.arraycopy(arr2,0,arr,half,half);
        System.out.println("Two Threads ends with -> "+(System.currentTimeMillis()-a));


    }


    public static void main(String[] args)
    {
        Main o=new Main();
        o.runOneThread();
        o.runTwoThreads();


    }
}
