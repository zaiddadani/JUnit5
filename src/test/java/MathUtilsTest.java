import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



import org.junit.jupiter.api.AfterAll;


class MathUtilsTest {
	
	
	private MathUtils utils = new MathUtils();;
	

	@BeforeEach
	void setUp() {
		System.out.println("Will run before each test case method");
	
		
	}
	
	@BeforeAll
	static void SetUpBeforeClass() {
		
	
		System.out.println("this run before all test methods in the class");
	}
	
	@TestFactory
	Stream<DynamicTest> dynamicTestForMathOperation(){

	
		
		return Stream.of(
				dynamicTest("ADD" , () -> performOperations(10 , 10, MathUtils.MathOperations.ADD, 20) ),
				dynamicTest("SUBTRACT" , () -> performOperations(10 , 10, MathUtils.MathOperations.SUBTRACT, 0))
				);
		
		
	}
	
	private void performOperations(int x, int y, MathUtils.MathOperations operation , int expected) {
		int result = utils.performOperations(x, y, operation);
		assertEquals(expected , result);
	}
	

	
	@DisplayName("Simple Addition Test")
	@ParameterizedTest
    @CsvSource({"2,3,5", "18,18,36", "19,19,38"})
    void testAdd(int a, int b, int expected) {
        int result = utils.add(a, b);
        assertEquals(expected, result, () -> a + " + " + b + " should equal " + expected);
    }
	
	@Test
	@DisplayName("Simple Addition Test")
	void testSubtract() {
		
		int result = utils.subtract(3, 10);
		assertEquals(-7, result);
	}
	
	@AfterEach
	void closingResAfterEachMethod() {
		
		System.out.println("performs required clean up after each method");
	}
	
	@AfterAll
	static void AfterAll() {
		System.out.println("Perform required clean up after executing all test method");
	}
	
	
	

}
