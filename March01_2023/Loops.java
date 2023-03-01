package March01_2023;

public class Loops {
    public static void main(String[] args) {

        // for loop

        for(int counter = 0; counter < 3; counter = counter + 1)
        System.out.println("Hello World");

        // counter++ => counter = counter + 1
    
        for(int number = 0; number < 11; number++)
        System.out.println(number);

        // while loop

        int i = 0;
        while(i < 11){
            System.out.println(i);
            i = i + 1; // i++

        }

        // do while loop

        int a = 0;
        do{
            System.out.println(a);
            a++;
        } while (a < 11);

    }
    
}
