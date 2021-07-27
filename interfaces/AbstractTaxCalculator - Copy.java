package interfaces;

public abstract class AbstractTaxCalculator implements TaxCalculator {


  protected double getTaxabaleIncome(double income, double expenses) {
    return income - expenses;
  }
}

//interfaces: (contracts) used to build
//loosely-coupled, extensible, testable applications

//abstract classes: (partially-completed classes)
//to share code
