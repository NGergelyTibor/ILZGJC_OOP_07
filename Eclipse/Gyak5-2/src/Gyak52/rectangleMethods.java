package Gyak52;

import java.util.Scanner;

public class rectangleMethods {
	public static void fill(rectangle[] rectangle) {
		for (int i = 0; i < rectangle.length; i++) {
			rectangle[i]=new rectangle(((int)(Math.random()*(10-2)))+2,((int)(Math.random()*(10-2)))+2);
			System.out.println(rectangle[i]);
		}

	}
	public static int areaCalc(rectangle[] rectangle) {
		int area=0,min=0,j=0;
		for (int i = 0; i < rectangle.length; i++) {
			area=rectangle[i].getLenght()*rectangle[i].getWidth();
			if(i==0) { 
			min=area;
			j=i;
		}
			else if(min>area) {
			min=area;
			j=i;
		}
	}
		return j;
	}
	public static int sideInput() {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
		    System.out.println("Please enter a positive number");
		    while (!sc.hasNextInt()) {
		        System.out.println("That's not a number!");
		        sc.next();
		    }
		    number = sc.nextInt();
		} while (number < 0);
		return number;
	}
	public static void newRectangle(rectangle[] rectangle) {
		rectangle[0] = new rectangle(sideInput(),sideInput());	
	}
	public static int biggerRectangle(rectangle[] rectangle,rectangle[] rectangle2) {
		int area=0,oldArea=0,count=0;
		area= rectangle[0].getLenght()*rectangle[0].getWidth();
		for (int i = 0; i < rectangle2.length; i++) {
			oldArea=rectangle2[i].getLenght()*rectangle2[i].getWidth();
			if(oldArea>area) {
				count++;
			}
		}
		return count;
	}
	public static void index(rectangle[] rectangle,rectangle[] rectangle2) {
		int match=-1;
		for (int i = 0; i < rectangle2.length; i++) {
			if (rectangle2[i].getLenght() == rectangle[0].getLenght() && rectangle2[i].getWidth() == rectangle[0].getWidth()) {
				match=i;
				break;
			}
		}
		if (match==-1) {
			System.out.println("No match.");
		}
		else {
			System.out.println("First rectangle's index, where the sides are the same:"+match);
		}
	}
	
}
