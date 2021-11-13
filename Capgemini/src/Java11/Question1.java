package Java11;
public class Question1 {
@FunctionalInterface
interface simpleIntrest
{
	int calculate(int p,int r,int t);
	

}


	public static void main(String[] args) {
		var p=10000;
		var t=3;
		var r=3;
		System.out.println("The intrest is"+p*t*r/100);

	}

}
