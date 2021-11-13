package Annotations;

import java.lang.annotation.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.text.Annotation;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Execute
{String name();
	int sequence() default 0;
}

class Testing
{
	private int pin;

	public Testing(int pin) {
		super();
		this.pin = pin;
	}
	@Execute(name="hemanth",sequence=2)
	public static void run()
	{
		
	}
	@Execute(name="kumar",sequence=1)
	public static void run1()
	{
		
	}
	
}
	


public class Question3 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Testing s=new Testing(45);
		Class t=s.getClass();
		Method m=t.getMethod("run");
		java.lang.annotation.Annotation a=m.getAnnotation((Execute.class));
		Execute t2=(Execute)a;
		System.out.println(t2.name());
		System.out.println(t2.sequence());

	}

}
