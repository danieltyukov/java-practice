package concurrency;

public class Main {

  public static void main(String[] args) {
    // manpulate multi thread devices
    System.out.println(Thread.activeCount());
    System.out.println(Runtime.getRuntime().availableProcessors());
  }
}
