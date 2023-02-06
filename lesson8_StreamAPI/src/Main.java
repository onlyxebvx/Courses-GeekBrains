public class Main{
    public static void main(String[] args) {
        doSomething(() -> {
            for (int i = 0; i <5 ; i++) {
                System.out.println("Java");
            }

        });
        doSomething(() -> {
            System.out.println(5);
        });


    }

    public static void doSomething(Runnable runnableObject) {
        runnableObject.run();
    }
}