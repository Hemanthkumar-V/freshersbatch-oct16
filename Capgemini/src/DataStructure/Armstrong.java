import java.util.Scanner;
public class Armstrong {
	static boolean isArmstrong(int n)
	{
		int sum=0,t=n;
		int dc=countDigits(n);
		do
			{
			int r=n%10;
			sum=sum+pow(r,dc);
			n=n/10;
			}while(n!=0);
		return t==sum;
			
	}
	static int countDigits(int n)
	{
	int count=0;
	do
	{
		count++;
		n=n/10;
	}while(n!=0);
	return count;
	}
	static int pow(int n,int p) {
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
	
		
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		boolean rs=isArmstrong(n);
		if(rs)
		{
			System.out.println(n + "nuber is Armstrong");
			
		}
		else
			System.out.println(n + "not a Armstrong number");
		
	}

}
