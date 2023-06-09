package array;

import java.util.Scanner;

public class MulitDArray {

    /*
       ==================== MultiDArray =====================
       # use to represent data in matrix/table/row and col form.

       syntax :
            data_type  array_name[][] = new data_type[row_size][col_size];

     */

    public static void main(String[] args) {

             int mat[][] = new int[2][2];

             /*     C0 C1
                 R0 [50][70]
                 R1 [90][66]
              */

//              mat[0][0] = 50;
//              mat[0][1]  = 70;
//              mat[1][0]  = 90;
//              mat[1][1] = 66;

        //write data in multiDArray

          int a; // 4 bytes = 10 x 4 = 40

        Scanner  sc = new Scanner(System.in);

        for (int i=0; i<2; i++){
               for (int j=0; j<2; j++){
                   System.out.println("Enter value for mat ");
                   mat[i][j]= sc.nextInt();
               }
        }

        //read data from MultiDArray
        for (int i=0; i<2; i++){

              for (int j=0; j<2; j++){
                  System.out.print(mat[i][j]+" ");
              }
            System.out.println();
        }





    }
}
