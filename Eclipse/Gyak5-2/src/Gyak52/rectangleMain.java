package Gyak52;
public class rectangleMain {

	public static void main(String[] args) {
		
		rectangle[] rectangle = new rectangle[10];
		rectangle[] rectangle2 = new rectangle[1];
		rectangleMethods.fill(rectangle);
		System.out.println("Smallest area data: " + "Lenght "+rectangle[rectangleMethods.areaCalc(rectangle)].getLenght()+" Width: "+rectangle[rectangleMethods.areaCalc(rectangle)].getWidth());
		rectangleMethods.newRectangle(rectangle2);
		System.out.println("Bigger than input rectable (area): "+rectangleMethods.biggerRectangle(rectangle2,rectangle));
		rectangleMethods.index(rectangle2,rectangle);
	}

}
