package March11_2023;

import java.util.Scanner;

public class CheckSorted {
    public static boolean arraySortedOrNot(int [] arr) {
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int nums[] = new int[size];
       for(int i = 0; i < size; i++){
        nums[i] = sc.nextInt();
       
       }
       boolean ans = arraySortedOrNot(nums);
       System.out.print(ans + " ");
       
    }
    
}
