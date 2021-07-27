package interfaces;

//interfaces specify the behaviour that classes must implement
//an interface is basically the middle ground between classes in order
//for them not to interact and depend on each other directly
public interface TaxCalculator {
  double calculateTax();

  //static is a new feature that is not respected
  static double getTaxabaleIncome(double income, double expenses) {
    return income - expenses;
  }
}
/*Tightly-coupled code is code that is hard to change because there is a 
strong dependency between the entities (eg classes) in the code. 
Changing one class may result in several cascading, breaking changes in the code.*/

/*Even though the type of the calculator field in TaxReport is an interface, 
we’re initializing this field to an instance of TaxCalculator2018 
in the constructor. So, TaxReport is tightly coupled to TaxCalculator2018, 
which is an implementation, not an interface.*/

/*Blindly extracting interfaces doesn’t solve any problems nor is it 
considered a best practice. If you extract an interface from every 
single class, you’ll end up with an explosion of interfaces that don’t 
necessarily add any values. You should use interfaces in situations 
where you want to decouple a class from its dependencies so you can 
swap these dependencies. This allows building applications that are 
extensible and testable.*/