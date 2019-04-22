package com.bt.bai1;

public class Test {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(9,3);
        fraction.reduce(fraction);
        fraction.outputFraction();

        Fraction fraction1 = new Fraction(11,23);
        Fraction fraction2 = new Fraction(3,2);
        fraction.summary(fraction1,fraction2);
        fraction.subtract(fraction1,fraction2);
        fraction.mutiply(fraction1,fraction2);
        fraction.divide(fraction1,fraction2);

    }
}
