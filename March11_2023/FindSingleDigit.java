package March11_2023;

import java.util.Scanner;

public class FindSingleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int i = 0;
        while(i < arr.length-1){
            if(arr[i] != arr[i+1]){
                System.out.print(arr[i]);
                break;
            } else{
                i += 2;
            }
        }
        if(i == arr.length-1){
            System.out.print(arr[i]);
        }
    }
    
}
