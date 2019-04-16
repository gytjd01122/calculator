package com.myname.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorApplicationTests {
	private Calculator calculator = new Calculator();

	@Test
	public void contextLoads() {
	}
    
    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3));
	}
	@Test
	public void testMinus(){
		assertEquals (0, calculator.minus(3,3));
	}
	@Test
	public void testCross(){
		assertEquals (9, calculator.cross(3,3));
	}
	@Test
	public void testDivide(){
		assertEquals (1, calculator.cross(3,3));
	}



}
