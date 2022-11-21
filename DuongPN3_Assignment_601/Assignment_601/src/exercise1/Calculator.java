/*
 * @author duong
 * @date Jul 12, 2021
 * @version 1.0

*/

package exercise1;

import java.util.Scanner;

public class Calculator {
	
	
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
		System.out.println("\n================ Calculator Program==============");
		System.out.println("1. Normal Calculator");
		System.out.println("2. BMI Calculator");
		System.out.println("3. Exit");
		
		int choose = sc.nextInt();
		
			switch (choose) {
			case 1: {
				System.out.println("-------- Normal Calculator----------");
				System.out.println("Enter number: ");
				double number1 = sc.nextDouble();
				System.out.println("Enter Operator:");
				String operator = sc.next();
				
				NormalCalculate normalCal = new NormalCalculate();
				Operator ope = normalCal.checkOperator(operator);
				while(ope == null) {
					System.out.println("Please enter (+, -, *, /, ^)");
					System.out.println("Enter Operator:");
					operator = sc.next();
					ope = normalCal.checkOperator(operator);
				}
				System.out.println("Enter number");
				double number2 = sc.nextDouble();
				double memory = normalCal.calculator(number1, ope, number2);
				System.out.println("Memory : " + memory);
				
				while (true) {
					System.out.println("Enter operator :");
					operator = sc.next();
					while(ope == null) {
						System.out.println("Please enter (+, -, *, /, ^)");
						System.out.println("Enter Operator:");
						operator = sc.next();
						ope = normalCal.checkOperator(operator);
					}
					if(operator.equals("=")) {
						System.out.println("Result : " + memory);
						break;
					}
					ope = normalCal.checkOperator(operator);
					
					System.out.println("Enter number");
					number2 = sc.nextDouble();
					memory = normalCal.calculator(memory, ope, number2);
					System.out.println("Memory : " + memory);
				}			
				
			}
			
			case 2: {
				System.out.println("-----------BMI Calculator-----------");
				System.out.println("Enter Weight(Kg) : ");			
		        double weight = sc.nextDouble();		        
				System.out.println("Enter Height(cm) : ");
				double height = sc.nextDouble();
				height = (double) height / 100;
				BmiCalculator bmiCal = new BmiCalculator();				
				double bmiNumber = (double) weight / (height * height);
				System.out.printf("BMI Number : %.2f", bmiNumber);
				System.out.println();
				BMI bmi = bmiCal.calculateBMI(weight, height);
				System.out.println("BMI Status : " + bmi);
				break;
			}
			case 3: {
				return;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choose);
			}
		}
	}
}
