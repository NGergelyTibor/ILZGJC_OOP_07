package Alkalmazott;
public class alkalmazott {
	private String name;
	private int age;
	private int salary;
	private int pensionsAge = 65;
	public alkalmazott(String name, int age, int salary) {
	    this.name = name;
	    this.age = age;
	    this.salary = salary;
	}

	public alkalmazott(String name, int age) {
	    this(name, age, age * 10000);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int yearsBeforePensions() {
		return getPensionsAge() - getAge();
	}

	public int getPensionsAge() {
		return pensionsAge;
	}

	public void setPensionsAge(int pensionsAge) {
		this.pensionsAge = pensionsAge;
	}

	@Override
	public String toString() {
		return "alkalmazott [name=" + name + ", age=" + age + ", salary=" + salary + " " + "yearsBeforePensions=" + yearsBeforePensions() + "]";
	}
	public alkalmazott youngerEmp(alkalmazott first, alkalmazott second) {
		if(first.yearsBeforePensions() > second.yearsBeforePensions()){
			return first;
		}
		else {
			return second;
		}
		
	}
	public void changePensionAge(int age) {
		this.pensionsAge = age;
	}
	

}