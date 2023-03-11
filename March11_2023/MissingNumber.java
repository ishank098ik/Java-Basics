package March11_2023;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int [size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i+1){ // i != arr[i]-1
                System.out.print(i+1); // System.out.print(arr[i]-1);
                break;
            }
        }
        if(arr[size-1] == size){
            System.out.println(size+1);
        }
        
    }
    
}
