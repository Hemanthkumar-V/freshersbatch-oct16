package Oops;


	import java.util.*;
	
	abstract class Shape
	{    static  int a=6;
		static double length, width, area;
		
		static void takeInput()
		{
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Length: ");
		length =sc.nextDouble();
		System.out.println("Enter the Size of the Width: ");
		width =sc.nextDouble();
		System.out.println("Enter the Size of the area : ");
		area =sc.nextDouble();
		}
		
		abstract void draw();
	}

	class Line extends Shape
	{
		void draw()
		{
			System.out.println("The length of the line: "+length);
		}
		
	}

	class Rectangle extends Shape
	{
		void draw()
		{
		System.out.println("The Reactangle of Given Area :"+ length*width);	
		}
	}

	class Cube extends Shape
	{
		
		double cube1=a*(area*area);
		void draw()
		{
			System.out.println(" The Cube of the Given Area:"+cube1);
		
		}
		
		}
	

	class Square extends Shape
	{
		void draw()
		{
			System.out.println("The Square of the Given Area: "+area*area);
		}
	}

	class Display
	{
	
		void disp(Shape ref)
		{
			
			ref.draw();
			
		}
	}
	class Question5
	{
		public static void main(String[] args)
		{
		Shape.takeInput();
		Line l=new Line();
		Rectangle r=new Rectangle();
		Cube c=new Cube();
		Square s=new Square();
		
		Display d=new Display();
		d.disp(l);
		d.disp(r);
		d.disp(c);
		d.disp(s);
		
		}
	}

