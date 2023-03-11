package March11_2023;

import java.util.*;

public class Duplicate_Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int [size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.println(arr[i]);
                System.out.print(arr[i]+1);
                break;
            }
        }
        
    }
    
}
