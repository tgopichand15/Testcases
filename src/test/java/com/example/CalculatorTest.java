package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import com.example.TrignometricFunctions;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
//import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    Calculator c;

    @Mock
    TrignometricFunctions t;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        c=new Calculator(t);
        System.out.println( t);
    }

    @After
    public void tearDown() throws Exception {
        c=null;
    }

    @Test
    public void add_positiveInteres_RetunsCorrect() {
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

    @Test
    public void cosine_whenPositiveAngle_invokestf(){
        double expected=3353545;
        //this is way to to compare dummy value with caling value
        Mockito.when(t.cosine(0)).thenReturn(expected);
        double r=c.cosine(0);
        //verify method check if we are calling the method with same arguments as expected
        Mockito.verify(t, Mockito.times(1)).cosine(0);
        assertEquals(expected,r,0);
    }

    int[] a={1,2,3,4};

    @Test
    public void returnArray() {
        assertArrayEquals(a,c.returnArray(a));
    }


    //testing static method by directly calling classname.method
    @Test
    public void checkStaticMethod(){
        assertEquals(2,Calculator.static_addition(1,1));
    }

    //https://stackoverflow.com/questions/2469911/how-do-i-assert-my-exception-message-with-junit-test-annotation
    //check inject mocks for example aslo along with this

    //static mocking,inject mocks

}