package services;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams<I extends Number> {

    public static void main(String[] args) {

        List<Integer> RollNo = Arrays.asList(2, 4, 50, 5, 13, 10, 6, 99, 17);

        Stream <Integer> S = RollNo.stream();
        List<Integer> NewList = S.filter(i-> i%2==0).collect(Collectors.toList());
        System.out.println(NewList);

        //same working as above
        List<Integer> NewList2 = RollNo.stream().filter(i-> i%2==0).collect(Collectors.toList());
        System.out.println(NewList2);
    }
}
