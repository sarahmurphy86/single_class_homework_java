import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculate;


    @Before
    public void before(){
        calculate = new Calculator(10, 5);
    }

    @Test
    public void add(){
        assertEquals(15, calculate.add());
    }

    @Test
    public void subtract(){
        assertEquals(5, calculate.subtract());
    }

    @Test
    public void multiply(){
        assertEquals(50, calculate.multiply());
    }

    @Test
    public void divide(){
        assertEquals(2, calculate.divide());
    }
}
