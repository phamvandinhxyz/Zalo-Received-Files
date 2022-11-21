/*
 * @author duong
 * @date Jul 12, 2021
 * @version 1.0

*/

package exercise1;

public class BmiCalculator {
	
	public BMI calculateBMI(double weight, double height) {
		double bmi = (double) weight / (height * height);
		if (bmi < 19) {
			return BMI.SUBSTANDARD;
		} 
		else if (bmi < 25) {
			return BMI.STANDARD;
		}
		else if (bmi < 30) {
			return BMI.OVERWIGHT;
		}
		else if (bmi < 40) {
			return BMI.FAT;
		}
		else 
			return BMI.VERYFAT;
	}
	
}
