package LamdaExpressions;
import java.util.Arrays;
import java.util.List;

public class Question8 {

	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();

	}

}
class MyThread extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread());
		List<Integer> values=Arrays.asList(4,5,8,5,8);
		values.forEach(i->System.out.println(i));
	}
}