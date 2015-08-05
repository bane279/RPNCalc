import junit.framework.TestCase;

public class Tester extends TestCase
{

	RPNCalc calc = new RPNCalc();
	
	public void testadd() throws Exception
	{
		String input = "2 2 +";
		assertEquals("4.0",calc.RPNCalculator(input));
	}

	public void testSub() throws Exception
	{
		String input = "2.0 2.0 -";
		assertEquals("0.0",calc.RPNCalculator(input));
	}
	
	//New Operator
	public void testMod() throws Exception
	{
		String input = "2.0 2.0 %%";
		assertEquals("0.0",calc.RPNCalculator(input));
	}
	
	public void testmul() throws Exception
	{
		String input = "2.0 2.0 *";
		assertEquals("4.0",calc.RPNCalculator(input));
	}
	
	public void testdiv() throws Exception
	{
		String input = "2.0 2.0 /";
		assertEquals("1.0",calc.RPNCalculator(input));
	}
	
	public void testdiv0() throws Exception
	{
		String input = "2.0 0.0 /";
		assertEquals("Error: Divided by Zero",calc.RPNCalculator(input));
	}
	
	public void testpower() throws Exception
	{
		String input = "2.0 2.0 ^";
		assertEquals("4.0",calc.RPNCalculator(input));
	}
	
	public void testpercent() throws Exception
	{
		String input = "90 %";
		assertEquals("0.9",calc.RPNCalculator(input));
	}
	
	public void testFactorial() throws Exception
	{
		String input = "3.0 !";
		assertEquals("6.0",calc.RPNCalculator(input));
	}
	
	public void testFactorialError() throws Exception
	{
		String input = "3.3 !";
		assertEquals("Error: Factorial Allowed only on Positive Integers",calc.RPNCalculator(input));
	}
	
	public void testComplex1() throws Exception
	{
		String input = "2 3 * 5 6 + -";
		assertEquals("-5.0",calc.RPNCalculator(input));
	}
	
	public void testComplex2() throws Exception
	{
		String input = "4 60 6 5 * 30 + / 2 ^ 14 + * %";
		assertEquals("0.6",calc.RPNCalculator(input));
	}
	
	public void testComplex3() throws Exception
	{
		String input = "4 2 3 ^ + 5.0 * 40 + %";
		assertEquals("1.0",calc.RPNCalculator(input));
	}
	
	public void testMoreOperands() throws Exception
	{
		String input = "2 2 - +";
		assertEquals("Need more number of Operands!",calc.RPNCalculator(input));
	}
	
	public void testMoreOperators() throws Exception
	{
		String input = "2 2 2 +";
		assertEquals("Need More number of Operators!",calc.RPNCalculator(input));
	}	
	
	public void testOperatorNotSupported() throws Exception
	{
		String input = "2 2 2 &";
		RPNCalc calc = new RPNCalc();
		assertEquals("Operator not Supported!",calc.RPNCalculator(input));
	}	
	
	public void testNullString() throws Exception
	{
		String input = "";
		assertEquals("Null String",calc.RPNCalculator(input));		
	}
}
