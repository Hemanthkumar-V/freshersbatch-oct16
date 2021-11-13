package Generics;
import java.util.*;
import java.util.Map.Entry;

public class Question2 {

	public static void main(String[] args)
	{
	Map<Integer,Double>indmap=new LinkedHashMap<Integer,Double>();
	indmap.put(171, 90.00);
	indmap.put(82, 120.00);
	indmap.put(10, 32.45);
	indmap.put(17, 90.00);
	indmap.put(8, 124.00);
	indmap.put(1, 32.49);
	indmap.put(174, 97.00);
	indmap.put(8, 1206.00);
	indmap.put(14, 321.45);
	System.out.println("Iterating Map using entrySet()");
	Set<Entry<Integer,Double>> set=indmap.entrySet();
	for(Entry<Integer,Double> entry:set) {
	System.out.println(entry);
	}
	}
	

	}


