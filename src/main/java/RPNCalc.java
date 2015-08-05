

import java.util.Stack;
import java.util.Vector;

public class RPNCalc 
{
	//Global Variables
	private Stack<String> stack = new Stack<String>();
	//private Vector<String> exceptionStack = new Vector<String>();
	
	private UnaryFactory Unary = new UnaryFactory();
	private BinaryFactory Binary = new BinaryFactory();
	
	Vector<String> unaryOperators = new Vector<String>();
	Vector<String> binaryOperators = new Vector<String>();
	
	//Method to Check for a Number
	private boolean isNumber(String token)
	{
		if(token.matches("-*[0-9]+.*[0-9]*"))
			return true;

		return false;
	}
	
	private boolean isUnary(String operator)
	{
		if(unaryOperators.contains(operator))
			return true;
		
		return false;
	}
	
	private boolean isBinary(String operator)
	{
		if(binaryOperators.contains(operator))
			return true;
		
		return false;
	}
	
	//Controller Method
	private void calculator(String operator) throws Exception
	{
		if(isUnary(operator))
		{
			float op1 = Float.parseFloat(stack.pop());
			UnaryOperator operation = Unary.getOperator(operator);
			float result = operation.getResult(op1);
			stack.push(String.valueOf(result));
		}
		else if(isBinary(operator))
		{
			float op2 = Float.parseFloat(stack.pop());
			float op1 = Float.parseFloat(stack.pop());
			BinaryOperator operation = Binary.getOperator(operator);
			float result = operation.getResult(op1, op2);
			stack.push(String.valueOf(result));
		}
		else
			throw new Exception("Operator not Supported!");
	}

	// Function to return result
	private String getResult() throws Exception
	{
		String result = stack.pop();
		if(stack.isEmpty())
			return result;
		else
			throw new Exception("Need More number of Operators!");
	}
	
	private boolean isNull(String input) throws Exception
	{
		if(input.isEmpty())			
			throw new Exception("Null String");
		
		return false;
	}
	
	//Driver Method
	public String RPNCalculator(String input) throws Exception 
	{
		unaryOperators.add("!");
		unaryOperators.add("%");
		
		binaryOperators.add("+");
		binaryOperators.add("-");
		binaryOperators.add("*");
		binaryOperators.add("/");
		binaryOperators.add("^");
		binaryOperators.add("%%");		
		
		try
		{
			if(!isNull(input))
			{
				String[] tokens = input.split("\\s");		
			
				for(int i = 0; i < tokens.length; i++)
				{
					if(isNumber(tokens[i]))
						stack.push(tokens[i]);
					
					else
						calculator(tokens[i]);
				}
			}
			return getResult();
		}
		catch(Exception e)
		{
			if(e.getMessage() != null)
				return e.getMessage();
			else
				return "Need more number of Operands!";
		}
	}
}
