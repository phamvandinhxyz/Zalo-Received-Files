/*
 * @author duong
 * @date Jul 12, 2021
 * @version 1.0

*/

package exercise1;

public class NormalCalculate {
	public double sum(double a, double b) {
		return a + b;
	}
	public double subtract(double a, double b) {
		return a - b;
	}
	public double multi(double a, double b) {
		return a * b;
	}
	public double divide(double a, double b) {
		double c;
		if (b == 0) {
			try {
				c = a / b;
			} catch(ArithmeticException e) {
				System.out.println("Error : " + e.getMessage());
			}
		}
		return (double) a / b;
	}
	public double power(double a, double b) {
		return Math.pow(a, b);
	}

	
	public Operator checkOperator(String operator) {
		if (operator.equals("+"))
			return Operator.CONG;
		else if (operator.equals("-")) 
			return Operator.TRU;
		else if (operator.equals("*")) 
			return Operator.NHAN;
		else if (operator.equals("/")) 
			return Operator.CHIA;
		else if (operator.equals("^")) 
			return Operator.SOMU;
		else if (operator.equals("=")) 
			return Operator.BANG;
		else return null;
 	}
	
	public double calculator(double a, Operator operator, double b) {
		if (operator == Operator.CONG) {
			return sum(a,b);
		} 
		else if ( operator == Operator.TRU) {
			return subtract(a, b);
		}
		else if (operator == Operator.NHAN) {
			return multi(a, b);
		}
		else if (operator == Operator.CHIA) {
			return divide(a, b);
		}
		else if (operator == Operator.SOMU) {
			return power(a, b);
		}
		else {
			return a;
		}
	}
}
