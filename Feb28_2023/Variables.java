public class Variables {
    public static void main(String[] args) {
        // Basic Variables
        // int i = 330000;
        // System.out.println(i);


        // short s = 32000;
        // System.out.println(s);

        // long l = 3000000;
        // System.out.println(l);

        // float f2 = 3.142356789f;
        // System.out.println(f2);

        // double d = 1.20414681697789742897897;
        // System.out.println(d);

        // char c1 = 'A', c2 = 'a', c3 = '@', c4 = '1';
        // System.out.println(c1 +" "+ c2 +" "+ c3 +" "+ c4);  // +" "+  String concatination

        // boolean b1 = true , b2 = false;
        // System.out.println(b1 +" abcd " );


         // int to long, float, double

          int num = 46;
          long numL = (long)num;
          System.out.println(" Long of num :"+ numL);

          float numF = (float)num;
          System.out.println(" Float of num " + numF);

          double numD = (double)num;
          System.out.println(" Double of num " + numD);

        //   long to int, float, double

          long num1 = 46656464;
          int numI1 = (int)num1;
          System.out.println(" Int of num1 :"+ numI1);

          float numF1 = (float)num1;
          System.out.println(" Float of num1 " + numF1);

          double numD1 = (double)num1;
          System.out.println(" Double of num1 " + numD1); 

          // float to int, long, double

          float num2 = 3.1234567f;
          long numL2 = (long)num2;
          System.out.println(" Long of num2 :"+ numL2);

          int numI2 = (int)num2;
          System.out.println(" Int of num2 " + numI2);

          double numD2 = (double)num2;
          System.out.println(" Double of num2 " + numD2);

          // double to int, long, float

          double num3 = 4.5454546444134468453645;
          long numL3 = (long)num3;
          System.out.println(" Long of num3 :"+ numL3);

          float numF3 = (float)num3;
          System.out.println(" Float of num3 " + numF3);

          int numI3 = (int)num3;
          System.out.println(" Int of num3 " + numI3);

          // Where conversions fails
          // When long / double value exceeds the range of int, float then it Either gives garbage values or give errors

          long num4 = Long.MAX_VALUE;
          int numI4 = (int)num4;
          System.out.println(" Int of num4 :"+ numI4);

          float numF4 = (float)num4;
          System.out.println(" Float of num4 " + numF4);

          double num5 = 400000000000.5454546444134468453645;
          float numF5 = (float)num5;
          System.out.println(" Float of num5 " + numF5);

          int numI5 = (int)num5;
          System.out.println(" Int of num5 " + numI5);
    }

    
}
