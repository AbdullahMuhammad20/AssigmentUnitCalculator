package TestsAssigment1;

import Assigment1.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class divisionTests {
    @Test
    public void testDivPass(){
        assertEquals("TC 1 : error in division",3.0, Calculator.dive(9,3));
        assertEquals("TC 2 : error in division",4.5, Calculator.dive(9,2));
        assertEquals("TC 3 : error in division",2.0, Calculator.dive(10,5));
    }
    @Test
    public void testDivFail(){
        assertEquals("TC 1 : error in division",2, Calculator.dive(9,3));
        assertEquals("TC 2 : error in division",1, Calculator.dive(1,9));
        assertEquals("TC 3 : error in division",5, Calculator.dive(10,5));
    }

    // Test if enter Zero number to division function
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDivByZeroFail() {
        Calculator.dive(9, 0); // expect an IllegalArgumentException
    }
}
