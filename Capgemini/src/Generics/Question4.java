package Generics;
interface Infra
{
void m1();

}
class A implements Infra
{
	int x=30;
	public void m2()
	{
		int a=10,b=20;int c;
	
	Infra i=()->{
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a);
		
	};
	i.m1();
	}
	
	@Override
	public void m1() {
		
	}
}
public class Question4 {

	public static void main(String[] args) {
A a=new A();
a.m2();
		
	}

}
