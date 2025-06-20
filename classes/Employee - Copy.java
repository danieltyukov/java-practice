package classes;

//creating classes
public class Employee {

  private int baseSalary;
  private int hourlyRate;

  public static int numberOfEmployees;

  //contrcutors
  public Employee(int baseSalary) {
    this(baseSalary, 0);
  }

  //overloading constructors
  public Employee(int baseSalary, int hourlyRate) {
    setBaseSalary(baseSalary);
    setHourlyRate(hourlyRate);
    numberOfEmployees++;
  }

  //Referenced Objects
  //Only static methods can be referenced and used directly
  //value is independent of all objects
  //static methods can only see other static methods
  public static void printNumberOfEmployees() {
    System.out.println(numberOfEmployees);
  }

  public int calculateWage(int extraHours) {
    return baseSalary + (getHourlyRate() * extraHours);
  }

  public int calculateWage() {
    return calculateWage(0);
  }

  //Functional Objects
  private void setBaseSalary(int baseSalary) {
    if (baseSalary <= 0) throw new IllegalArgumentException(
      "Salary cannot be 0 or less."
    );
    this.baseSalary = baseSalary;
  }

  // private int getBaseSalary() {
  //   return baseSalary;
  // }

  private int getHourlyRate() {
    return hourlyRate;
  }

  private void setHourlyRate(int hourlyRate) {
    if (hourlyRate < 0) throw new IllegalArgumentException(
      "Hourly rate cannot be 0 or negative."
    );
    this.hourlyRate = hourlyRate;
  }
}
