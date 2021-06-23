package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void convertToKilograms() {
        assertEquals(0.9979032140000001, Main.convertToKilograms(2.2));
    }
}