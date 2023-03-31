package com.comarch.akademia.it.enkapsulacja;

public class Square {
    int side;
    private int field;
    private int circle;

    public Square(int side) {
        this.side = side;
        this.field = side * side;
        this.circle = side * 4;
    }

    public Square() {
    }

    public int getSide() {
        return side;
    }

    public int getField() {
        return field;
    }

    public int getCircle() {
        return circle;
    }

    public void setSide(int side) {
        this.side = side;
        this.field = side * side;
        this.circle = side * 4;
    }

    public void wyliczCos() {
        krok1();
        krok2();
        krok3();
    }

    private void krok1() {
        //??
    }

    private void krok2() {
        //??
    }

    private void krok3() {
        //??
    }

    public boolean equals(Object obj) {
        if(obj instanceof Square) {
            return this.side == ((Square) obj).side;
        }

        return false;
    }
}
