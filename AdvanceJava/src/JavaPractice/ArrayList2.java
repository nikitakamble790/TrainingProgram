package JavaPractice;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

public class ArrayList2 {

	

	public static void main(String[] args) {
		//Product door=new Product(name:"Modern door",weight:35);
		
		Product door=new Product("wooden",35);
		Product window=new Product("material",25);
		Product home=new Product("few",45);
		
		//Product door=new Product(name:"wooden",age:35);
		//Product window=new Product(name:"material",age:25);
		
		
		List<Product> p=new ArrayList<>();
		
		p.add(home);
		p.add(window);
		p.add(door);
		
		//System.out.println(products);
		
		for(Product o: p)
		{
			
			System.out.println(o.getName()+" "+o.getWeight());
		}
		
		Iterator <Product> it=p.iterator();
		while(it.hasNext())
		{
			Product pr=it.next();
			if(pr.getWeight()>40)
			{
				it.remove();
			}
		}
		for(Product o: p)
		{
			
			System.out.println(o.getName()+" "+o.getWeight());
		}
		//System.out.println(p);
		
		
	}

}

