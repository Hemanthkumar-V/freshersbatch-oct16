package Generics;

import java.util.HashSet;

public class Question1 {

	public static <T> void main(String[] args) {
		Employee<T> e1=new Employee<T>(1,"hemanth",10000.00,"mca");
		Employee<T> e2=new Employee<T>(2,"hemanthkumar",1000.00,"mcom");
		
HashSet<Employee> hs=new HashSet<Employee>();
hs.add(e1);
hs.add(e2);
System.out.println(hs);
e1.display();
	}

}


class Employee<T>
{
private int id;
private String name;
private double salary;
private String department;
	Employee(int id,String name,double salary,String department)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;

	}
	public String getDepartment()
	{
		return department;
		
	}
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(department);
	}
	@Override
	public String toString() {
		return "id=" + id + " name=" + name + " salary=" + salary;
	}
}
