package interfaces;

//interfaces specify the behaviour that classes must implement
//an interface is basically the middle ground between classes in order
//for them not to interact and depend on each other directly
public interface TaxCalculator {
  double calculateTax();

  static double getTaxabaleIncome(double income, double expenses) {
    return income - expenses;
  }
}
