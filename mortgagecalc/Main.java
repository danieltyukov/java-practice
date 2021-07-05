package mortgagecalc;

//Here we demonstrate a good object oriented development for the project
public class Main {

  public static void main(String[] args) {
    //get input of principal
    int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
    //get input of annulaInterest
    float annualInterest = (float) Console.readNumber(
      "Annual Interest Rate: ",
      1,
      30
    );
    //get input of years
    byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);
    //call the following class and initialize the following variables
    var calculator = new MortgageCalculator(principal, annualInterest, years);

    var report = new MortgageReport(calculator);
    report.printMortgage();
    report.printPaymentSchedule();
  }
}
