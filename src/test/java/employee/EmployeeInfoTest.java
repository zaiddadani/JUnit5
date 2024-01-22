package employee;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

class EmployeeInfoTest {
	
	private Employee emp = new Employee(1, "John Doe", "Manager");
	

	
	
	@Test
	void testID() {
		
		int id = emp.getEmployeeID();
		
		assertEquals(1, id);
	}
	
	@Test
	void testName() {
		
		String name = emp.getEmployeeName();
		assertEquals("John Doe", name);
	}
	
	
	

}
