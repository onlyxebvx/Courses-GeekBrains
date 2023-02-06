import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApp {
    static class Person {
        enum Position {
            ENGINEER, DIRECTOR, MANAGER;
        }
        private String name;
        private int age;
        private Position position;
        public Person(String name, int age, Position position) {
            this.name = name;
            this.age = age;
            this.position = position;
        }
    }
    public static void main(String[] args) {

        List<Integer> integers=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        List<Integer> out =integers.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 ==0;
            }
        }).collect(Collectors.toList());

        List<Integer> out2=integers.stream().filter((n) -> n%2==0).collect(Collectors.toList());


        System.out.println(out);
        System.out.println("--------------------");
        System.out.println(out2);
        System.out.println("--------------------");
        integers.stream().filter((n) -> n%2 == 1).forEach(n -> System.out.println(n));
        System.out.println("--------------------");



        Stream.of("AA","BBB","C").map(s -> s.length()).forEach(System.out::println);
        System.out.println("--------------------");
        Stream.of(1,2,3,4,5).map(n->n*2).forEach(System.out::println);
        System.out.println("--------------------");

        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("Bob1", 35, Person.Position.MANAGER),
                new Person("Bob2", 44, Person.Position.DIRECTOR),
                new Person("Bob3", 25, Person.Position.ENGINEER),
                new Person("Bob4", 42, Person.Position.ENGINEER),
                new Person("Bob5", 55, Person.Position.MANAGER),
                new Person("Bob6", 19, Person.Position.MANAGER),
                new Person("Bob7", 33, Person.Position.ENGINEER),
                new Person("Bob8", 37, Person.Position.MANAGER)
        ));
        List<String> engineersNames = persons.stream()
                .filter(person -> person.position == Person.Position.ENGINEER)
                .sorted((o1, o2) -> o1.age - o2.age)
                .map((Function<Person, String>) person -> person.name)
                .collect(Collectors.toList());
        System.out.println(engineersNames);
    }
}
