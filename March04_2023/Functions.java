package March04_2023;

import java.util.Scanner;

public class Functions {
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;

            // new ques of sums

            
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();

        // printMyName(name); // call kiya function ko 

                     // sum of 2 numbers


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println( "Sum of 2 numbers : " + sum);
        
    }
    
}
