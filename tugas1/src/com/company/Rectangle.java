package com.company;

import java.util.*;

public class Rectangle {
    Scanner gekyume = new Scanner(System.in);
    private int side1;
    private int side2;

    void setSisi1() {
        this.side1 = gekyume.nextInt();
    }

    void setSisi2() {
        this.side2 = gekyume.nextInt();
    }

    public void hasil() {
        System.out.println("Luasnya : "+ side1 * side2);
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle Rectangle = new Rectangle();

        System.out.print("Side 1 : "); Rectangle.setSisi1();
        System.out.print("Side 2 : "); Rectangle.setSisi2();

        Rectangle.hasil();
    }
}

