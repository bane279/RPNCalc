
public class ExponentOperator implements BinaryOperator {

	@Override
	public float getResult(float op1, float op2) throws Exception {
		return (float) Math.pow(op1, op2);
	}

}
