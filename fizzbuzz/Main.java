package fizzbuzz;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("input a value: ");

    int val = in.nextInt();

    if ((val % 3 == 0) && (val % 5 == 0)) {
      System.out.println("FizzBuzz");
    } else if (val % 3 == 0) {
      System.out.println("Buzz");
    } else if (val % 5 == 0) {
      System.out.println("Fizz");
    } else {
      System.out.println(val);
    }
    in.close();
  }
}
