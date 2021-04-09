package calculator;

class calculator implements java.io.Serializable {
	
	private double operandOne;
	private double operandTwo;
	private double result;
	private String setOperator;
	
	public void setOperandOne(double x) {
		this.operandOne = x;
	}
	
	public void setOperandTwo(double y) {
		this.operandTwo = y;
	}
	
	public void setOperator(String s) {
		this.setOperator = s;
	}
	
	public void performOperation() {
		if(this.setOperator == "+") {
			this.result = this.operandTwo + this.operandOne;
		}
		else {
			this.result = this.operandOne - this.operandTwo;
		}
	}
	
	public double getResults() {
		return this.result;
	}
		
}
