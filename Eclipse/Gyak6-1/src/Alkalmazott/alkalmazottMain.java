package Alkalmazott;


public class alkalmazottMain {

	public static void main(String[] args) {
		int numberOfItems = 2;
		alkalmazott alkalArr[] = new alkalmazott[numberOfItems];
		empArrFill(alkalArr);
		empPrintAndPensionChange(alkalArr);
		empPensionLessThanFive(alkalArr);
		empAvg(alkalArr);
		empArrayAsc(alkalArr);
		empArrayDesc(alkalArr);
		
	}
	public static void empArrFill(alkalmazott array[]) {
		for(int i = 0; i < array.length; i++) {
			array[i] = new alkalmazott(InputMethods.readString(), InputMethods.readInt(), InputMethods.readInt());
		}
	}
	public static void empPrintAndPensionChange(alkalmazott array[]) {
			for(int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
			System.out.println("Pension year");
			int temp = InputMethods.readInt();
			for(int i = 0; i < array.length; i++) {
				array[i].changePensionAge(temp);
				System.out.println(array[i]);
			}	
			
	}
	public static void empPensionLessThanFive(alkalmazott array[]) {
		for(int i = 0; i < array.length; i++) {
			if(array[i].yearsBeforePensions() < 5) {
				System.out.println("Alkalmazott PensionLessThanFive");
				System.out.println(array[i]);
			}
		}
	}
	public static void empAvg(alkalmazott array[]) {
		float sum = 0;
		float average = 0;
		int i = 0;
		while(i < array.length) {
            sum += array[i].yearsBeforePensions();
            i++;
		}
		average = (sum / array.length); 
		System.out.println("Alkalmazott AVG");
		for(i = 0; i < array.length; i++) {
			if(array[i].yearsBeforePensions() > average) {
				System.out.println(array[i]);
			}
		}
	}
	private static void empArrayAsc(alkalmazott [] array) {
		for(int i=0; i<array.length; i++) {
		int minIndex = i;
			for(int j=i+1; j<array.length; j++) {
				if (array[j].yearsBeforePensions() < array[minIndex].yearsBeforePensions()) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				alkalmazott tmp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = tmp;
			}
		}
		System.out.println("Alkalmazott ASC");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	private static void empArrayDesc(alkalmazott [] array) {
		for(int i=0; i<array.length; i++) {
		int minIndex = i;
			for(int j=i+1; j<array.length; j++) {
				if (array[j].yearsBeforePensions() >
						array[minIndex].yearsBeforePensions()) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				alkalmazott tmp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = tmp;
			}
		}
		System.out.println("Alkalmazott DESC");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	

}
