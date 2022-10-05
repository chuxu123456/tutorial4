package tut4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc {
    @Test
    public void AddTest(){
        assertEquals(2,tut4.Calc.add(1,1));
    }
    @Test
    public void SubtractTest(){
        assertEquals(1,tut4.Calc.subtract(2,1));
    }
}