package array;

import java.util.Scanner;

public class ArrayTest4 {

    public static void main(String[] args) {

        String[]   subjects = {"Nepali","Math","English","Science","Computer"};
        int[] marks  =  {90,80,70,60,50};

//        Scanner  sc = new Scanner(System.in);
//
//        for (int i=0; i<marks.length; i++){
//            System.out.println("Enter marks of "+subjects[i]);
//            marks[i] = sc.nextInt();
//        }

        int total = 0;
        System.out.println("Subject\t\tMarks");
        System.out.println("-----\t\t-----");

        int i=0;
        for(int  x : marks){

            System.out.println(subjects[i]+"\t\t"+x);
            i++;
           total = total + x;
        }

//          for (int i=0; i<marks.length; i++){
//              System.out.println(subjects[i]+"\t\t"+marks[i]);
//              total = total + marks[i];
//          }

        System.out.println("-------------------------------");
        System.out.println("Total Marks = "+total);
        System.out.println("Percentage = "+total/5 +"%");
        System.out.println("----------------------------------");

    }
}
