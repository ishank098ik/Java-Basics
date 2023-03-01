package March01_2023;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 1){
            while(a != 0){
                if(a == 0)
                    break;
                int marks = sc.nextInt();
                if(marks >= 90){
                    System.out.println("This is Good");
                } else if(marks >= 60 ){
                    System.out.println("This is also Good");
                } else{
                    System.out.println("This is Good as well");
                }
                 a = sc.nextInt(); 
                

            }
        }
    }
    
}
