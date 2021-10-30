package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void checkEatMeat() throws Exception {
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");

        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();

        assertEquals(expected, actual);
    }

    @Test
    public void checkGetFamily() {
        String expected = "Кошачьи";

        Feline feline = new Feline();
        String actual = feline.getFamily();

        assertEquals(expected, actual);
    }

    @Test
    public void checkGetKittens() {
        int expected = 1;

        Feline feline = new Feline();
        int actual = feline.getKittens();

        assertEquals(expected, actual);
    }

    @Test
    public void checkGetKittensWithParam() {
        int expected = 3;
        int kittensCount = 3;

        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);

        assertEquals(expected, actual);
    }
}
