package lambdas;

import java.util.List;
import java.util.function.UnaryOperator;

public class LambdasDemo {

  public static void show() {
    UnaryOperator<Integer> square = n -> n * n;
    UnaryOperator<Integer> increment = n -> n + 1;

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
  }
}
