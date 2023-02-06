import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Handler;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {


        Class catClass=Cat.class;
        Method[] methods=catClass.getDeclaredMethods();

        for (Method o:methods){
            System.out.println(o.getName());
        }
        Cat cat=new Cat(1,2,3);
//        methods[1].invoke(cat);
//        methods[0].setAccessible(true);
//        methods[0].invoke(cat);
//        int mods=methods[0].getModifiers();
//        System.out.println("Its Final? "+ Modifier.isFinal(mods));
//        System.out.println("Its Static? "+ Modifier.isStatic(mods));
//        System.out.println("Its Public? "+ Modifier.isPublic(mods));

        Field[] fields=catClass.getDeclaredFields();
        System.out.println(Arrays.toString(fields));
        fields[1].set(cat,20);
        System.out.println(fields[1].get(cat));

        Cat cat2=(Cat)catClass.newInstance();
        System.out.println(cat2);
        Cat cat3=(Cat)catClass.getConstructor(int.class,int.class,int.class).newInstance(20,30,40);
        System.out.println(cat3);
        ClassLoader classLoader=new URLClassLoader(new URL[]{new File("C:\\Users\\bodna\\OneDrive\\Рабочий стол\\GeekBrains ВТБ\\Лекция 9\\JavaReflection").toURL()});
        Class humanClass=classLoader.loadClass("Human");
        Object humanObject=humanClass.getConstructor(String.class,int.class).newInstance("Egor",19);
        Method methodsGreetings=humanClass.getDeclaredMethod("greetings");
        methodsGreetings.invoke(humanObject);

//      Handler Annotations:
        Class testClass=TestClass.class;
        Method[] method=testClass.getDeclaredMethods();
        for (Method o:method) {
            if (o.isAnnotationPresent(MyAnnotation.class)) {
                o.invoke(null);
            }
            }

        System.out.println("___________");

        List<Method> executionList=Arrays.stream(method)
                .filter(m->m.isAnnotationPresent(MyAnnotation.class))
                .sorted(((o1, o2) -> o2.getAnnotation(MyAnnotation.class).priority()-o1.getAnnotation(MyAnnotation.class).priority()))
                .collect(Collectors.toList());

        for (Method o:executionList){
            o.invoke(null);
        }
        }
    }
