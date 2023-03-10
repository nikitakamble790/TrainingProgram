			package JavaPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainPerson {

	public static void main(String[] args) {
		Person p=new Person();
		p.name="Nikita";
		p.Display();
		
		System.out.println("data is:"+p.name);
		
		
		
		
		
		
		/*Person p1=new Person("Nikita",'F',22,59);
		Person p2=new Person("Sneha",'F',24,40);
		Person p3=new Person("Soham",'M',28,100);
		Person p4=new Person("Aakash",'M',24,55);
		Person p5=new Person("Akash",'M',26,88);
		Person p6=new Person("Akshay",'M',27,70);
		
		List<Person> employe=new ArrayList<>();
		employe.add(p1);
		employe.add(p2);
		employe.add(p3);
		employe.add(p4);
		employe.add(p5);
		employe.add(p6);
		
		//doubt in printing list directly by passing list
		//System.out.println(employe);
		for(Person p:employe)
		{
			System.out.println(p.name+" "+p.gender+" "+p.age+" "+p.weight);
		}
	Iterator <Person> it=employe.iterator();
	while(it.hasNext())
	{
		Person p=it.next();
		if(p.getWeight()>80)
		{
			it.remove();
		}
	}
	
	System.out.println("after remove");
	for(Person p:employe)
	{
		System.out.println(p.name+" "+p.gender+" "+p.age+" "+p.weight);
	}
	
	System.out.println(employe.size());	
	
	System.out.println(employe.isEmpty());
	
	System.out.println(employe.contains(p1));
	
	System.out.println(employe.remove(p2));
	
	System.out.println(employe.contains(p2));
	
	System.out.println(employe.toString());*/
	}

}
