package com.company;
import java.util.*;

public class nyobaTugas {
    Scanner greekz = new Scanner(System.in);
    private int sisi1;
    private int sisi2;

    void setSisi1() {
        this.sisi1 = greekz.nextInt();
    }
    void setSisi2() {
        this.sisi2 = greekz.nextInt();
    }

    public void hasil() {
        System.out.println("Luas Persegi yaitu : "+ sisi1 * sisi2);
    }
}

public class Main {
    public static void main(String[] args) {
        nyobaTugas tugasPersegi = new tugasPersegi();
        System.out.print("Sisi 1 : "); tugasPersegi.setSisi1();
        System.out.print("Sisi 2 : "); tugasPersegi.setSisi2();
        tugasPersegi.hasil();
    }
}

