package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void checkGetSound() {
        String expected = "Мяу";

        Cat cat = new Cat(feline);
        String actual = cat.getSound();

        assertEquals(expected, actual);
    }

    @Test
    public void checkGetFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> list = cat.getFood();

        assertTrue(list.isEmpty());
    }
}
