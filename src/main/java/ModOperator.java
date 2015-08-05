
public class ModOperator implements BinaryOperator {

	@Override
	public float getResult(float op1, float op2) throws Exception {
		return op1 % op2;
	}

}
