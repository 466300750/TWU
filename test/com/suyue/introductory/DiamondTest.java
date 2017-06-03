package com.suyue.introductory;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
* Diamond Tester.
*
* @author <Authors name>
* @version 1.0
*/
public class DiamondTest {
    Diamond diamond;
@Before
public void before() throws Exception {
    diamond = new Diamond();
}

@After
public void after() throws Exception {
}

/**
* Method: printIsoscelesTriangle(int n)
*/
@Test
public void testPrintIsoscelesTriangle() throws Exception {
    System.out.println("print isosceles triangle");
    diamond.printIsoscelesTriangle(3);
}

/**
* Method: printDiamond(int n)
*/
@Test
public void testPrintDiamond() throws Exception {
    System.out.println("print diamond");
    diamond.printDiamond(3);
}

/**
* Method: printDiamondWithName(int n, String name)
*/
@Test
public void testPrintDiamondWithName() throws Exception {
    System.out.println("print diamond with name");
    diamond.printDiamondWithName(3, "ysu");
}


/**
*
* Method: generateAsteriskArray(int n)
*
*/
@Test
public void testGenerateAsteriskArray() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = Diamond.getClass().getMethod("generateAsteriskArray", int.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

}
