package programmerzamannow.lambda;

public class LambdaInterfaceApp {

  public static void main(String[] args) {

    ArgsConsumer<String> consumer = LambdaInterfaceApp::printAll;

    consumer.consume("eko", "kurniawan", "khannedy");

  }

  public static void printAll(String[] args){
    for(String value: args){
      System.out.println(value);
    }
  }

  @FunctionalInterface
  interface ArgsConsumer<T> {

    void consume(T... arg);

  }

}
