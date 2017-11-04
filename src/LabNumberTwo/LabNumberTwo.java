package LabNumberTwo;

import java.util.Scanner;

public class LabNumberTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initializes the first state
		int state = 1;
		// starts game
		boolean choice = true;
		// player's name
		String name = "";
		// output if matched then the prompts will continue
		String answer = "";

		Scanner scan1 = new Scanner(System.in);

		while (choice == true) {
			switch (state) {
			case 1:
				System.out.println("What's your name?");
				name = scan1.nextLine();
				// answer = scan1.nextLine();

				System.out.println("Would you like to play a game? (y/n)");
				answer = scan1.nextLine();

				if (answer.equalsIgnoreCase("y")) {
					state = 2;
				} else {
					// DON'T FORGET THE BRACKETS AFTER THE ELSE
					choice = false;
				}
				break;
			case 2:
				System.out
						.println("Excellent! You are walking across a field and "
								+ "you encounter a fire-breathing dragon! "
								+ "What would you do? (enter 1 to face the beast, "
								+ "enter 2 to run away)");
				answer = scan1.nextLine();

				if (answer.equals("1")) {
					state = 3;
				} else {
					// DON'T FORGET THE BRACKETS AFTER THE ELSE
					choice = false;
					System.out.println("Scary cat! You die!!");
				}
				break;
			case 3:
				System.out.println("You approach the dragon.  "
						+ "You see that he has how many heads? (1, 2, or 3)");
				answer = scan1.nextLine();

				if (answer.equals("3")) {
					state = 4;
				} else {
					// DON'T FORGET THE BRACKETS AFTER THE ELSE
					choice = false;
					System.out.println("RUN!");
				}
				break;
			case 4:
				System.out
						.println("No one has ever faced a 3-headed dragon before!  "
								+ "Choose your weapon: (enter 'slingshot', "
								+ "'sword', or 'bow and arrow')");
				answer = scan1.nextLine();

				if (answer.equals("bow and arrow")) {
					state = 5;
				} else {
					// DON'T FORGET THE BRACKETS AFTER THE ELSE
					choice = false;
					System.out.println("You don't stand a chance. Game Over!!");
				}
				break;

			case 5:
				System.out
						.println("Armed with your bow and arrow, "
								+ "you approach the dragon. You can feel its fiery breath "
								+ "as you get closer. It stares you in the eyes, "
								+ "what color are the dragon's eyes? (enter 'red' or 'blue')");
				answer = scan1.nextLine();
				if (answer.equals("red")) {
					state = 6;
				} else {
					// DON'T FORGET THE BRACKETS AFTER THE ELSE
					choice = false;
					System.out
							.println("Blue eyed dragons are deadly! You die!");
				}
				break;

			// use default for the last case in the switch statement
			default:
				System.out
						.println("Oh thank goodness! Red-eyed dragons are friendly."
								+ "You pet it and become friends. You name the "
								+ "dragon ____. (enter a name)");
				answer = scan1.nextLine();
				System.out.println();
				// System.out.println(answer);
				System.out.println(name + " and " + answer
						+ " live happily ever after.");
				choice = false;
				break;

			}

		}
		scan1.close();
	}

}
