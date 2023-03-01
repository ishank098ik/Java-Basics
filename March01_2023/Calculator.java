package March01_2023;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operation = sc.next().charAt(0);
        // switch(operation) {
        //     case  : System.out.println(a + b);
        //     break;
        //     case 2 : System.out.println(a - b);
        //     break;
        //     case 3 : System.out.println(a * b);
        //     break;
        //     case 4 : System.out.println(a / b);
        //     break;
        //     case 5 : System.out.println(a % b);
        //     break;
        // }
        if (operation == '+'){
            System.out.println(a + b);
        } else if (operation == '-'){
            System.out.println(a - b);
        } else if (operation == '*'){
            System.out.println(a * b);
        } else if (operation == '/'){
            if(b == 0){
                System.out.println("Undefined");
            } else
            System.out.println(a / b);
        } else if (operation == '%'){
            System.out.println(a % b);
        } else {
            System.out.println("Invalid");
        }

    }
    
}
// 