package array;

import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args) {

        //create array
        int age[] = new int[5];
        /*    0     1   2   3  4
              [22][20][12][22][18]
              <--age-->
         */

        //write data in array

        Scanner  sc = new Scanner(System.in);

          for(int i=0; i<age.length; i++){

              System.out.println("Enter your age");
              age[i] = sc.nextInt();
          }


        //read data from array
        for(int x : age) {
            System.out.println(x);

        }

//        for(int i=0;  i<age.length; i++){
//
//            System.out.println(age[i]);
//        }


        /*
          Q>  WAP to calculate total and average price of 10 books.

          Q>  Subject          Marks
              -------         -------
              Math              99
              English           90
              ....              ..
              .....             ..
              ....              ...
          ----------------------------
            Total        =      ?
            Percent      =      ?
          -----------------------------

         */
    }
}
