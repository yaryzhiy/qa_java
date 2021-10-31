package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test(expected = Exception.class)
    public void checkLionException() throws Exception {
        String sex = "Нечто";
        Lion lion = new Lion(sex, feline);
    }

    @Test
    public void checkGetKittens() throws Exception {
        int expected = 1;
        String sex = "Самец";

        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        int actual = lion.getKittens();

        assertEquals(expected, actual);
    }

    @Test
    public void checkDoesHaveMane() throws Exception {
        String sex = "Самец";

        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();

        assertTrue(actual);
    }

    @Test
    public void checkGetFood() throws Exception {
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        String sex = "Самец";

        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        List<String> actual = lion.getFood();

        assertEquals(expected, actual);
    }
}

