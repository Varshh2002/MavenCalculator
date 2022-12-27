package com.xxy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test1(){
        assertEquals(10, App.addition(5, 5));
    }
    
    @Test
    public void test2(){
        assertEquals(0, App.subtraction(5, 5));
    }


    @Test
    public void test3(){
        assertEquals(25, App.multiplication(5, 5));
    }


    @Test
    public void test4(){
        assertEquals(1, App.division(5, 5));
    }
}
