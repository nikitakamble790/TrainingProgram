package JavaPractice;

public class Person {
	
	
	public Person(String name, char gender, int age, int weight) {
	
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}
	String name;
	char gender;
	int age;
	int weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

}
