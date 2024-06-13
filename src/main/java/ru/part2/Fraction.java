package ru.part2;

public class Fraction implements Fractionable{
    private int num;
    private int denum;
    int counttest = 0;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
        counttest = 0;
    }

    @Mutator
    public void setNum(int num) {
        this.num = num;
        counttest = 0;
    }

    @Mutator
    public void setDenum(int denum) {
        this.denum = denum;
        counttest = 0;
    }

    @Cache
    public double doubleValue(){
        counttest++;
        return (double) num/denum;
    }

    @Override
    public int getCountTest() {
        return counttest;
    }
}
