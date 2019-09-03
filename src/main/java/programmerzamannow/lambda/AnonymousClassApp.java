package programmerzamannow.lambda;

import java.util.function.*;

public class AnonymousClassApp {

  public static void main(String[] args) {
    Predicate<String> predicate = new Predicate<String>() {

      @Override
      public boolean test(String s) {
        return s != null;
      }
    };

    Function<String, String> function = new Function<String, String>() {

      @Override
      public String apply(String s) {
        return s.toUpperCase();
      }
    };

    Consumer<String> consumer = new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    };

    Supplier<String> supplier = new Supplier<String>() {
      @Override
      public String get() {
        return "Programmer Zaman Now";
      }
    };

    BiPredicate<String, String> biPredicate = new BiPredicate<String, String>() {
      @Override
      public boolean test(String s, String s2) {
        return s.equals(s2);
      }
    };

  }

}
