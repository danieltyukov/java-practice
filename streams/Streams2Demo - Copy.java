package streams;

// import java.util.List;
// import java.util.stream.Collector;
import java.util.stream.IntStream;

public class Streams2Demo {

  public static void show() {
    // var movies = List.of(
    //   new Movie("The Matrix", 10, Genre.THRILLER),
    //   new Movie("The Dark Knight", 20, Genre.ACTION),
    //   new Movie("Joker", 30, Genre.COMEDY)
    // );
    //Grouping Elements
    // var groupByGenre = movies
    //   .stream()
    //   .collect(
    //     Collector.groupingBy(
    //       Movie::getGenre,
    //       Collector.mapping(Movie::getTitle, Collector.joining(","))
    //     )
    //   );
    // System.out.println(groupByGenre);
    //Partitioning Elements
    // movies
    //   .stream()
    //   .collect(
    //     Collector.partitioningBy(
    //       m -> m.getLikes() > 20,
    //       Collector.mapping(Movie::getTitle, Collector.joining(","))
    //     )
    //   );
    //Primitive Streams
    //IntStream, LongStream, DoubleStream, FloatStream
    IntStream.range(0, 10).forEach(System.out::println);
  }
}
