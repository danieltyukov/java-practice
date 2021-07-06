package interfaces;

//interfaces specify the behaviour that classes must implement
public interface TaxCalculator {
  double calculateTax();

  static double getTaxabaleIncome(double income, double expenses) {
    return income - expenses;
  }
}
