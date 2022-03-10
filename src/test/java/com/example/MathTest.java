package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MathTest {
    static Math m;

    //test fixture
    @BeforeClass

    public static void setup(){
        m = new Math();
    }
    @Test
    public void testAdd() {
        assertEquals(3, m.add(1,2));

    }


    @Test
    public void testDivide() {
        double d = m.divide(6,2);  //real number in java is not supported, real number calculation is not completed in the computer world
        assertEquals(3, d, 0.01);    //delta =0.01 (tolerance )
    }
    @Test
    public void testMultiply() {
        assertEquals(6, m.multiply(3, 2));
    }
    @Test
    public void testSubstract() {
        assertEquals(0, m.substract(3, 3));
        
    }
}
