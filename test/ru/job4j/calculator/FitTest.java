package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan184Then96() {
        short in = 184;
        double expected = 96.6;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double expected = 69.0;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenManHeight187ThenWeight10005() {
        short heightMan = 187;
        double expected = 100.05;
        double actual = Fit.manWeight(heightMan);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenWomanHeight170ThenWeight69() {
        short heightWoman = 170;
        double expected = 69.0;
        double actual = Fit.womanWeight(heightWoman);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenManHeight160ThenWeight69() {
        short heightMan = 160;
        double expected = 69.0;
        double actual = Fit.manWeight(heightMan);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenWomanHeight150ThenWeight46() {
        short heightWoman = 150;
        double expected = 46.0;
        double actual = Fit.womanWeight(heightWoman);
        Assert.assertEquals(expected, actual, 0.01);
    }
}