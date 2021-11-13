package LamdaExpressions;

import java.util.HashMap;
import java.util.Map;

public class Question7 {

	public static void main(String[] args) {
Map<Integer,String>m=new HashMap<Integer,String>();
m.put(1,"hemanth");
m.put(2,"kumar");
m.put(3,"balaji");
m.put(4,"bhargav");
StringBuilder s=new StringBuilder();

m.forEach((k,v)->s.append(k).append(v));
System.out.println("String is"+s);
	}

}
