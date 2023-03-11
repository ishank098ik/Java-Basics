package March11_2023;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = i+1;
        int k = 0;
        int [] newArr = new int[size];
        Arrays.sort(arr);
        while(i < arr.length && j < arr.length && k < arr.length){

            if(arr[i] == arr[j]){
                newArr[k++] = arr[i];
                i = j+1;
                j = i+1;


            }
            else {
                newArr[k++] = arr[i];

                i++;
                j = i+1;
            }
        }
        while(i < arr.length){
            newArr[k++] = arr[i++];

        }
        System.out.println(k);
        for(int x = 0; x < newArr.length; x++){
            System.out.print(newArr[x] + " ");
        }
    }

    
}
