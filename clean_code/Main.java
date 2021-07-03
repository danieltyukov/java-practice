package clean_code;

public class Main {
    //break down your code into methods
    //here we create a method

    //main method
    public static void main(String[] args){
        greetUser("John", "Smith");
        String returnedVal = farewellUser("Joe");
        System.out.println(returnedVal);
    }

    //secondary method
    //access modifiers can be public or private | public can be called outside class | vise-versa
    //can be static or non-static | static belong to the class
    //static method can only access static data and can call only static methods
    //a method can return value or not | if not use void | else int,String etc...
    //input to a method is defined inside () | if nothing leave empty
    //it can then be used locally inside the method
    public static void greetUser(String name, String lastName){
        System.out.println(name + lastName);

    }
    public static String farewellUser(String name){
        return "Bye" + name;
    }
    
}
