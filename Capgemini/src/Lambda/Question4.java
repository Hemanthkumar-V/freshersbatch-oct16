package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Question4 {

	public static void main(String[] args) {
List<String>al=Arrays.asList("hello","even","deva","david");
Predicate<String>p=s->s.length()%2==0;
for(String s:al)
if(p.test(s))
{
	System.out.println(s);
}
	}

}
