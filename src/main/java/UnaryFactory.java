import java.util.HashMap;


public class UnaryFactory 
{
	private HashMap<String, UnaryOperator> unaryMap;
	
	UnaryOperator getOperator(String op)
	{
		if(unaryMap == null)
		{
			unaryMap = new HashMap<String, UnaryOperator>();
			unaryMap.put("%", new PercentileOperator());
			unaryMap.put("!", new FactorialOperator());
		}
		
		return unaryMap.get(op);
	}
}
