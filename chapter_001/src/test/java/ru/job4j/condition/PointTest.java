package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

/**
 * Тест-класс для Point.java
 */
public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(10, 30);
        Point b = new Point(20, 40);
        double expected = 14.14;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(3, 3, 3);
        double expected = 5.19;
        double out = a.distance3d(b);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void distance3d2() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(6, 6, 6);
        double expected = 8.66;
        double out = a.distance3d(b);
        Assert.assertEquals(out, expected, 0.01);
    }
}
