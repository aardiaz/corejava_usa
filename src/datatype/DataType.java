package datatype;

public class DataType {

    /*
       ================================================ Data Type ==================================================
          -> Data : raw facts
                     -> gives information
                           -> get knowledge

          ->
                Student :
                           id      = 67
                           name    = Ram,Hari,"23423sfsdf","djkfjd2332@gmail.com","audyytdutyduyfddhy","9876543234567"
                           age     = 20,12
                           college = NCC
                           height  = 5.5
                           gender  = 'M','F'
                           phone   = 987635465364

           ->
               1> proper data representation
               2> proper memory allocation
               3> proper operation to be perform

           -> Types :
               1>  Primitive Data Types :
                    a> byte   =>  -128  to +127
                    b> short  =>   2343,34545,56565,676767
                    c> int    =>   345353454,345354534544,456466556 (to represent whole numbers java takes int data type by default )
                    d> long   =>   345643213453,345646546556556,4575765766767
                    e> float  =>   1.3,23432.32434
                    f> double =>   342344343434.454545445445,4456456565756.56765765776 (default data type for decimal values)
                    g> char(Character)    =>  '@','+','m','f'
                    h> boolean => true/false(0/1)
               2> Non-primitive Data Types :
                    a> String
                    b> Array
                    c> Classes
                    d> Collections
                    e> Date
                    f> Enums

     */

    public static void main(String[] args) {

          long x = 600000000000l;
          float k = 2.5F;

          byte p = 40;

         System.out.println("byte ="+Byte.SIZE+" "+Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
        System.out.println("short ="+Short.SIZE+" "+Short.MIN_VALUE+" "+Short.MAX_VALUE);
        System.out.println("int ="+Integer.SIZE+" "+Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
    }
}
