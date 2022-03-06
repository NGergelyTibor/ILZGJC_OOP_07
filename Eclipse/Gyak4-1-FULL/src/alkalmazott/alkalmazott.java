package alkalmazott;


public class alkalmazott {
	private String name;
	private int salary;
	public alkalmazott(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public alkalmazott() {
		this("John",200000);
	}
	@Override
	public String toString() {
		return "alkalmazott [name=" + name + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void increaseSalary(int number) {
		this.salary += number;
	}
	public boolean salaryBetween(int number) {
		if(this.salary > number) {
			return true;
		}
		else {
			return false;
		}
	}
	public float salaryTax(float tax) {
		return this.salary * tax;
	}
	public boolean salaryCheck(int alkal) {
		if(this.salary > alkal) {
			return true;
		}
		else {
			return false;
		}
	}
	public int biggestSalary(alkalmazott[] alkaltomb) {
		int temp = 0;
		for(int i = 0; i < alkaltomb.length; i++) {
			if(alkaltomb[temp].salary < alkaltomb[i].salary) {
				temp = i;
			}
		}
		return temp;
	}
	public int salaryBetweenAlkal(alkalmazott[] alkaltomb, int number) {
		int counter = 0;
		for(int i = 0; i < alkaltomb.length; i++) {
			if(alkaltomb[i].salary > number) {
				counter++;
			}
		}
		return counter;
	}
	public int avgSalary(alkalmazott[] alkaltomb) {
		float atlagFizetes = 0;
		for(int i = 0; i < alkaltomb.length; i++) {
			atlagFizetes += alkaltomb[i].salary;
		}
		return (int)atlagFizetes / alkaltomb.length;
		} 
	public int taxAlkal(alkalmazott[] alkaltomb, float tax) {
		float taxFizetes = 0;
		for(int i = 0; i < alkaltomb.length; i++) {
			taxFizetes += alkaltomb[i].salary / tax;
		}
		return (int)taxFizetes;
	}
}

