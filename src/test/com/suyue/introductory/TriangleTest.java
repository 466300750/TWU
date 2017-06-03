package com.suyue.introductory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
* Triangle Tester.
*
* @author <Authors name>
* @version 1.0
*/
public class TriangleTest {

    Triangle triangle;

@Before
public void before() throws Exception {
    triangle = new Triangle();
}

@After
public void after() throws Exception {
}

/**
* Method: printOneAsterisk()
*/
@Test
public void testPrintOneAsterisk() throws Exception {
    System.out.println("print one asterisk");
    triangle.printOneAsterisk();
}

/**
* Method: printHorizontalLine(int n)
*/
@Test
public void testPrintHorizontalLine() throws Exception {
    System.out.println("print horizontal lie");
    triangle.printHorizontalLine(3);
}

/**
* Method: printVerticalLine(int n)
*/
@Test
public void testPrintVerticalLine() throws Exception {
    System.out.println("print vertical line");
    triangle.printVerticalLine(3);
}

/**
* Method: printRightTriangle(int n)
*/
@Test
public void testPrintRightTriangle() throws Exception {
    System.out.println("print right triangle");
    triangle.printRightTriangle(3);
}
}
