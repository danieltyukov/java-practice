package lambdas;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdasDemo {

  public static void show() {
    UnaryOperator<Integer> square = n -> n * n;
    UnaryOperator<Integer> increment = n -> n + 1;

    //we are chaining consumers with .andThen()
    var result = increment.andThen(square).apply(1);
    System.out.println(result);

    //different ways of implementing things
    List<Integer> list = List.of(1, 2, 3);
    //imperative programming
    for (var item : list) {
      System.out.println(item);
    }
    //declartive programming
    list.forEach(item -> System.out.println(item));

    //Supplier Interface
    Supplier<Double> supplier = () -> Math.random();
    var random = supplier.get();
    System.out.println(random);

    //Functional Interface
    Function<String, Integer> map = str -> str.length();
    var length = map.apply("hello");
    System.out.println(length);

    //Composing Functions
    Function<String, String> replaceColon = str -> str.replace(":", "=");
    Function<String, String> addBraces = str -> "(" + str + ")";

    //Declarative Programming
    var res = replaceColon.andThen(addBraces).apply("key:value");
    System.out.println(res);
    //Another way of doing it
    var res2 = addBraces.compose(replaceColon).apply("key:value");
    System.out.println(res2);

    //Predicate Interface
    Predicate<String> isLowerCase = str -> str.toLowerCase().equals(str);
    var isLower = isLowerCase.test("hello");
    System.out.println(isLower);
    //Combining Predicates
    Predicate<String> hasLeftBracket = str -> str.startsWith("{");
    Predicate<String> hasRightBracket = str -> str.endsWith("}");

    Predicate<String> hasBrackets = hasLeftBracket.and(hasRightBracket);
    //has negate and or etc
    var r = hasBrackets.test("{key:value}");
    System.out.println(r);

    //Binary Operator
    BinaryOperator<Integer> add = (a, b) -> a + b;
    Function<Integer, Integer> squareVal = n -> n * n;
    var sum = add.apply(1, 2);
    var sum2 = add.andThen(squareVal).apply(1, 2);
    System.out.println(sum + sum2);

    //Unary Operator
    UnaryOperator<Integer> unarySquare = n -> n * n;
    UnaryOperator<Integer> unaryIncrement = n -> n + 1;

    var result3 = unaryIncrement.andThen(unarySquare).apply(1);
    System.out.println(result3);
  }
}
//FOUR FUNCTIONAL INTERFACES
//Consumer, Supplier , Function, Predicate
