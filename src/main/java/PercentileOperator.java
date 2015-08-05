
public class PercentileOperator implements UnaryOperator {

	@Override
	public float getResult(float op1) {
		return op1 / 100.0f;
	}

}
