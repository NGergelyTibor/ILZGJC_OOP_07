package Gyak52;

public class rectangle {
	private int recLength;
	private int redWidth;
	
	public rectangle() {
		
	}
	public rectangle(int lenght, int width) {
		this.recLength = lenght;
		this.redWidth = width;
	}
	public int getLenght() {
		return recLength;
	}
	public void setLenght(int lenght) {
		this.recLength = lenght;
	}
	public int getWidth() {
		return redWidth;
	}
	public void setWidth(int width) {
		this.redWidth = width;
	}
	
	@Override
	public String toString() {
		return "Lenght: "+getLenght()+" Width: "+getWidth()+"\n"; 
	}
}
