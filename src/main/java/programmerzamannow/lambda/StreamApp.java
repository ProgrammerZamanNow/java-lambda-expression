package programmerzamannow.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApp {

  public static void main(String[] args) {
    Stream<String> names = newStream();
//    names
//      .map(new Function<String, String>() {
//        @Override
//        public String apply(String s) {
//          return s.toUpperCase();
//        }
//      })
//      .forEach(new Consumer<String>() {
//        @Override
//        public void accept(String s) {
//          System.out.println(s);
//        }
//      });

//    names
//      .map((value) -> value.toUpperCase())
//      .forEach((value) -> System.out.println(value));

    names
      .map(String::toUpperCase)
      .forEach(System.out::println);

    List<String> fruits = newList();

    fruits.stream()
      .map(String::toUpperCase)
      .filter((value) -> value.startsWith("A"))
      .forEach(System.out::println);
  }

  public static Stream<String> newStream() {
    return Stream.of("eko", "kurniawan", "khannedy");
  }

  public static List<String> newList() {
    return Arrays.asList("apel", "melon", "alpukat", "jeruk", "belimbing");
  }
}
