package com.fizzBuzzTest;

import com.fizzBuzz.Main;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Jon on 02/12/2016.
 */
public class MainTest {

    @Before
    public void setUp() throws Exception {
        classUnderTest = new Main();
    }

    @Test
    public void fizzBuzzTest(){

        assertEquals("Fizzbuzz", classUnderTest.fizzBuzz(15));
        assertEquals("Buzz",     classUnderTest.fizzBuzz(5));
        assertEquals("Fizz",     classUnderTest.fizzBuzz(3));
        assertEquals(4,          classUnderTest.fizzBuzz(4));

    }
}