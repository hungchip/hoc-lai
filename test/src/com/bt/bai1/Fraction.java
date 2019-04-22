package com.bt.bai1;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this.numerator = 0;
        if (this.denominator == 0) {
            this.denominator = 1;
        }
        this.denominator = 1;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void summary(Fraction fraction1, Fraction fraction) {
        int mausochung = fraction.denominator * fraction1.denominator;
        int tuso = fraction1.numerator * fraction.denominator + fraction1.denominator * fraction.numerator;
        Fraction f = new Fraction(tuso, mausochung);
        f.outputFraction();
    }

    public void subtract(Fraction fraction1, Fraction fraction) {
        int mausochung = fraction.denominator * fraction1.denominator;
        int tuso = fraction1.numerator * fraction.denominator - fraction1.denominator * fraction.numerator;
        Fraction f = new Fraction(tuso, mausochung);
        f.outputFraction();
    }

    public void mutiply(Fraction fraction1, Fraction fraction) {
        int ms = fraction1.denominator * fraction.denominator;
        int ts = fraction1.numerator * fraction.numerator;
        Fraction f = new Fraction(ts, ms);
        f.outputFraction();
    }

    public void divide(Fraction fraction1, Fraction fraction) {
        if (fraction1.denominator ==0 || fraction.denominator == 0){
            System.out.println("ko the thuc hien phep chia");
        }else {
            int ts = fraction1.numerator * fraction.denominator;
            int ms = fraction.numerator * fraction1.denominator;
            Fraction f = new Fraction(ts,ms);
            f.outputFraction();
        }
    }

    public Fraction reduce(Fraction fraction) {
        int x = findUCLN(fraction.numerator, fraction.denominator);
        this.numerator = this.numerator / x;
        this.denominator = this.denominator / x;
        return fraction;
    }

    static int findUCLN(int a, int b) {
        while (a != b)
            if (a > b) a = a - b;
            else b = b - a;
        return a;
    }

    public void inputFraction() {
        System.out.println("Nhap tu so: ");
        this.numerator = new Scanner(System.in).nextInt();
        System.out.println("Nhap mau so: ");
        this.denominator = new Scanner(System.in).nextInt();
    }

    public void outputFraction() {
        System.out.println("phan so = " + this.numerator + "/" + this.denominator);
    }
}
