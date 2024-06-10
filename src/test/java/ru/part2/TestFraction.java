package ru.part2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFraction {

    @Test
    public void TestFractionCache() {
        Fractionable f1 = new Fraction(1,2);
        f1 = Utils.cache(f1);
        Assertions.assertEquals(0, f1.getCountTest());
        Assertions.assertEquals(0.5, f1.doubleValue());
        Assertions.assertEquals(1, f1.getCountTest());
        Assertions.assertEquals(0.5, f1.doubleValue());
        Assertions.assertEquals(1, f1.getCountTest());

        f1.setDenum(4);
        Assertions.assertEquals(0.25, f1.doubleValue());
        Assertions.assertEquals(1, f1.getCountTest());
        Assertions.assertEquals(0.25, f1.doubleValue());
        Assertions.assertEquals(1, f1.getCountTest());
        Assertions.assertEquals(0.25, f1.doubleValue());
        Assertions.assertEquals(1, f1.getCountTest());

        f1.setNum(8);
        Assertions.assertEquals(2, f1.doubleValue());
        Assertions.assertEquals(1, f1.getCountTest());
        Assertions.assertEquals(2, f1.doubleValue());
        Assertions.assertEquals(1, f1.getCountTest());
        Assertions.assertEquals(2, f1.doubleValue());
        Assertions.assertEquals(1, f1.getCountTest());

        f1.setNum(9);
        f1.setDenum(3);
        Assertions.assertEquals(3, f1.doubleValue());
        Assertions.assertEquals(1, f1.getCountTest());
        Assertions.assertEquals(3, f1.doubleValue());
        Assertions.assertEquals(1, f1.getCountTest());
        Assertions.assertEquals(3, f1.doubleValue());
        Assertions.assertEquals(1, f1.getCountTest());
    }
}
