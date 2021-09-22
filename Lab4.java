/**AUTHOR: Gregory Feng
 * FILENAME: Lab4.java
 * SPECIFICATION: Program that takes an inputed number and performs various arithmetic operations (Calculating the sum of the
 * integers from 1-m, the factorial of the given number, and the leftmost digit of the number) on said number depending on what
 * the user inputs, and outputs the result.
 * FOR: CSE-110 Lab4
 * TIME SPENT: 15 minutes
 */
import java.util.*;
public class Lab4 {
	public static void main(String[] args) {
		//Variable definitions
		Scanner scanner = new Scanner(System.in);
		int consoleInput=0;
		int num;
		boolean running=true;
		do {
			//Displays menu and takes the user's input
			displayMenu();
			consoleInput=scanner.nextInt();
			switch(consoleInput) {
			//Sum of ints 1-m
			case 1:
				System.out.print("Enter a number: ");
				num=scanner.nextInt();
				int temp=0;
				for(int i=1;i<=num;i++) {
					temp+=i;
				}
				System.out.println("The sum of 1 to "+num+" is "+temp);
				break;
			//Factorial of number
			case 2:
				System.out.print("Enter a number: ");
				num=scanner.nextInt();
				temp=1;
				for (int i=1;i<=num;i++) {
					temp*=i;
				}
				System.out.println("The factorial of "+num+" is "+temp);
				break;
			//Display leftmost digit of number
			case 3:
				System.out.print("Enter a number: ");
				num=scanner.nextInt();
				temp=(int)Math.pow(10, Double.valueOf(String.valueOf(num).length()-1));
				temp=num/temp;
				System.out.println("The leftmost digit of "+num+" is "+temp);
				break;
			//Quit
			case 4:
				running = false;
				System.out.println("Bye!");
				break;
			}
		} while (running);
	}
	/*
	 * Displays the menu
	 */
	private static void displayMenu() {
		System.out.println("Please choose one option from the following menu:");
		System.out.println("1) Calculate the sum of the integers from 1 to m");
		System.out.println("2) Calculate the factorial of the given number");
		System.out.println("3) Display the leftmost digit of the given number");
		System.out.println("4) Quit");
	}
}
