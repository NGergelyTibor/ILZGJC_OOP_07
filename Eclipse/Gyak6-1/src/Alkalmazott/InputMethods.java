package Alkalmazott;
import java.util.Scanner;
public class InputMethods {
	
	
	public static String readString() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string");
		return input.nextLine();
	}
	public static int readInt() {
		System.out.print("Please enter an integer: ");
		Scanner input = new Scanner(System.in);
		while(!input.hasNextInt()) input.next();
		int demoInt = input.nextInt();
		return demoInt;
	}
	
	
}