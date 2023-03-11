package March10_2023;

import java.util.Scanner;

public class LinearSearch {

  public static boolean linear(int[] arr, int x) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        return true;
      }
    }
    return false;
  }

  public static void linear2(int[] arr, int x) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        System.out.println(x + " found at index " + i);
        // break;
      }
    }
  }

  public static int kthOccurenceIndex(int[] arr, int num, int k) {
        int i = 0;
        // if(k == 0){
        //     return i;
        // }
        while (k > 0 && i < arr.length) {

        if (arr[i] == num) {
            k--;
        }
        if(k == 0){
            return i;
        }
        i++;
      }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt(); // 6
    // int numbers [] = new int[size]; // {1,2,3,4,5,6}
    int nums2[] = { 3, 7, 6, 9, 5, 6, 2, 0, 1, 6, 4, 6 };
    // for(int i = 0; i < size; i++){
    // numbers [i] = sc.nextInt();
    // }
    // int x = sc.nextInt(); // 4
    // boolean ans = linear(numbers,x);
    // System.out.println(ans);
    // linear2(nums2, 6);
    int index = kthOccurenceIndex(nums2, 6, 3);
    System.out.println(index);
  }
}
