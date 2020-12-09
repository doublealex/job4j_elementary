package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas20Then6() {
        int[] input = {0, 2, 4, 8, 12, 16, 20};
        int value = 20;
        int result = FindLoop.indexOf(input, value);
        int expect = 6;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas74ThenFalse() {
        int[] input = {5, 4, 3, 2, 6, 10, 15};
        int value = 74;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}