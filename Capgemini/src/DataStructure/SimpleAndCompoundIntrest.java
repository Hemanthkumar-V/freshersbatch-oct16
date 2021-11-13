import java.util.*;
public class SimpleAndCompoundIntrest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle amount");
		int principle=sc.nextInt();
		System.out.println("Enter the rate of Intrest");
		int rate=sc.nextInt();
		System.out.println("Enter the term");
		int term=sc.nextInt();
		System.out.println("Simple intrest is"+principle*term*rate/100);
		double compound=principle * Math.pow(1+rate/100,term)-principle;
		System.out.println("Compound intrest is"+compound);
		
		
		

	}

}
