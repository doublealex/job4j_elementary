package condition;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To6Then6() {
        int result = Max.max(1, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax10To2Then10() {
        int result = Max.max(10, 2);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax4To4Then4() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }
}