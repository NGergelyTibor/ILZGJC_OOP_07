package myPackage.second;

import myPackage.first.Szam;

public class SzamMain {

	public static void main(String[] args) {
		final double random=randomGenerator();
		Szam number=new Szam();
		System.out.println("Szam:"+random);
		System.out.println("A "+mainAlg(random, number)+". szam egyezik a random generalt szammal: "+random);
	}
	
	static int mainAlg(double randomDouble,Szam number) {
		int count=0;
		boolean check=false;
		do {
			double generated=0.0;
			count++;
			generated=randomGenerator();
			if (generated<=randomDouble+number.getTures() && generated>=randomDouble-number.getTures()) {	
				System.out.println(count+" "+generated+" "+randomDouble);
				check=true;
			}
		} while (!check);
		return count;
	}
	static double randomGenerator() {
		return Math.random();
	}
	
}
