package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
class Orders
{
int orderid;
String ordername;
int orderprice;
String orderstatus;
public Orders(int orderid, String ordername, int orderprice, String orderstatus) {
	super();
	this.orderid = orderid;
	this.ordername = ordername;
	this.orderprice = orderprice;
	this.orderstatus = orderstatus;
}
	
}
public class Question2 {

	public static void main(String[] args) {
		List<Orders>al=Arrays.asList(new Orders(1,"pizza",80,"complted"),
				new Orders(2,"Burger",72,"complted"),
				new Orders(3,"panneer",81,"complted"),
				new Orders(4,"masala",79,"incomplted")
				);
		Predicate<Orders>p=e->(e.orderprice>=80 || e.orderstatus=="completed");
		for(Orders o:al)
		{
			
		
		if(p.test(o))
		System.out.println((o.orderid+" "+o.ordername));
		

	}
	}
}


