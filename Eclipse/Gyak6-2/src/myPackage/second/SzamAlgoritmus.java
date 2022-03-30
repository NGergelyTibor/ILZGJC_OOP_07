package myPackage.second;

import myPackage.first.Szam;

public class SzamAlgoritmus {
	
	public static int mainAlg(double randomDouble, Szam number) {
		int count = 0;
		boolean check = false;
		do {
			double generated = 0.0;
			count++;
			generated = Math.random();
			if (generated <= randomDouble + number.getTures() && generated >= randomDouble-number.getTures()) {	
				System.out.println(count + ". szam " + "\n" + "Generated: " + generated + "\n" + "RandomDouble: " + randomDouble);
				check = true;
			}
		} while (!check);
		return count;
	}
}
