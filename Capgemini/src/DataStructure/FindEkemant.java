import java.util.Scanner;
public class FindEkemant {
	
	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number you want to search");
			int ele=sc.nextInt();
			boolean fnd=false;
			int ind=0;
			int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
			for (int i=0;i<arr.length;i++)
			{
				if (ele==arr[i])
				{
					fnd=true;
					ind=i;
					break;
				}
			
			}
			
			if(fnd==true)
			{
				System.out.println("found the number at index  "+ ind);
			}
			else
				System.out.println("not found in given array");
		}
	}
