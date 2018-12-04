
public class Carculator {

	private String firstOperand = "";
	private String secondOperand = "";
	private String result = "";
	private int operand;

	public void puls() {
		if (firstOperand == "") {
			firstOperand = result;
		} else {
			secondOperand = result;
			firstOperand = Integer.parseInt(firstOperand) + Integer.parseInt(secondOperand) + "";
		}
		operand = 1;
		this.result = "";
	}
	
	public void minus() {
		if (firstOperand == "") {
			firstOperand = result;
		} else {
			secondOperand = result;
			firstOperand = Integer.parseInt(firstOperand) - Integer.parseInt(secondOperand) + "";
		}
		operand = 2;
		this.result = "";
	}
	
	public void mult() {
		if (firstOperand == "") {
			firstOperand = result;
		} else {
			secondOperand = result;
			firstOperand = Integer.parseInt(firstOperand) * Integer.parseInt(secondOperand) + "";
		}
		operand = 3;
		this.result = "";

	}
	
	public void divi() {
		if (firstOperand == "") {
			firstOperand = result;
		} else {
			secondOperand = result;
			firstOperand = Integer.parseInt(firstOperand) / Integer.parseInt(secondOperand) + "";
		}
		operand = 4;
		this.result = "";

	}
	
	public void reset() {
		this.result = "";
	}
	
	public void change() {
			result = Integer.parseInt(result)-Integer.parseInt(result)*2+"";
	}
	
		
	public void backSpace() {
		result = result.substring(0, result.length()-1); ////  ??? 
	}
	
	
	public void result() {
		if(operand == 1) {
			firstOperand = Integer.parseInt(firstOperand) + Integer.parseInt(result) + "";////////////Ό³Έν 
		}else if(operand == 2) {
			firstOperand = Integer.parseInt(firstOperand) - Integer.parseInt(result) + "";
		}else if(operand == 3) {
			firstOperand = Integer.parseInt(firstOperand) * Integer.parseInt(result) + "";
		}else if(operand == 4) {
			firstOperand = Integer.parseInt(firstOperand) / Integer.parseInt(result) + "";
		}
		
		
		this.result = firstOperand;
		firstOperand = "";
	}

	

	public String getFirstOperand() {
		return firstOperand;
	}

	public void setFirstOperand(String firstOperand) {
		this.firstOperand += firstOperand;
	}

	public String getSecondOperand() {
		return secondOperand;
	}

	public void setSecondOperand(String secondOperand) {
		this.secondOperand = secondOperand;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result += result;
	}

	public int getOperand() {
		return operand;
	}

	public void setOperand(int operand) {
		this.operand = operand;
	}

}
