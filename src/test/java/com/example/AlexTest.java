package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlexTest {

    @Test
    public void checkAlexSex() throws Exception {
        boolean expected = true;

        Alex alex = new Alex();

        assertEquals(expected, alex.hasMane);
    }

    @Test
    public void checkGetKittens() throws Exception {
        int expected = 0;

        Alex alex = new Alex();
        int actual = alex.getKittens();

        assertEquals(expected, actual);
    }

    @Test
    public void checkGetFriends() throws Exception {
        List<String> expected = Arrays.asList("Марти", "Глория", "Мелман");

        Alex alex = new Alex();
        List<String> actual = alex.getFriends();

        assertEquals(expected, actual);
    }

    @Test
    public void checkGetPlaceOfLiving() throws Exception {
        String expected = "Нью-Йоркский зоопарк";

        Alex alex = new Alex();
        String actual = alex.getPlaceOfLiving();

        assertEquals(expected, actual);
    }
}
