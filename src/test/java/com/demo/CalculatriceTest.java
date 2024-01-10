package com.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatriceTest {

    @Test
    public void testAdditionner() {
        int result = Calculatrice.additionner(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testAdditionnerDeuxAvecZero() {
        int result = Calculatrice.additionner(2, 0);
        assertEquals(2, result);
    }

    @Test
    public void testAdditionnerAvecNombresNegatifs() {
        int result = Calculatrice.additionner(-2, -4);
        assertEquals(-6, result);
    }

    @Test
    public void testSoustraire() {
        Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.soustraire(5, 2);
        assertEquals(3, result);
    }

    @Test
    public void testSoustraireAvecZero() {
        Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.soustraire(5, 0);
        assertEquals(5, result);
    }

    @Test
    public void testSoustraireAvecNombresNegatifs() {
        Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.soustraire(-5, -2);
        assertEquals(-3, result);
    }

    @Test
    public void testMultiplier() {
        Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.multiplier(4, 2);
        assertEquals(8, result);
    }

    @Test
    public void testMultiplierAvecZero() {
        Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.multiplier(4, 0);
        assertEquals(0, result);
    }

    @Test
    public void testMultiplierAvecNombresNegatifs() {
        Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.multiplier(-4, -2);
        assertEquals(8, result);
    }

    @Test
    public void testDiviser() {
        Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.diviser(10, 2);
        assertEquals(5, result);
    }

    @Test
    public void testDiviserByZero() {
        Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.diviser(10, 0);
        assertEquals(0, result);
    }

    @Test
    public void testMaxWithMixedNumbers() {
        Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.max(-5, 8);
        assertEquals(8, result);
    }

    @Test
    public void testMaxWithEqualNumbers() {
        Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.max(5, 5);
        assertEquals(5, result);
    }

    @Test
    public void testMaxWithZero() {
        Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.max(5, 0);
        assertEquals(5, result);
    }

    @Test
    public void testMaxWithNombresNegatifs() {
        Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.max(-5, -2);
        assertEquals(-2, result);
    }

    @Test
    public void testMaxWithMemesNombres() {
        Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.max(5, 5);
        assertEquals(5, result);
    }

}
