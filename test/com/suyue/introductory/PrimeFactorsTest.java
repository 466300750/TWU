package com.suyue.introductory;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.List;

/**
* PrimeFactors Tester.
*
* @author <Authors name>
* @version 1.0
*/
public class PrimeFactorsTest {
    PrimeFactors primeFactors;
@Before
public void before() throws Exception {
    primeFactors = new PrimeFactors();
}

@After
public void after() throws Exception {
}

/**
* Method: generate(int n)
*/
@Test
public void testGenerate() throws Exception {
    List<Integer> list = primeFactors.generate(30);
    for (int x : list) {
        System.out.println(x);
    }
}


}
