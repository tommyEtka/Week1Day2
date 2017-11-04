//If and Else Statements

package InClassWorkDayTwoSecond;

import java.util.Scanner;

public class InClassWorkDayTwoSecond {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan1 = new Scanner(System.in);
		int input;

		input = scan1.nextInt();

		if (input <= 10000) {
			System.out.println("Yay, you got an extra $1000!");
			System.out.println("Travel!");
			// needs to have at most 1 statement
			// so you can't have System.out.println("travel!"); also they have
			// to be in the brackets together
		} else {
			System.out.println("You have more than enough!");
		}
		scan1.close();
	}

}
