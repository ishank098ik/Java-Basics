package March01_2023;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       // If else condition

       int age = sc.nextInt();

       if(age > 18) {
        System.out.println("Adult");        
       } else {
        System.out.println("Not Adult");
       }

        // module cond

       int x = sc.nextInt();

       if(x % 2 == 0) {
        System.out.println("Even");        
       } else {
        System.out.println("Odd");
       }

       // equal cond

       int a = sc.nextInt();
       int b = sc.nextInt();

       if(a == b) {
        System.out.println("Equal");        
       } else if(a > b){
            System.out.println("a is greater");
        } 
        else {
            System.out.println("a is lesser");
        }

        // switch condition

        int button = sc.nextInt();

        // if(button == 1){
        //     System.out.println("Hello");
        // } else if(button == 2){
        //     System.out.println("Namastey");
        // } else if(button == 3){
        //     System.out.println("Banjour");
        // } else {
        //     System.out.println("Invalid Button");
        // }

        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namastey");
            break;
            case 3 : System.out.println("Banjour");
            break;
            case 4 : System.out.println("Invalid Button");
        }

    } 
    
}
