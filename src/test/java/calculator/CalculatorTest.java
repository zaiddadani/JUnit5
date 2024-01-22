package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(CalculatorExtension.class)
class CalculatorTest {

	
	private Calculator util = new Calculator();
	@Test
	void testAdd() {
		int res = util.add(10, 10);
		assertEquals(20, res);
	}
	
	
}
