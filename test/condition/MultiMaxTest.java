package condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(5, 2, 1);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(11, 26, 5);
        assertThat(result, is(26));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 4, 22);
        assertThat(result, is(22));
    }

    @Test
    public void whenAllMaxEquals() {
        int result = MultiMax.max(4, 4, 4);
        assertThat(result, is(4));
    }
}