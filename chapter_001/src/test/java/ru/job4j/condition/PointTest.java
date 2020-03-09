package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(10, 30);
        Point b = new Point(20, 40);
        double expected = 14.14;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
