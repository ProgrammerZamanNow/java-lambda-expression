package programmerzamannow.lambda;

import java.util.function.*;

public class LambdaProgram {

  public static void main(String[] args) {

//    Predicate<String> predicate = new Predicate<String>() {
//
//      @Override
//      public boolean test(String s) {
//        return s != null;
//      }
//    };

    Predicate<String> predicate = (value) -> value != null;
    System.out.println(predicate.test("A"));
    System.out.println(predicate.test("B"));
    System.out.println(predicate.test(null));

//    Function<String, String> function = new Function<String, String>() {
//
//      @Override
//      public String apply(String s) {
//        return s.toUpperCase();
//      }
//    };

    Function<String, String> function = (value) -> value.toUpperCase();
    System.out.println(function.apply("eko"));
    System.out.println(function.apply("kurniawan"));
    System.out.println(function.apply("khannedy"));

//    Consumer<String> consumer = new Consumer<String>() {
//      @Override
//      public void accept(String s) {
//        System.out.println(s);
//      }
//    };

    Consumer<String> consumer = (value) -> System.out.println(value);
    consumer.accept("Hello Lambda");
    consumer.accept("Hello Lambda Lagi");

//    Supplier<String> supplier = new Supplier<String>() {
//      @Override
//      public String get() {
//        return "Programmer Zaman Now";
//      }
//    };

    Supplier<String> supplier = () -> "Programmer Zaman Now";
    System.out.println(supplier.get());

//    BiPredicate<String, String> biPredicate = new BiPredicate<String, String>() {
//      @Override
//      public boolean test(String s, String s2) {
//        return s.equals(s2);
//      }
//    };

    BiPredicate<String, String> biPredicate = (value1, value2) -> value1.equals(value2);
    System.out.println(biPredicate.test("eko", "eko"));
    System.out.println(biPredicate.test("eko", "bukan"));


//    Supplier<String> stringSupplier = new Supplier<String>() {
//      @Override
//      public String get() {
//        return "Eko Kurniawan";
//      }
//    };
//    printLambda(stringSupplier);

//    printLambda(new Supplier<String>() {
//      @Override
//      public String get() {
//        return "Eko Kurniawan";
//      }
//    });

//    Supplier<String> stringSupplier = () -> "Eko Kurniawan";
//    printLambda(stringSupplier);

    printLambda(() -> "Eko Kurniawan");
  }

  public static void printLambda(Supplier<String> supplier){
    System.out.println(supplier.get());
  }
}
