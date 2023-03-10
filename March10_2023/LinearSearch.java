package March10_2023;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); // 6
        int numbers [] = new int[size]; // {1,2,3,4,5,6}
        for(int i = 0; i < size; i++){
            numbers [i] = sc.nextInt(); 
        }
        int x = sc.nextInt(); // 4
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("x found at index :" + i); // x found at index : 3
            }
        }

    }
    
}
