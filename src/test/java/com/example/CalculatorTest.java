package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import com.example.TrignometricFunctions;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator c;

    @Mock
    TrignometricFunctions t;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        c=new Calculator(t);
    }

    @After
    public void tearDown() throws Exception {
        c=null;
    }

    @Test
    public void add() {
        assertEquals(2,c.add(1,1));
    }

    @Test
    public void sub() {
        assertEquals(3,c.sub(5,2));
    }

    @Test
    public void mul() {
        assertTrue(c.mul(1,2) == 2);
    }

    @Test
    public void div() {
        assertEquals(2,c.div(4,2));
    }

    int[] a={1,2,3,4};

    @Test
    public void returnArray() {
        assertArrayEquals(a,c.returnArray(a));
    }

}