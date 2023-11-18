package ru.spbstu.telematics.java;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

    @Test
    public void testCalculateScalarProduct() {
        // Тест на обычные векторы
        int[] vector1 = {5, 2};
        int[] vector2 = {4, -1};
        assertEquals(18, App.calculateScalarProduct(vector1, vector2));

        // Тест на векторы с нулевой длиной (должно быть 0)
        int[] emptyVector1 = {};
        int[] emptyVector2 = {};
        assertEquals(0, App.calculateScalarProduct(emptyVector1, emptyVector2));

        // Тест на векторы разной длины (должно бросить IllegalArgumentException)
        int[] unevenVector1 = {1, 2, 3};
        int[] unevenVector2 = {4, 5};
        try {
            App.calculateScalarProduct(unevenVector1, unevenVector2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Векторы должны иметь одинаковую длину"));
        }
    }
}
