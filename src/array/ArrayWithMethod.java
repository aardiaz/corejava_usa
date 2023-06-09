package array;

import java.util.Arrays;

public class ArrayWithMethod {
    /*
        ==================== Array with method ============================

          a> array as argument :

               void sum(int array[]){

               }

          b> array as return type :

              int[] get10intValues(){

                  // array =  90,69,79,44,55,6,7;

                 return array;
              }

     */

    public static void main(String[] args) {

       int data[]  =  {9,876,5,43,45,678,6,54,32,34,567,876,54};
        sum(data);

      int[]   evns  = get10EvenNumbers();
        System.out.println(Arrays.toString(evns));
    }

    //=================== array as arguments ==============================
    static  void sum(int array[]){

           int s = 0;

          for(int x : array){
              s = s + x;
          }

        System.out.println("Total = "+s);
    }

    //============================ array as return type  ==========================

      static int[] get10EvenNumbers(){

             int  evens[] = {2,4,6,8,10,28,88,24,48,66};

             return evens;
       }

       /*
          Q>  WAP to get odd numbers between 1 to 100 using method.
        */
}
