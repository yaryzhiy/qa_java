package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {

    private final String animalKind;
    private final List<String> expected;

    public AnimalParameterizedTest(String animalKind, List<String> expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getListData() {
        return new Object[][] {
                {"Травоядное", Arrays.asList("Трава", "Различные растения")},
                {"Хищник", Arrays.asList("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void checkGetFood() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood(animalKind);

        assertEquals(expected, actual);
    }
}
