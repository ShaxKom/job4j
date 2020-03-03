package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * Тест-класс для Defragment.java
 * @author Shakhzod Kamilov
 * @version 1
 */
public class DefragmentTest {
    @Test
    public void singleFirstNull(){
        String[] input = {null,"I"};
        String[] result = Defragment.compress(input);
        String[] expect = {"I",null};
        assertThat(result,is(expect));
    }
    @Test
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void notAllNull() {
        String[] input = {null, null, null};
        String[] compressed = Defragment.compress(input);
        String[] expected = {null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void notAllAtFirstNull() {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }
}
