package com.suyue.introductory;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
* FizzBuzz Tester.
*
* @author <Authors name>
* @version 1.0
*/
public class FizzBuzzTest {
    FizzBuzz fizzBuzz;
@Before
public void before() throws Exception {
    fizzBuzz = new FizzBuzz();
}

@After
public void after() throws Exception {
}

/**
* Method: printFizzBuzz(int start, int end)
*/
@Test
public void testPrintFizzBuzz() throws Exception {
    System.out.println("print FizzBuzz");
    fizzBuzz.printFizzBuzz(1, 100);
}


}
