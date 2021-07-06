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
    var tax = calculator.calculateTax();
    System.out.println(tax);
  }
  //this is a setter injection of dependecies
  //  public void setCalculator(TaxCalculator calculator) {
  //    this.calculator = calculator;
  //  }
}
