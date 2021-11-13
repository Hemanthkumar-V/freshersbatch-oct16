import java.util.Scanner;

public class MarksStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mark1");
		int mark1=sc.nextInt();
		System.out.println("enter the mark2");
		int mark2=sc.nextInt();
		System.out.println("enter the mark3");
		int mark3=sc.nextInt();
		int result=(mark1+mark2+mark3)/3;
		System.out.println("average is  "+result);
		
		
		if(result>=60)
				System.out.println("you are passed");
				
		else if(mark1>=60 && mark2>=60  ||   mark2>=60 && mark3>=60  ||  mark1>=60 && mark3>=60)
					System.out.println("you are promoted");
					
		else if(result<60||mark1>=60 || mark2>=60 || mark3>=60 || (mark1+mark2+mark3)<60)
						System.out.println("you are fail");
						
			
			
		
		}
	}


