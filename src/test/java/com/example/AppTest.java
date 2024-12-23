package com.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testGreet() {
        App app = new App();
        String result = app.greet("World");
        assertEquals("Hello, World!", result);
    }
}
