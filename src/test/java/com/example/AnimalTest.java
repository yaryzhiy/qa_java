package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test(expected = Exception.class)
    public void checkGetFoodException() throws Exception {
        String animalKind = "Зверь";

        Animal animal = new Animal();
        animal.getFood(animalKind);
    }

    @Test
    public void checkGetFamily() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

        Animal animal = new Animal();
        String actual = animal.getFamily();

        assertEquals(expected, actual);
    }
}
