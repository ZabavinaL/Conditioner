package ru.netology.domain.field;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {

    // Удостоверимся, что при создании объекта поля, для которого
    // указаны инициализаторы, действительно проинициализированы в ненулевые значения

    @Test
    public void shouldInitFields() {
        Conditioner conditioner = new Conditioner();

        assertEquals("noname", conditioner.getName());
        assertEquals(30, conditioner.getMaxTemperature());
        assertEquals(15, conditioner.getMinTemperature());
        assertEquals(22, conditioner.getCurrentTemperature());
    }
}
