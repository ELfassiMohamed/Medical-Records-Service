package com.medical_service.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import com.medical_service.compenent.SimpleMath;

@SpringBootTest
public class SimpleMathTest {

    private final SimpleMath simpleMath = new SimpleMath();

    @Test
    public void testAdd() {
        assertEquals(5, simpleMath.add(2, 3));
        assertEquals(0, simpleMath.add(-1, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, simpleMath.multiply(2, 3));
        assertEquals(-4, simpleMath.multiply(2, -2));
    }

    @Test
    public void testIsEven() {
        assertTrue(simpleMath.isEven(4));
        assertFalse(simpleMath.isEven(3));
    }
}
