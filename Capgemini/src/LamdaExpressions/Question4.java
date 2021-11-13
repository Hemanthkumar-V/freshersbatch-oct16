package LamdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question4 {

	public static void main(String[] args) {
ArrayList<String> l1=new ArrayList<String>();
l1.add("fhgjgj");
l1.add("fgfg");
l1.add("gfj");
l1.add("fgfhj");
l1.add("j");
System.out.println(l1);
List<Integer>l2=( l1.stream()).map(J->J.size()<2).collect(Collectors.toList());
System.out.println(l2);
	}

}
