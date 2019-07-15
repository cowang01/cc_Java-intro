//Testing of Calculator class

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculatorOne;

    @Before
    public void before() {
        calculatorOne = new Calculator();
    }

    @Test
    public void startTotal(){
        assertEquals(0.00, calculatorOne.getTotal());
    }

    @Test
    public void addNewTotalFive(){
        calculatorOne.add(5.00);
        assertEquals(5.00, calculatorOne.getTotal());
    }

    @Test
    public void subtractNewTotalTwo(){
        calculatorOne.add(5.00);
        calculatorOne.subtract(3.00);
        assertEquals(2.00, calculatorOne.getTotal());
    }

    @Test
    public void multiplyNewTotalTen(){
        calculatorOne.add(5.00);
        calculatorOne.multiply(2.00);
        assertEquals(10.00, calculatorOne.getTotal());
    }

    @Test
    public void multiplyTotalIsZero(){
        calculatorOne.multiply(2.00);
        assertEquals(0.00, calculatorOne.getTotal());
    }

    @Test
    public void divideTotalIsTwo(){
        calculatorOne.add(10.00);
        calculatorOne.divide(5.00);
        assertEquals(2.00, calculatorOne.getTotal());
    }

    @Test
    public void cleartotalIsZero(){
        calculatorOne.add(35.00);
        calculatorOne.clear();
        assertEquals(0.00, calculatorOne.getTotal());
    }


}
