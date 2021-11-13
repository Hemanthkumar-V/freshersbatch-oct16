package Oops;


	 import java.util.Scanner;
	 abstract class Employee
	 {
	 	
	 	Scanner sc=new Scanner(System.in);
	 	int sal;
	 	abstract void  takeSal();
	 	abstract int totalSal();

	 }

	 class Manager extends Employee
	 {
	 	void takeSal()
	 	{
	 		System.out.println("enter the manager salary");
	 		sal =sc.nextInt();
	 		System.out.println("enter the manager Incentive");
	 		inc=sc.nextInt();
	 	}
	 	int inc;
	 	int totalSal()
	 	{
	 		return sal+inc;
	 	}
	 }

	 class Labour extends Employee
	 {
	 	int ot;
	 	void takeSal()
	 	{
	 		System.out.println("enter the Labour salary");
	 		sal=sc.nextInt();
	 		System.out.println("enter the Labour Over time");
	 		ot=sc.nextInt();
	 	}
	 	int totalSal()
	 	{
	 		return sal+ot;
	 	}
	 	
	 }

	 class Sal
	 {
	 	void disp(Employee ref)
	 	{
	 		ref.takeSal();
	 		ref.totalSal();		
	 	}	
	 }
	 class Question2
	 {
	 	public static void main(String[] args) {
	 		Manager mg=new Manager();
	 		Labour l=new Labour();
	 		
	 		Sal s=new Sal();
	 		s.disp(mg);
	 		s.disp(l);
	 		System.out.println("Total Salary : "+(mg.totalSal()+l.totalSal()));
	 	}
	 }


