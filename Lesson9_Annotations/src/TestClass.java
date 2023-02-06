public class TestClass {
@MyAnnotation(priority = 3)
    public static void method1(){
        System.out.println("method1");
    }
@MyAnnotation(priority = 4)
    public static void method2(){
        System.out.println("method2");
    }
@MyAnnotation(priority = 2)
    public static void method3(){
        System.out.println("method3");
    }
}
