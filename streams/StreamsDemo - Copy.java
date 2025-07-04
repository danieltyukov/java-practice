package streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// import java.util.Optional;

public class StreamsDemo {

  public static void show() {
    List<Movies> movies = List.of(
      new Movies("a", 10),
      new Movies("b", 20),
      new Movies("c", 30)
    );

    // Intermidiate Operations
    // -----------------------

    //Mapping
    movies
      .stream()
      .mapToInt(movie -> movie.getLikes())
      .forEach(name -> System.out.println(name));
    //Flat Map
    var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
    stream.flatMap(list -> list.stream()).forEach(n -> System.out.println(n));
    //Filtering Elemnts
    Predicate<Movies> isPopular = m -> m.getLikes() > 10;
    movies.stream().filter(isPopular).forEach(m -> System.out.println(m));
    //Slicing Streams
    movies
      .stream()
      .skip(20)
      .limit(10)
      .forEach(m -> System.out.println(m.getTitle()));
    // // Take While
    // // there is also drop while
    movies
      .stream()
      .takeWhile(m -> m.getLikes() < 30)
      .forEach(m -> System.out.println(m.getTitle()));
    //Sorting Streams
    movies
      .stream()
      .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
      .forEach(m -> System.out.println(m.getTitle()));
    // // another way to sort
    movies
      .stream()
      .sorted(Comparator.comparing(Movies::getTitle).reversed())
      .forEach(m -> System.out.println(m.getTitle()));
    //Getting Uniqe Elements
    movies
      .stream()
      .map(Movies::getLikes)
      .distinct()
      .forEach(System.out::println);
    //Peeking Elements
    movies
      .stream()
      .filter(m -> m.getLikes() > 10)
      .peek(m -> System.out.println("filter: " + m.getTitle()))
      .map(Movies::getTitle)
      .peek(t -> System.out.println("map: " + t))
      .forEach(System.out::println);

    // Reducers Operations
    // -------------------

    //Matchers
    //anyMatch, allMatch, noneMatch
    var res = movies.stream().anyMatch(m -> m.getLikes() > 10);
    System.out.println(res);
    //findFirst
    //findAny
    var first = movies.stream().findFirst().get();
    System.out.println(first.getTitle());
    //max, min, count, sum, average, maxBy, minBy, countBy, sumBy, averageBy
    var second = movies
      .stream()
      .max(Comparator.comparing(Movies::getLikes))
      .get();
    System.out.println(second.getTitle());
    //Reducing a Stream
    // Optional<Integer> sum = movies
    //   .stream()
    //   .map(m -> m.getLikes())
    //   .reduce(0,Integer::sum);
    // System.out.println(sum);
    //Collectors
    // //toSet, toList, toMap, toArray, toObjectArray, toString, toArrayList
    movies
      .stream()
      .filter(m -> m.getLikes() > 10)
      .map(Movies::getTitle)
      .collect(Collectors.joining(", "));
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
