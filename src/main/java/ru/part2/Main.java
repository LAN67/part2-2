package ru.part2;

public class Main {
    public static void main(String[] args) {
        Fractionable f1 = new Fraction(1,3);
        f1 = Utils.cache(f1);
        System.out.println(f1.getCountTest());
        System.out.println(f1.doubleValue());
        System.out.println(f1.getCountTest());
        System.out.println(f1.doubleValue());
        System.out.println(f1.getCountTest());
        f1.setDenum(4);
        System.out.println(f1.getCountTest());
        System.out.println(f1.doubleValue());
        System.out.println(f1.getCountTest());
        System.out.println(f1.doubleValue());
        System.out.println(f1.getCountTest());
        System.out.println(f1.doubleValue());
        System.out.println(f1.getCountTest());

    }
}
