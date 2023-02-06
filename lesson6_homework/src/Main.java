import java.sql.SQLData;

public class Main {
    static final int size = 10000000;
    static final int half = size / 2;

    public float[] calculate(float[] arr){
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5)*Math.cos(0.4f + i/2));
        }
        return arr;
    }
    public void runOneThread(){
        float[] arr=new float[size];
        for (int i=0; i < arr.length; i++) {arr[i]=1.0f;}
        long a=System.currentTimeMillis();
        calculate(arr);
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
                float[] a1=calculate(arr1);
                System.arraycopy(a1,0,arr1,0,a1.length);
            }
        };

        Thread forArr2=new Thread() {
            public void run(){
                float[] a2=calculate(arr2);
                System.arraycopy(a2,0,arr2,0,a2.length);
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
