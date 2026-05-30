import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcat {
    public static void main(String[] args) {
        List<Integer> numbers =List.of(-1,0,7,0,-3,8,5,0);
        List<Integer> moveEleZero= Stream.concat (Stream.concat(numbers.stream().filter(n->n<0),numbers.stream().filter(n->n>0)),
        numbers.stream().filter(n->n==0)).collect(Collectors.toList());

        System.out.println(moveEleZero);
    }
}
//n<0 = negative
//n>0 = positive
//n==0 = zero element