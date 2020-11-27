package condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void when40and4then64() {
        int expected = 64;
        int p = 40;
        int k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square() {
        int expected = 20;
        int p = 24;
        int k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}