package Annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Info

{
	int authorid();
	String author() default "null";
	String supervisor() default "hemanth";
	String date();
	String time();
	int version();
	String description() default "Annotation";
	
}

class Parent
{
int tno;
String mode;
String location;
	public Parent(int tno, String mode, String location) {
	super();
	this.tno = tno;
	this.mode = mode;
	this.location = location;
}
	@Info( authorid=12,date="14/oct",time="4pm",version=4)
	public void test()
	{
		System.out.println("Test1 class members");
		System.out.println("Test1 no"+tno);
		System.out.println("Test1 mode"+mode);
		System.out.println("Test1 location"+location);
		
	}
}
public class Question2 {

	public static  void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		Parent t=new Parent(1,"online","bangalore");
		t.test();
		Class c=t.getClass();
		Method m=c.getMethod("test");
		Annotation a=m.getAnnotation(( Info.class));
		Info t2=(Info)a;
		System.out.println("Info Annotation details");
		System.out.println("Author id"+t2.authorid());
		System.out.println("Date"+t2.date());
		System.out.println("Time"+t2.time());
		System.out.println("version"+t2.version());
	}

}
