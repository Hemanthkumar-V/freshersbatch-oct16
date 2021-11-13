

	import java.util.Scanner;
	public class Intrest {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the principle amount");
			double principle=sc.nextDouble();
			System.out.println("Enter the rate of Intrest");
			double rate=sc.nextDouble();
			System.out.println("Enter the term");
			double term=sc.nextDouble();
			System.out.println("Simple intrest is"+principle*term*rate/100);
			double compound=principle * Math.pow(1+rate/100,term)-principle;
			System.out.println("Compound intrest is"+compound);
			
			
			

		}

	}



