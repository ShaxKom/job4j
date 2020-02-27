package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тест-класс для EndsWith.java
 */
public class EndsWithTest {

    @Test
    public void whenEndWithPostThenTrue(){
        char[] word = {'H','e','l','l','o'};
        char[] post = {'l','l','o'};
        boolean result = EndsWith.endsWith(word,post);
        assertThat(result,is(true));
    }

    @Test
    public void whenNotEndWithPostThenFalse(){
        char[] word = {'H','e','l','l','o'};
        char[] post = {'l','l','e'};
        boolean result = EndsWith.endsWith(word,post);
        assertThat(result,is(false));
    }

    @Test
    public void whenNotEndWithPostThenFalse1(){
        char[] word = {'H','e','l','l','o'};
        char[] post = {'o','l','l','o'};
        boolean result = EndsWith.endsWith(word,post);
        assertThat(result,is(false));
    }

}
