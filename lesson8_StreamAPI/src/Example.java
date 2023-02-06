import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        List<Integer> nubmers = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> out=nubmers.stream()
                .filter(n-> n%2==0)
                .map(n->n*n)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(out);

        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list.stream().allMatch(n->n<10));
        System.out.println(list.stream().anyMatch(n->n==3));
        System.out.println(list.stream().noneMatch(n->n==2));

    }
}
