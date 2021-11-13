package Lambda;
@FunctionalInterface
interface Calculator
{
	public void calculate(int a,int b);
}
class A implements Calculator
{
	
}

public class Question1 {

	public static void main(String[] args) {
		
		Calculator c=(a,b)->{System.out.println(a+b);System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);};
		c.calculate(5,3);

	}

}
