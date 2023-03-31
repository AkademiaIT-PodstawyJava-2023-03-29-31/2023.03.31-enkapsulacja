package com.comarch.akademia.it.enkapsulacja;

public class App {
    public static void main(String[] args) {
        Square square = new Square(10);

        System.out.println(square.getSide());
        System.out.println(square.getField());
        System.out.println(square.getCircle());

        /*square.side = 5;
        square.field = 25;
        square.circle = 20;*/
        square.setSide(5);

        System.out.println(square.getSide());
        System.out.println(square.getField());
        System.out.println(square.getCircle());


        /*square.side = 5;
        square.field = 25;
        square.circle = 20;*/
        square.setSide(5);



        /*square.side = 5;
        square.field = 25;
        square.circle = 20;*/
        square.setSide(5);

        /*square.side = 5;
        square.field = 25;
        square.circle = 20;*/
        square.setSide(5);
/*
        square.side = 5;
        square.field = 25;
        square.circle = 20;*/
        square.setSide(5);

        square.side = 10;
    }
}
