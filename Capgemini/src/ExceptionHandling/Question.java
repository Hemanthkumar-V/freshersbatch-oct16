package ExceptionHandling;
import java.util.Scanner;
public class Question {

	public static void main(String[] args) {
		try {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your deposit");
		double deposit = scanner.nextDouble();
		double balance = deposit;
		
		System.out.println("Enter your withdraw Amount");
		double withdraw = scanner.nextDouble();
		
		withdraw( withdraw,balance);
		}
		catch (IlligalBankTransactionException |InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	private static void withdraw(double withdraw, double balance) throws IlligalBankTransactionException,InsufficientBalanceException
	{
		if(withdraw <= balance && withdraw >0) {
			System.out.println("Hi Take your amount "+ withdraw );
			balance=balance-withdraw;
			System.out.println("your available balance is "+balance);
			
		}
		else if(withdraw <=0) {
			IlligalBankTransactionException ite=new IlligalBankTransactionException();
			System.out.println(ite.getMessage());
                         
			throw ite;
			
		}
		else if(withdraw > balance) {

		InsufficientBalanceException ibe=new InsufficientBalanceException();
		System.out.println(ibe.getMessage());
		throw ibe;
			
		}
		
		
	}

}
