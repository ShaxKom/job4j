package ru.job4j.condition;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

/**
 * Тест-класс для Triangle.java и TrgArea.java
 * @author Shakhzod Kamilov
 * @version 2
 */
public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2, 2, 2);
        assertThat(result, is(true));
    }
    @Test
    public void whenNotExist() {
        boolean result = Triangle.exist(3, 2, 7);
        assertThat(result, is(false));
    }

    @Test
    public void triangleArea() {
        Point a1 = new Point(1, 1);
        Point b1 = new Point(2, 5);
        Point c1 = new Point(5, 3);
        TrgArea trg = new TrgArea(a1, b1, c1);
        assertEquals(7, trg.area(), 0.01);
    }
    @Test
    public void triangleArea1() {
        Point a1 = new Point(0, 0);
        Point b1 = new Point(3, 2);
        Point c1 = new Point(7, 5);
        TrgArea trg = new TrgArea(a1, b1, c1);
        assertEquals(0.5, trg.area(), 0.01);
    }

    @Test
    public void triangleAreaWhenDoesNotExist() {
        Point a1 = new Point(0, 2);
        Point b1 = new Point(2, 4);
        Point c1 = new Point(4, 6);
        TrgArea trg = new TrgArea(a1, b1, c1);
        assertEquals(-1, trg.area(), 0.01);
    }
}
