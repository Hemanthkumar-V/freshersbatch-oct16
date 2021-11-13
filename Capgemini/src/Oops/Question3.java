package Oops;


	
	import java.util.Scanner;
	abstract class BankAccount
	{
		
		Scanner sc=new Scanner(System.in);
		int rupees;
	    abstract int totalAmt();
	    abstract void amnt ();

	}

	class SB extends BankAccount
	{
		void amnt()
		{
			System.out.println("enter the fixed Deposit");
			rupees =sc.nextInt();
		}

		int totalAmt()
		{
			return rupees;
		}
	}

	class CA extends BankAccount
	{
		
		void amnt()
		{
			System.out.println("enter the Credit amount to Customer");
			rupees=sc.nextInt();
		}
		int totalAmt()
		{
			return rupees;
		}
		
	}

	class Amount
	{
		void disp(BankAccount ref)
		{
			ref.amnt();	
		}	
	}
	class Question3
	{
		public static void main(String[] args) {
			SB s=new SB();
			CA c=new CA();
			
			Amount a=new Amount();
			a.disp(s);
			a.disp(c);
			System.out.println("Total Amount in the Bank : "+(s.totalAmt()-c.totalAmt()));
		}
	}

