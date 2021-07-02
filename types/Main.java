package types;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.awt.*;
import java.text.NumberFormat;
public class Main {
    public static void main(String[] args) {
        int age = 30;
        age = 35;
        System.out.println(age);
        System.out.println("hello");
        //
        Date date = new Date();
        System.out.println(date);
        //
        Point point1 = new Point(1,1);
        System.out.println(point1);
        //
        String message = "Hello" + "World";
        System.out.println(message.startsWith("Wow "));
        System.out.println(message.replaceAll("e","b"));
        //
        System.out.println("Hello \n This \t is test \"Which Works\"");
        //arrays
        int[] nums = new int[5];
        nums[0] = 1;
        System.out.println(Arrays.toString(nums));
        //arrays 2.0
        int[] nums2 = {2,3,4,6,8};
        Arrays.sort(nums2);
        System.out.println(nums2.length);
        //arrays 3.0 multi
        int[][] nums3 = new int[2][3];
        nums3[0][0] = 1;
        System.out.println(Arrays.deepToString(nums3));
        //arrays 4.0
        int[][] nums4 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(nums4));
        //contants
        final float PI = 3.14F;
        //arithmetic
        int result = 10+3;
        double result2 = 10/3;
        int x = 1;
        ++x;
        x+=2;
        System.out.println(result + result2 + PI + x);
        //casting
        double val1 = 1.1;
        int y = (int)val1 + 2;
        System.out.println(y);
        //casting 2.0
        String val2 = "1";
        int z = Integer.parseInt(val2) + 2;
        System.out.println(z);
        //Math
        int val4 = (int)Math.ceil(1.1F);
        System.out.println(val4);
            //Math.max / Math.floor / min / random / Math.random() * 100 / round
        //Format Nums
        NumberFormat currency = NumberFormat.getCurrencyInstance();
            //getPercentInstance
        String val5 = currency.format(123312.121);
        System.out.println(val5);
        //Method Chaining
        String val6 = NumberFormat.getCurrencyInstance().format(0.1);
        System.out.println(val6);
        //Reading Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte inputAge = scanner.nextByte();
            //.next() / for string // .nextLine
        System.out.println("You are " + inputAge);
        scanner.close();
    }
}