package march3;

public class Encapsulation {

	public static void main(String[] args) {
		Dog simba=new Dog();
		simba.setAge(15);
		simba.setColor("black");
		simba.setName("simba");
		System.out.println("DOg info:\n name is-"+simba.getName()+" age is-"+simba.getAge()+" color is-"+simba.getColor());

	}

}
class Dog{
	private String color;
	private String name;
	private String breed;
	private int age;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void display()
	{
		System.out.println(name+"\t"+age);
	}
}
