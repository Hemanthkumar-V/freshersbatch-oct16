package LamdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Question3 {

	public static void main(String[] args) {
List<Integer>l1=Arrays.asList(1,4,5,7,8,5);
l1.stream().forEach(i->System.out.println(i));
l1.stream().filter(i->i%2!=0).forEach(i->System.out.println("odd is"+i));

List<Integer>l2=Arrays.asList();
System.out.println(l2.stream().findAny().orElseGet(()->8));
Function<Integer,String>getInt=t->t*5+"is answer after multiply 5";
System.out.println(getInt.apply(9));

	}

}
