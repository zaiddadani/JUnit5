package employee;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EmployeeDesignationTest {
	
	
	Employee employee = new Employee(1 ,"John Doe", "Manager");
	
	@Test
	void testDesignation() {
		
		String designation = employee.getEmployeeDesignation();
		assertEquals("Manager", designation);
		
	}
	

}
