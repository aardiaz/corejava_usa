package looping;

public class DoWhile {

        /*
            ===================== do-while =====================
              # post iteration

              syntax
                do{

                        //statement

                        //inc/dec
                }while(condition);

         */

    public static void main(String[] args) {

       /*
            6 x 1 = 6
            6 x 2 = 12
            ............
            ............
            ............
            6 x 10  = 60
        */


            int n = 65435;

            int i = 1;

            do{

                System.out.println(n+" x "+i+" = "+(n*i));

                i++;
            }while (i<=10);


    }

}
