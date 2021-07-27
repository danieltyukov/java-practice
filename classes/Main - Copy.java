package classes;

public class Main {

  public static void main(String[] args) {
    //reference a class
    var employee = new Employee(50_000, 20);
    //static method used
    Employee.printNumberOfEmployees();
    int wage = employee.calculateWage();
    System.out.println(wage);
  }
}
/* 
Constructors
are called when we instantiate our class. We use them to initialize our 
objects. Initialization means putting an object into an 
early or initial state (eg giving it initial values).
*/
/* 
Method Overloading
means declaring a method with the same name but 
with different signatures. The number, type and 
order of its parameters will be different.
*/
//Static methods are accessible via classes, not objects.
