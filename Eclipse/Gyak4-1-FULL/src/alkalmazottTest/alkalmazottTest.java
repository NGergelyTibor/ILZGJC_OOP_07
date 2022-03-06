package alkalmazottTest;

import alkalmazott.alkalmazott;
import java.util.Scanner;

public class alkalmazottTest {
	public static void main(String[] args) {
		alkalmazott elso = new alkalmazott();
		alkalmazott masodik = new alkalmazott("Steven", 2000000);
		System.out.println("Default ertek nev: " + elso.getName());
		System.out.println("Default ertek salary: " + elso.getSalary());
		elso.increaseSalary(15000);
		System.out.println("Default ertek nev: " + elso.getName());
		System.out.println("Default ertek salary increase: " + elso.getSalary());
		System.out.println("Salary between: " + elso.salaryBetween(150000));
		System.out.println("Ado fizetes: " + elso.salaryTax(0.16f));
		System.out.println("Fizetes nagyobb-e mint elso.salary: " + elso.salaryCheck(masodik.getSalary()));
		
		alkalmazott[] alkalTomb = new alkalmazott[5];
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < alkalTomb.length; i++) {
			try {
				alkalTomb[i] = new alkalmazott(input.nextLine(), Integer.parseInt(input.nextLine()));
			}catch (Exception e) {
				System.out.println(e);
				i--;
			}
		}
		input.close();
		System.out.println(alkalTomb[elso.biggestSalary(alkalTomb)] + " " + "-nek/nak van a legtobb fizetese.");
		System.out.println(elso.salaryBetweenAlkal(alkalTomb, 200000) + " " +"embernek esett az intervallumba a fizetese");
		System.out.println(elso.avgSalary(alkalTomb) + " " + "az atlagfizetes");
		System.out.println(elso.taxAlkal(alkalTomb, 0.16f) + " " + "a adoosszatlag");
		
		
		
		
	}
	
}
