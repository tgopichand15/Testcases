package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Calculator.class)
public class CalculatorTest1 {

    Calculator c;

    @Mock
    TrignometricFunctions t;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        c=new Calculator(t);
        System.out.println(t);
    }

    @After
    public void tearDown() throws Exception {
        c=null;
    }


    @Test
    public void static_method_testing_withPowerMockito(){
        PowerMockito.mockStatic(Calculator.class);
        PowerMockito.when(Calculator.static_addition(1,1)).thenReturn(2);

        int a=Calculator.static_addition(1,1);
        //assertEquals(2,Calculator.static_addition(1,1));
        //PowerMockito.verifyStatic(Mockito.times(1));

        assertTrue(a==2);


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


    //example for static mocking
    //this is a way of testing static methods in dependent class this is rare  scenario mostly people dont use but keep in mind
    //here we have a static method in Trignometric function class and we cannot call that with object.method so we are using  classname.method name
    @Test
    public void testStatic(){
        int b=c.staticTestinDependentClass(1,1);
        assertEquals(2,b);
    }


    //static mocking,inject mocks

}