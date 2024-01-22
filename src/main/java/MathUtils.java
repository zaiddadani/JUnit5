
public class MathUtils {
	
	
	public enum MathOperations{
		
		ADD, SUBTRACT, MULTIPLICATION, DIVISION;
	}
	
	public int performOperations(int x , int y, MathOperations operation) {

		switch(operation) {
		case ADD:
			return x + y;
		case SUBTRACT:
			return x - y;
		case MULTIPLICATION:
			return x * y;
		case DIVISION:
			if(y != 0)
				return x / y;
			else
				throw  new IllegalArgumentException("Cannot divide by zero");
		default:
			throw new IllegalArgumentException("Unsupported operator");
		}
	
	}
	
	
	public int add( int x, int y) {
		
		
		return x + y;
	}
	
	public int subtract(int x, int y) {
		
		return x - y;
		
	}

}
