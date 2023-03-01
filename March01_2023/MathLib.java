package March01_2023;
import java.util.*;

public class MathLib {
    public static void main(String[] args) {
        // max of two numbers
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Math.max(a, b));

        // min of two numbers

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();

        System.out.println(Math.min(a1, b1));

        // SQRT of num

        int a2 = sc.nextInt();
        
        System.out.println(Math.sqrt(a2));

        // Powers of  two number

        int a3 = sc.nextInt();
        int b3 = sc.nextInt();


        System.out.println(Math.pow(a3, b3));

        // Absolute of number

        int a4 = sc.nextInt();

        System.out.println(Math.abs(a4));

        // Round

       float a5 = sc.nextFloat();

       System.out.println(Math.round(a5));

       // Floor

       double a6 = sc.nextDouble();

       System.out.println(Math.floor(a6));


       // ceil

       double a7 = sc.nextDouble();

       System.out.println(Math.ceil(a7));

       // Random

       double a8 = Math.random();
       double b8 = Math.random();

       System.out.println(a8);
       System.out.println(b8);

    }
    
}
