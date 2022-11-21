/*
 * @author duong
 * @date Jul 12, 2021
 * @version 1.0

*/

package exercise2;

import java.util.Scanner;

public class TestCountry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\t\t\t\tMENU");
			System.out.println("=========================================================================");
			System.out.println("1. Input the information of 11 countries in East Asia");
			System.out.println("2. Display the information of contry you've just input");
			System.out.println("3. Search the information of country by user-entered name");
			System.out.println("4. Display the information of countries sorted name in ascending order");
			System.out.println("5. Exit");
			System.out.println("=========================================================================");
			int choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1: {
				break;
			}
			case 2:{
				break;
			}
			case 3: {
				break;
			}
			case 4: {
				break;
			}
			case 5:{
				System.out.println("Program ended!");
				return;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choose);
			}
		}
	}
}
