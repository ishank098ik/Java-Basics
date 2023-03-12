package March12_2023;

import java.util.*;

public class TwoPointers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int [size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int t = sc.nextInt();
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end)/2;
        boolean flag = false;
        while(start <= end){
            if(arr[mid] == t){
                System.out.print("t found at index :" + mid);
                flag = true;
                break;
            } else if
                (arr[mid] < t);
              else{
                    end = (mid-1);
                }
            if(flag == false){
                System.out.print(" NOT FOUND ");
                break;
            } 
        }
    }
    
}
