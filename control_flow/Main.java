package control_flow;

public class Main {
    public static void main(String[] args){    
        //comparison operators
        int x =1;
        int y =2;
        System.out.println(x==y);
            //<= != > < >=
        //logical operators
        int temp = 22;
        boolean isWarm = temp > 20 && temp < 20;
        System.out.println(isWarm);
            // || !
        //if statements
        int temperature = 32;
        if (temperature>30){
            System.out.println("hot");
        }else if (temperature > 20){
            System.out.println("Good");
        }else{
            System.out.println("cold");
        }
        //if statements 2.0
        int income = 120_000;
        boolean hasHighIncome = (income >100_000);
        System.out.println(hasHighIncome);
        //Ternary operator
        int money = 120_000;
        String className = money > 100_000 ? "First" : "Economy";
        System.out.println(className);
        //Swicth statements
        String role = "admin";
        switch (role){
            case "admin":
                System.out.println("you are admin");
                break;
            case "moderator":
                System.out.println("you are moderator");
                break;
            default:
                System.out.println("you are guest");
        }
        


    }
}
