package collection;

import java.util.Arrays;
import java.util.HashSet;

class Product
{
	int pid;
	String pname;
	int price;
	public Product(int pid, String pname, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
}

public class Question2 {

	public static void main(String[] args) {
	HashSet<Product> hs=new HashSet<Product>();
	hs.add(new Product(1,"tv", 2000));
	hs.add(new Product(2,"fridge", 5000));
	hs.add(new Product(1,"tv", 2000));
	System.out.println(hs);

	}

}
