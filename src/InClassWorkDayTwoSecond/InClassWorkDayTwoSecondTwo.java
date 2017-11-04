package InClassWorkDayTwoSecond;

import java.util.Scanner;

public class InClassWorkDayTwoSecondTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan1 = new Scanner(System.in);
		int input;
		
		input = scan1.nextInt();
		scan1.nextLine();
		
		switch (input) {
		case 1: case 0:
			//this made an OR inside the switch
			System.out.println("CEO");
			break;
			
			//if you forget to put the break then the next line will fall through
			//THIS IS A BUG
			
		case 2:
			System.out.println("Manager");
		break;
		case 3:
			System.out.println("Employee");
			break;
		default:
			System.out.println("Wrong Code!");
	
		}
		
		scan1.close();

	}

}
