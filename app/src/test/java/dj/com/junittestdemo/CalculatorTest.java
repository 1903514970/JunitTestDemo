package dj.com.junittestdemo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by dengjun on 2017/7/3.
 * TODO
 */
public class CalculatorTest {
    private Calculator calculator;
    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void sum() throws Exception {
        assertEquals(calculator.sum(1,1),2,0);
    }

    @Test
    public void substract() throws Exception {
        assertEquals(calculator.substract(1,1),2,0);
    }

    @Test
    public void divide() throws Exception {
        assertEquals(calculator.divide(1,1),2,0);
    }

    @Test
    public void multiply() throws Exception {
        assertEquals(calculator.multiply(1,1),2,0);
    }

}