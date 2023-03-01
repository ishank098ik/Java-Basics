package March01_2023;
import java.util.*;

public class MathLib {
    public static void main(String[] args) {
        // max of two numbers
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = Math.max(a, b);

        System.out.println(c);

        // min of two numbers

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = Math.min(a1, b1);

        System.out.println(c1);

        // SQRT of num

        int a2 = sc.nextInt();
        int c2 = (int) Math.sqrt(a2);
        
        System.out.println(c2);

        // Powers of  two number

        int a3 = sc.nextInt();
        int b3 = sc.nextInt();
        int c3 = (int) Math.pow(a3, b3); // int to double conversion

        System.out.println(c3);

        // Absolute of number

        int a4 = sc.nextInt();

        System.out.println(Math.abs(a4));

        // Round

       float a5 = sc.nextFloat();

       System.out.println(Math.round(a5));

       // Floor

       double a6 = sc.nextDouble();
       double c6 = Math.floor(a6);

       System.out.println(c6);


       // ceil

       double a7 = sc.nextDouble();
       double c7 = Math.ceil(a7);

       System.out.println(c7);

       // Random

       double a8 = Math.random();
       double b8 = Math.random();


       System.out.println(a8);
       System.out.println(b8);

    }
    
}
