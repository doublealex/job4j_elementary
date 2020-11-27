package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert0() {
        int in = 0;
        int expected = 0;
        int out = in;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert140rblThen2Euro() {
        int in1 = 140;
        int expected1 = 2;
        int out1 = Converter.rubleToEuro(in1);
        Assert.assertEquals(expected1, out1);
    }

    @Test
    public void whenConvert100euroThen7000Rubles() {
        int in2 = 100;
        int expected2 = 7000;
        int out2 = Converter.euroToRuble(in2);
        Assert.assertEquals(expected2, out2);
    }

    @Test
    public void whenConvert50dollarsThen3000Rubles() {
        int in3 = 50;
        int expected3 = 3000;
        int out3 = Converter.dollarToRuble(in3);
        Assert.assertEquals(expected3, out3);
    }

    @Test
    public void whenConvert30000RblThen500Dlr() {
        int in4 = 30000;
        int expected4 = 500;
        int out4 = Converter.rubleToDollar(in4);
        Assert.assertEquals(expected4, out4);
    }
}