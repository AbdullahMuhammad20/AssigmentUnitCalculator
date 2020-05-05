package TestsAssigment1;

import Assigment1.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AddSubTest {

    @Test
    public void testAddPass(){
        assertEquals("TC 1 : error in addition operation()",3, Calculator.add(1,2));
        assertEquals("TC 2 : error in addition operation()",-3, Calculator.add(-1,-2));
        assertEquals("TC 3 : error in addition operation()",10, Calculator.add(5,5));
    }
    @Test
    public void testAddFail(){
        assertEquals("TC 1 : error in addition operation()",5, Calculator.add(1,2));
        assertEquals("TC 2 : error in addition operation()",-5, Calculator.add(-1,-2));
        assertEquals("TC 3 : error in addition operation()",10, Calculator.add(5,3));
    }
    @Test
    public void testSubPass(){
        assertEquals("TC 1 : error in subtraction operation()",1, Calculator.sub(2,1));
        assertEquals("TC 2 : error in subtraction operation()",0, Calculator.sub(2,2));
        assertEquals("TC 3 : error in subtraction operation()",-5, Calculator.sub(-10,-5));
    }
    @Test
    public void testSubFail(){
        assertEquals("TC 1 : error in subtraction operation()",2, Calculator.sub(2,1));
        assertEquals("TC 2 : error in subtraction operation()",1, Calculator.sub(2,2));
        assertEquals("TC 3 : error in subtraction operation()",-10, Calculator.sub(-10,-5));
    }
}
