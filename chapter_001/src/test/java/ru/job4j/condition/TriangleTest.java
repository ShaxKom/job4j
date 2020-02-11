package ru.job4j.condition;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TriangleTest {
    @Test
    public void whenExist(){
        boolean result = Triangle.exist(2,2,2);
        assertThat(result,is(true));
    }
    @Test
    public void whenNotExist(){
        boolean result = Triangle.exist(3,2,7);
        assertThat(result,is(false));
    }

}
