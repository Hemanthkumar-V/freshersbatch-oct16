package Oops;

public class Question1 {

	public static void main(String[] args) {
		Steering s1=Steering.getInstance();
		Steering s2=Steering.getInstance();
		System.out.println(s1);
		System.out.println(s2);

	}

}
 class Steering
{
	private static Steering getInstance;
	public static Steering getInstance()
	{
		if(getInstance==null)
		{
			getInstance=new Steering();
		}
		return getInstance;
	}
}