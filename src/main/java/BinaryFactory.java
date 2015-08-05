import java.util.HashMap;


public class BinaryFactory {

	private HashMap<String, BinaryOperator> binaryMap;
	
	BinaryOperator getOperator(String op){
			if(binaryMap == null)
			{
				binaryMap = new HashMap<String, BinaryOperator>();
				binaryMap.put("+", new AdditionOperator());
				binaryMap.put("-", new SubtractionOperator());
				binaryMap.put("*", new MultiplicationOperator());
				binaryMap.put("/", new DivisionOperator());
				binaryMap.put("^", new ExponentOperator());
				binaryMap.put("%%", new ModOperator());
			}
			
			return binaryMap.get(op);
		}
}
