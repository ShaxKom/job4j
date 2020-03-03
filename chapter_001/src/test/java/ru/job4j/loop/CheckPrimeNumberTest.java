package ru.job4j.loop;

/**
 *  Тест-класс для проверки простых чисел
 * @author Shakhzod Kamilov
 * @version 1
 */

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when8() {
        boolean rsl = CheckPrimeNumber.check(8);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }

    @Test
    public void when13() {
        boolean rsl = CheckPrimeNumber.check(13);
        assertThat(rsl, is(true));
    }
}
