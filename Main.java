import java.util.Arrays;
import java.util.Date;
import java.awt.*;
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
        //
        
    }
}