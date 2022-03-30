package myPackage.second;

import myPackage.first.Szam;

public class SzamMain {

	public static void main(String[] args) {
		Szam number = new Szam();
		final double random = Math.random();
		
		System.out.println("Szam:" + random);
		System.out.println("A " + SzamAlgoritmus.mainAlg(random, number) + ". szam egyezik a random generalt szammal: " + random);
	}
}
