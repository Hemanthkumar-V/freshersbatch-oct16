package ExceptionHandling;
import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Numerator value");
		int a= scanner.nextInt();
		System.out.println("Enter the denominator value");
		int b= scanner.nextInt();
		try {
			int c=a/b;
			System.out.println("The output of divison is "+c);
		}
		catch(ArithmeticException e){
			UnsuppotedOprationException use=new 	UnsuppotedoprationException;
			System.out.println(use);
			
		}

	}

}
