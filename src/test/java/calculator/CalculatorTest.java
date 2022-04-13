package calculator;

import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void SQRTTruePositive(){
        assertEquals("Square Root of an integer number for True Positive", 2, calculator.SQRT(4), DELTA);
        assertEquals("Square Root of an integer number for True Positive", 0.6, calculator.SQRT(0.36), DELTA);
        //assertEquals("Adding two double numbers for True Positive", 5.3, calculator.add(2.1, 3.2), DELTA);
    }

    @Test
    public void SQRTFalsePositive(){
        assertNotEquals("Square Root of an integer number for False Positive", 6, calculator.SQRT(4), DELTA);
        assertNotEquals("Square Root of an integer number for False Positive", 7.3, calculator.SQRT(0.36), DELTA);
    }

    @Test
    public void factTruePositive(){
        assertEquals("Factorizing an integer number for True Positive", 120, calculator.fact(5), DELTA);
        assertEquals("Factorizing an integer number for True Positive", 24, calculator.fact(4), DELTA);
    }

    @Test
    public void factFalsePositive(){
        assertNotEquals("Factorizing an integer number for False Positive", 12, calculator.fact(5), DELTA);
        assertNotEquals("Factorizing an integer number for False Positive", 2, calculator.fact(4), DELTA);
    }
    @Test
    public void logTruePositive(){
        assertEquals("Logarithmic an integer number for True Positive", 0, calculator.log(1), DELTA);
        //assertEquals("Logarithmic an integer number for True Positive", 0.602059991, calculator.log(4), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Logarithmic an integer number for False Positive", 120, calculator.log(5), DELTA);
        assertNotEquals("Logarithmic an integer number for False Positive", 24, calculator.log(4), DELTA);
    }


    @Test
    public void powerTruePositive(){
        assertEquals("Power of an integer number for True Positive", 25, calculator.power(5,2), DELTA);
        assertEquals("Power of an integer number for True Positive", 64, calculator.power(4,3), DELTA);
    }
    @Test
    public void powerFalsePositive(){
        assertNotEquals("Power of an integer number for False Positive", 10, calculator.power(5,2), DELTA);
        assertNotEquals("Power of an integer number for False Positive", 3, calculator.power(4,3), DELTA);
    }
}