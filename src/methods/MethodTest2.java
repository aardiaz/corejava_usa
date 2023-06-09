package methods;

public class MethodTest2 {

    public static void main(String[] args) {
        int area =  getArea(90,50);
          volume(area,10);
    }

     static int getArea(int l, int b){

           int area = l * b;
           return area;
      }

     static void volume(int area, int h){
         int v = area * h;
          System.out.println("Area = "+area);
          System.out.println("Volume = "+v);
      }

}
