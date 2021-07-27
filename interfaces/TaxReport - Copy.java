package interfaces;

public class TaxReport {

  private TaxCalculator calculator;

  //injecting a dependency using a constructor is called
  //constructor injection
  public TaxReport(TaxCalculator calculator) {
    this.calculator = calculator;
  }

  //method injection of dependencies
  public void show(TaxCalculator calculator) {
    if (this.calculator != null) {
      System.out.println(calculator.calculateTax());
    }

    var tax = calculator.calculateTax();
    System.out.println(tax);
  }

  public static void main(String[] args) {}
  //this is a setter injection of dependecies
  //  public void setCalculator(TaxCalculator calculator) {
  //    this.calculator = calculator;
  //  }
}
