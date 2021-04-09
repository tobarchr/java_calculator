package calculator;

public class calculatorTest {

	public static void main(String[] args) {
		calculator c = new calculator();
		c.setOperandOne(10.5);
		c.setOperator("+");
		c.setOperandTwo(5.2);
		c.performOperation();
		System.out.println(c.getResults());
	}

}
