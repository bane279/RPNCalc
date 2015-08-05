
public class FactorialOperator implements UnaryOperator {

	@Override
	public float getResult(float op1) throws Exception{
		if(op1 >0 && op1 == Math.round(op1))
		{
			float result = 1;
			for(int i=1; i<=op1; i++)
			{
				result = result * i;
			}
			return result;
		}
		else
			throw new Exception("Error: Factorial Allowed only on Positive Integers");
	}

}
