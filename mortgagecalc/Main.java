package mortgagecalc;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
  

  static final byte MONTHS_IN_YEAR = 12;
  static final byte PERCENT = 100;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int principal = (int) readNumber("Principal: ", 1000, 1_000_000, in);
    float annuelInterest = (float) readNumber(
      "Annual Interest Rate: ",
      1,
      30,
      in
    );
    byte years = (byte) readNumber("Period (Years): ", 1, 30, in);
    in.close();

    printMortgage(principal, annuelInterest, years);
    printPaymentSchedule(principal, annuelInterest, years);
  }

  private static void printMortgage(
    int principal,
    float annuelInterest,
    byte years
  ) {
    double mortgage = calculateMortgage(principal, annuelInterest, years);
    String mortgageFormatted = NumberFormat
      .getCurrencyInstance()
      .format(mortgage);
    System.out.println();
    System.out.println("MORTGAGE");
    System.out.println("--------");
    System.out.println("Monthly Payments: " + mortgageFormatted);
  }

  private static void printPaymentSchedule(
    int principal,
    float annuelInterest,
    byte years
  ) {
    System.out.println();
    System.out.println("PAYMENT SCHEDULE");
    System.out.println("----------------");
    for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
      double balance = calculateBalance(
        principal,
        annuelInterest,
        years,
        month
      );
      System.out.println(NumberFormat.getCurrencyInstance().format(balance));
    }
  }

  public static double readNumber(
    String prompt,
    double min,
    double max,
    Scanner in
  ) {
    double value;
    while (true) {
      System.out.print(prompt);
      value = in.nextFloat();

      if (value >= min && value <= max) {
        break;
      }

      System.out.print("Enter value between " + min + " and " + max);
    }
    return value;
  }

  public static double calculateBalance(
    int principal,
    float annuelInterest,
    byte years,
    short numberOfPaymentsMade
  ) {
    float monthlyInterest = annuelInterest / PERCENT / MONTHS_IN_YEAR;
    float numberOfPayments = years * MONTHS_IN_YEAR;

    double balance =
      principal *
      (
        Math.pow(1 + monthlyInterest, numberOfPayments) -
        Math.pow(1 + monthlyInterest, numberOfPaymentsMade)
      ) /
      (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    return balance;
  }

  public static double calculateMortgage(
    int principal,
    float annuelInterest,
    byte years
  ) {
    float monthlyInterest = annuelInterest / PERCENT / MONTHS_IN_YEAR;
    float numberOfPayments = years * MONTHS_IN_YEAR;

    double mortgage =
      principal *
      (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
      (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    return mortgage;
  }
}
