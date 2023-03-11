package March11_2023;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int t = sc.nextInt();
        int i = 0;
        int j = arr.length-1;
        boolean flag = false;
        while(i < j){
            if(t == arr[i] + arr[j]){
                System.out.print(arr[i] + " " + arr[j]);
                flag = true;
                break;
            } else if (t < arr[i] + arr[j]){
                j--;
            } else {
                i++;
            }
        }
        if(flag == false){
        System.out.print("NOT FOUND");
        }
    }
    
}
