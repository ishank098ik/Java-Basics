package March02_2023;

import javax.annotation.processing.SupportedOptions;

class Operators {
    public static void main(String[] args) {
            // UNARY OPERATOR
            // Increment(++) and Decrement (--) 

            // int a = 10;
            // System.out.println(++a); // 11
            // System.out.println(++a); // 12
            // a++;      
            // System.out.println(a++); // 13
            // System.out.println(a);   // 14
            // System.out.println(--a); // 13
            // System.out.println(a--); // 13
            // --a;
            // System.out.println(a);  // 11

            // Negation(~) = If integer is positive, ~ will make the number negative and will also decrement 
            //               If integer is negative, ~ will make the number positive and will also decrement 


            // int a = 44;
            // System.out.println(~a); // -45
            // int b = -6;
            // System.out.println(~b); // 5

            // NOT (!)

            // boolean a = true;
            // System.out.println(!a); // false
            // boolean b = false;
            // System.out.println(!b); // true

            // ARITHMETIC OPERATOR

            // int a = 3;
            // int b = 21;
            // // BODMAS = Bracket of Division, multiplication, addition, subtraction
            // System.out.println(a * ( b + a ) - b / a); // 65

            // LOGICAL OPERATOR (AND)

            // int a = 55;
            // int b = 65;
            // System.out.println(a > b && b < a); // false && false = false
            // System.out.println(a > b && b > a); // false && true = false 
            // System.out.println(a < b && b < a); // true && false = false
            // System.out.println(a + b == 120 && b > a); // true && true == true


            // LOGICAL OPERATOR (OR)

            // int a = 23;
            // int b = 23;
            // System.out.println(a + b == 100 || b * a == 70); // false || false = false
            // System.out.println(a != b || b == a); // false || true = true
            // System.out.println(a - b == 0 || b == 44); // true || false = true
            // System.out.println(a >= b|| b >= a); // true || true = true            

            // TERNARY OPERATOR

            // int a = 65;
            // int b = 56;
            // int c = a < b ? a : b;
            // System.out.println(c); // 56

            // ASSIGNMENT OPERATOR

            // int a = 5;
            // int b = 8;
            // a += b;
            // System.out.println(a); // 13
            // a -= b;
            // System.out.println(a); // 5
            // a *= b;
            // System.out.println(a); // 40
            // a /= b;
            // System.out.println(a); // 5   
            // System.out.println(b % a); // 3


    }
}