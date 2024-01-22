package employee;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;



@Suite
@SelectClasses( {EmployeeInfoTest.class , EmployeeDesignationTest.class})
public class EmployeeTestSuite {

}
