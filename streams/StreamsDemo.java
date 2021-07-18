package streams;

import java.util.Arrays;

public class StreamsDemo {

  public static void show() {
    int[] numbers = { 1, 2, 3 };
    Arrays.stream(numbers).forEach(n -> System.out.println(n));
  }
  // //The problem streams solve
  // List<Movie> movies = List.of(
  //   new Movie("a", 10),
  //   new Movie("b", 20),
  //   new Movie("c", 30)
  // );

  // //Imperative Programming
  // //HOW something should be done
  // int count = 0;
  // for (var m : movies){
  //   if (m.getLikes() > 10){
  //     count++;
  //   }
  // //Declarative (Functional) Programming
  // var count2 = movies.stream().filter(m -> m.getLikes() > 10).count();
  // }

}
/* There are many programming paradigms
like Declarative, Functional, Object-Oriented, Event-Driven, Imperative, etc.
*/
//Declarative is WHAT should be done like in SQL
//Streams bring declarative or rather Functional way of programming to Java
//A stream is attched to a collection to hold it
