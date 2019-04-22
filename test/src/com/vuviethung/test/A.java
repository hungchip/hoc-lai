package com.vuviethung.test;

public class A {
    private String name;
    private int old;
    private static String school = "NN";

    public A(String name, int old) {
        this.name = name;
        this.old = old;
    }

    public A(){
        this.name = "";
        this.old = 0;
    }

    public static A a;

    public A getA(){
        a = new A();
        return a;
    }
    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public static void setSchool(String school) {
        A.school = school;
    }

    public static String getSchool() {
        return school;
    }

    public static void change(){
        A.school = "Yen Vien";
    }
}
