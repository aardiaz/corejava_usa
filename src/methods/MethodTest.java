package methods;

import java.util.Scanner;

public class MethodTest {
    public static void main(String[] args) {

          // sum();
         //printTable(45);
         // int   x = getSumOf1to100numbers();
        //  System.out.println("Sum of 100 nums = "+x);

          int sv = findSmallestValue(877678,900000);
         System.out.println("Smallest value  = "+sv);

    }

  //1.  no return type(void) with no arguments.
   static  void sum(){
        int a = 4343;
        int b = 5500;

        int s = a + b;
        System.out.println("Total = "+s);
    }

   //2. no return type  with arguments.

     static void printTable(int n){

           for (int i=1; i<=10; i++){
               System.out.println(n+" x "+i+" = "+(n*i));//23 x 1 = 23
           }
      }

      //3. return type(return value) with no arguments

      static   int getSumOf1to100numbers(){

                int s =  0;

                for(int i=1; i<=100; i++){
                    s = s + i;
                }

             return s;
        }

      //4. return type with arguments

     static int findSmallestValue(int x, int y){

                if(x < y){
                    return x;
                }
                return y;
      }

}
