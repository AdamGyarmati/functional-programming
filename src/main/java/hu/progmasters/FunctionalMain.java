package hu.progmasters;

import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class FunctionalMain {
    public static void main(String[] args) {
//        System.out.println(incrementByOne(1));
//        System.out.println(incrementByOneFunc.apply(1));
//        System.out.println(sumFunc.apply(1, 1));
//
//        List.of(1, 2, 3).forEach(n -> incrementByOneFunc.apply(n));
//
//        List<Integer> collect = List.of(1, 2, 3).stream()
//                .map(n -> incrementByOneFunc.apply(n))
//                .collect(Collectors.toList());
//        System.out.println(collect);
//
//        System.out.println(incrementByOneFunc.andThen(doubleFunc).apply(2));

        consumer.accept("example@gmail.com");

        System.out.println(supplier.get());

        System.out.println(predicate.test("example@gmail.com"));
        System.out.println(predicate.test("examplegmail.com"));
    }

    public static int incrementByOne(int n) {
        return n + 1;
    }

    static Function<Integer, Integer> incrementByOneFunc = n -> n + 1;
    static Function<Integer, Integer> doubleFunc = n -> n * 2;
    static BiFunction<Integer, Integer, Integer> sumFunc = (n, a) -> n + a;

    static Consumer<String> consumer = (email) -> System.out.println(email);

    static Supplier<String> supplier = () -> "hello";

    static Predicate<String> predicate = email -> email.contains("@");
}
