package JavaPractice;

public class Product {
	private String name;
	private int weight;
	Product(String name, int weight)
	{
		this.name=name;
		this.weight=weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	/*void ShowInfo()
	{
		System.out.println("Age is:":);
	}*/

}
