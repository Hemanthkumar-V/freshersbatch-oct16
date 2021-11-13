import java.util.Scanner;

public class SumRC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("enter the each subject bmarks");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("user entered each student marks are");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<3;i++)
		{
			int subjectSum=0;
			for(int j=0;j<3;j++)
			{
				subjectSum=subjectSum+a[i][j];
			}
			System.out.println(subjectSum);
			System.out.println(subjectSum/3);
		}
		for(int i=0;i<3;i++)
		{
			int markSum=0;
			for(int j=0;j<3;j++)
			{
				markSum=markSum+a[j][i];
			}
			System.out.println("sum of each student1 marks is"+markSum);
			//System.out.println("sum of each student2 marks is"+markSum);
			//System.out.println("sum of each student3 marks is"+markSum);
			System.out.println("average of student marks is"+markSum/3);
		}
		
		
	}

}
