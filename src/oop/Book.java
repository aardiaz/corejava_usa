package oop;

import java.util.Scanner;

public class Book {

    //properties
        int id;
        String name;
        String author;
        int price;

    //method
    void printBookInfo(){
        System.out.println("Id = "+id);
        System.out.println("Name = "+name);
        System.out.println("Author = "+author);
        System.out.println("Price = "+price);
    }
}
