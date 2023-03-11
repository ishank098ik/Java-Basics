package March10_2023;

public class FindMax2 {
    public static int max1(int [] arr){
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            // if(arr[i] > max){
            //     max = arr[i];
            // }
            maximum = Math.max(arr[i], maximum);
        }
        return maximum;
    }
    public static int max2(int [] arr){
        int firstMax = max1(arr);
        int maximum2 = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maximum2 && arr[i] != firstMax){
                maximum2 = arr[i];
            }
        }
        return maximum2;
    }
    public static int max3(int [] arr){
        int firstMax = max1(arr);
        int secondMax = max2(arr);
        int maximum3 = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maximum3 && arr[i] != secondMax && arr[i] != firstMax){
                maximum3 = arr[i];
            }
        }
        return maximum3;
    }
    public static void main(String[] args) {
        int num[] = {10,100,50,49,106,42,37,65,106};
        int firstMax = max1(num);
        int secondMax = max2(num);
        int thirdMax = max3(num);
        System.out.println(firstMax);
        System.out.println(secondMax);
        System.out.println(thirdMax);


    }
    
}
// {6,5,2,3,1,6}
//
