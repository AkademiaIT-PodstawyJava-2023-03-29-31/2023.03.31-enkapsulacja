package com.comarch.akademia.it;

import com.comarch.akademia.it.enkapsulacja.Square;

public class App {
    public static void main(String[] args) {
        int i = 5;
        int j = 5;

        Square square1 = new Square(5);
        Square square2 = new Square(5);

        System.out.println(i == j);
        System.out.println(square1 == square2);

        System.out.println(square1.equals(square2));

        String s1 = new String("ABC");
        String s2 = "ABC";

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        String s3 = "ABC";
        String s4 = s3;
        s3 = s3 + "OK";
        System.out.println(s3);
        System.out.println(s4);
    }
}
