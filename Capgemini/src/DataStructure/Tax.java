import java.util.Scanner;
class Tax
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the CTC Amount");
		double ctc=sc.nextDouble();
		
		if (ctc>0 && ctc<18000)
			System.out.println("Nill");
		else if(ctc>181001 && ctc<=300000)
		{
			 
			System.out.println("Tax is 10% "+ ctc*10/100 );
		}
		else if(ctc>300001 && ctc<500000)
			System.out.println("tax is 20%  "+ ctc*20/200);
		else if(ctc>500001 && ctc<=1000000)
			System.out.println("The Tax Amount is 30%  "+ctc*30/100);
	}
}



