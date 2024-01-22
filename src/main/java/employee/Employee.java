package employee;

public class Employee {
	
	private int employeeID;
	private String employeeName;
	private String employeeDesignation;
	
	
	public Employee(int employeeID, String employeeName, String employeeDesignation) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
	}


	public int getEmployeeID() {
		return employeeID;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	
	
	
	
	
	
	

}
