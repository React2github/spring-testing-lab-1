package com.example.Spring.lab1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringControllerUnitTest {

    @Test
    void mixedCaseReverse() {
        StringController stringController = new StringController();
        String hello = "Hello";
        assertEquals("olleH", stringController.createReverseString(hello));
    }

    @Test
    void upperCaseReverse() {
        StringController stringController = new StringController();
        String hello = "HELLO";
        assertEquals("OLLEH", stringController.createReverseString(hello));
    }

    @Test
    void lowerCaseReverse() {
        StringController stringController = new StringController();
        String hello = "hello";
        assertEquals("olleh", stringController.createReverseString(hello));
    }

    @Test
    void spacesReverse() {
        StringController stringController = new StringController();
        String hello = "rom rom";
        assertEquals("mor mor", stringController.createReverseString(hello));
    }

    @Test
    void numbersAndWordsReverse() {
        StringController stringController = new StringController();
        String hello = "1w2w2w3";
        assertEquals("3w2w2w1", stringController.createReverseString(hello));
    }
}