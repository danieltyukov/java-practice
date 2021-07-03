package mortgagecalc;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int principal = 0;
        float annuelInterest = 0;
        byte years = 0;

        Scanner in = new Scanner(System.in);

        while(true){
            System.out.print("Principal: ");
            principal = in.nextInt();

            if (principal >= 1000 && principal <=1_000_000) {
                break;
            }

            System.out.print("Enter the value between 1000 and 1000000");
        }
        
        while (true) {

            System.out.print("Annual Interest Rate: ");
            annuelInterest = in.nextFloat();

            if(annuelInterest >= 1 && annuelInterest <=30){
                break;
            }

            System.out.print("Print value between 1 and 30");
        }

        while (true) {

            System.out.print("Period (Years): ");
            years = in.nextByte();
            if (years >= 1 && years <= 30){
                break;
            }
        }

        double mortgage = calculateMortgage(principal, annuelInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+mortgageFormatted);
        in.close();
    }
    public static double calculateMortgage(int principal, float annuelInterest, byte years){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);
        float monthlyInterest = annuelInterest / PERCENT / MONTHS_IN_YEAR;
        
        double mortgage = principal * (monthlyInterest * 
        Math.pow(1+monthlyInterest,numberOfPayments)) / 
        (Math.pow(1+monthlyInterest,numberOfPayments) - 1);

        return mortgage;

    }
}
