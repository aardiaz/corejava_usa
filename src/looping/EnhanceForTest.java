package looping;

public class EnhanceForTest {

    /*
        ============================ Enhance For loop / forEach loop =========================
        # use to read data from collection(array,list,set,map etc...).

        syntax :
           for(data_type   var : collection){

                 //statements
           }

     */

    public static void main(String[] args) {

        int array[] =  {9,87,65,43,21,234,56,78,765,43,234,56,7};

          int s = 0;
        for (int x : array ){

            System.out.println(x);
            s = s + x;
        }

        System.out.println("Total = "+s);

    }
}
