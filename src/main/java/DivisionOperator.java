
public class DivisionOperator implements BinaryOperator {

	@Override
	public float getResult(float op1, float op2) throws Exception {
		if(op2 != 0)
			return op1 / op2;
		else
			throw new Exception("Error: Divided by Zero");
	}

}
