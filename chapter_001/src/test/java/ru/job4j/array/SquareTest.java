package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тест-класс для Square.java
 * @author Shakhzod Kamilov
 */
public class SquareTest {
   @Test
   public void whenBound3Then014() {
       int bound = 3;
       int[] result = Square.calculate(bound);
       int[] expect = new int[] {0, 1, 4};
       assertThat(result, is(expect));
   }

   @Test
    public void whenBound5Then014916() {
       int bound = 5;
       int[] result = Square.calculate(5);
       int[] expect = new int[]{0, 1, 4, 9, 16};
       assertThat(result, is(expect));
   }

}
