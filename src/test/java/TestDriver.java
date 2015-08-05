import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.TestCase;


public class TestDriver extends TestCase{
	
	RPNCalc calc = new RPNCalc();
	String input;
	
	@Given("^Input: \"([^\"]*)\"$")
	public void Input(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		input = arg1;
	}

	@Then("^Output: \"([^\"]*)\"$")
	public void Output(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		assertEquals(arg1, calc.RPNCalculator(input));
	}
}
