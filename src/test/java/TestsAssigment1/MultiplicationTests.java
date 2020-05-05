package TestsAssigment1;

import Assigment1.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MultiplicationTests {
    @Test
    public void testMultiPass(){
        assertEquals("TC 1 : error in Multiplication",25, Calculator.mul(5,5));
        assertEquals("TC 2 : error in Multiplication",10, Calculator.mul(2,5));
        assertEquals("TC 3 : error in Multiplication",30, Calculator.mul(10,3));
    }
    @Test
    public void testMultiFail(){
        assertEquals("TC 1 : error in Multiplication",30, Calculator.mul(5,5));
        assertEquals("TC 2 : error in Multiplication",15, Calculator.mul(2,5));
        assertEquals("TC 3 : error in Multiplication",40, Calculator.mul(10,3));
    }
}
