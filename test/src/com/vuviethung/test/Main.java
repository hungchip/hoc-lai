package com.vuviethung.test;

public class Main {

    public static void main(String[] args) {
        A a = new A("Hung Chip",10);

        //a.setName("Vu Viet Hung");
        System.out.println(a.getName() + a.getOld() + " " + A.getSchool());
        A.change();
        System.out.println();
        System.out.println(a.getName() + " " + a.getOld() + " " + A.getSchool());
    }
    static {
          int b = 6;
        System.out.println("day la khoi static");
    }
}
