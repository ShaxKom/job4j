package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue(){
        char[] word = {'H','e','l','l','o'};
        char[] pref = {'H','e'};
        boolean result = ArrayChar.startsWith(word,pref);
        assertThat(result,is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenTrue(){
        char[] word={'H','e','l','l','o'};
        char[] pref={'H','i'};
        boolean result = ArrayChar.startsWith(word,pref);
        assertThat(result,is(false));
    }
}
