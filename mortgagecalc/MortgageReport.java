package mortgagecalc;

import java.text.NumberFormat;

public class MortgageReport {

  //initiazlied variables and one of them is locally and finally iniazied when the
  //contractor is called
  private final NumberFormat currency;
  private MortgageCalculator calculator;

  public MortgageReport(MortgageCalculator calculator) {
    this.calculator = calculator;
    currency = NumberFormat.getCurrencyInstance();
  }

  public void printPaymentSchedule() {
    System.out.println();
    System.out.println("PAYMENT SCHEDULE");
    System.out.println("----------------");
    for (double balance : calculator.getRemainingBalances()) System.out.println(
      currency.format(balance)
    );
  }

  public void printMortgage() {
    double mortgage = calculator.calculateMortgage();
    String mortgageFormatted = currency.format(mortgage);
    System.out.println();
    System.out.println("MORTGAGE");
    System.out.println("--------");
    System.out.println("Monthly Payments: " + mortgageFormatted);
  }
}
