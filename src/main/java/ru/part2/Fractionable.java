package ru.part2;

public interface Fractionable {

    @Cache
    double doubleValue();

    @Mutator
    void setNum(int num);

    @Mutator
    void setDenum(int denum);

    int getCountTest();
}
