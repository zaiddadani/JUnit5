package calculator;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class CalculatorExtension implements BeforeEachCallback, AfterEachCallback {

	@Override
	public void afterEach(ExtensionContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" MEthod executed after each test case, ");
	}

	@Override
	public void beforeEach(ExtensionContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" MEthod executed before each test case, ");
		
	}
	
	

}
