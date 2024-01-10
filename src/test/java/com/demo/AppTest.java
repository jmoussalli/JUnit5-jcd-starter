package com.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest
{
    @Test
    public void testSayHello(){
        assertEquals("Hello", App.sayHello());
    }
}
