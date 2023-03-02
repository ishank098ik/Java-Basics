package March02_2023;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev = 0;
        int n = sc.nextInt();
        int b = n;
        while(n > 0){
           int a  = n % 10;
            rev = (rev * 10) + a;
            n = n / 10;
            
        }
        if(b == rev){
            System.out.println("Palindrome");
        } else { 
            System.out.println(" Not Palindrome ");
        }
    }

    
}
