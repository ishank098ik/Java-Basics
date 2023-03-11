package March10_2023;

import java.util.Scanner;

public class RunningSum {
    public static int[] runningSum(int nums[]){
       int [] arr =  new int[nums.length];
       arr[0] = nums[0];
       for(int i = 1; i < nums.length; i++){
        arr[i] = arr[i-1] + nums[i]; 
       }
       return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size]; 
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();

        }
        int arr[] = runningSum(nums);
        for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}
    
}
