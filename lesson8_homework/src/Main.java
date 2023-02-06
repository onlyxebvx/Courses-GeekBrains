//        1. Создайте массив с набором слов, и с помощью Stream API найдите наиболее часто
//        встречающееся;
//        2. Создайте массив объектов типа Сотрудник (с полями Имя, Возраст, Зарплата) и вычислите
//        среднюю зарплату сотрудника;
//        3. Напишите метод, способный найти в массиве сотрудников из п. 2 найдите N самых старших
//        сотрудников и отпечатает в консоль сообщение вида “N самых старших сотрудников зовут:
//        имя1, имя2, имяN;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main a=new Main();
        a.task1();
        a.task2();
a.task3();

    }
    public void task1() {
        List<String> words=new ArrayList<>();
        words.add("Minsk");
        words.add("Baranovichi");words.add("Baranovichi");words.add("Baranovichi");words.add("Baranovichi");  words.add("Baranovichi"); words.add("Baranovichi");words.add("Baranovichi");
        words.add("Ganstevichi");words.add("Ganstevichi");
        words.add("Borisov");
        words.add("Mogilev");
        words.add("Pinsk"); words.add("Pinsk");words.add("Pinsk"); words.add("Pinsk");  words.add("Pinsk");words.add("Pinsk");
        words.add("Gomel");  words.add("Gomel");

        Map<String,Long> citiesAndcount= words.stream()
                .collect(Collectors.groupingBy(String::valueOf,Collectors.counting()));

        String prevalingCity= citiesAndcount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println(prevalingCity);
    }

    static class Employee{
        String name;
        int age;
        int salary;

        public Employee(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }

        public String getName() {
            return name;
        }
    }
    public void task2(){
                       Employee[] employees= {
                               new Employee("Bodnar",19,700),
                               new Employee("Prohor",20,300),
                               new Employee("Evseenko",19,1000),
                               new Employee("Usik",19,700)
                            };

          OptionalDouble average=Arrays.stream(employees).mapToDouble(Employee::getSalary).average();
        System.out.println(average);
    }

    public void task3(){
        Employee[] employees= {
                new Employee("Bodnar",19,700),
                new Employee("Prohor",26,300),
                new Employee("Evseenko",19,1000),
                new Employee("Usik",29,700)
        };
        final int N=2;
      List<String> surnames=Arrays.stream(employees).sorted((o1, o2)->o2.age-o1.age).limit(N).map(Employee::getName).collect(Collectors.toList());
        System.out.println(N+" самых старших сотрудников зовут: "+surnames);

       String surnames1= Arrays.stream(employees).sorted(((o1, o2) -> o2.age-o1.age)).limit(N).map(Employee::getName).collect(Collectors.joining(",",N+" самых старших сотрудников: ","."));
        System.out.println(surnames1);
    }
}