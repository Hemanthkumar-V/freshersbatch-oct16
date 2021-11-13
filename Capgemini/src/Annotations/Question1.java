/*Annotation are the one which is used to indicate information to the compiler
 * Syntax of Annotation
 * 1.Declartion syntax
 * @interface Annotation_name
 * {
 * members
 * datatype member_name()[default values]//optional
 * }
 * 2.Utilization Syntax
 * @Annotation_name(member1=value,member2=value2....)
 * Programming element
 * 
 * Types of Annotation
 * 1.marker Annotaion->without members
 * eg1.@override
 * 2.@Deprecated
 * 
 * 
 * 2.Single valued Annotation
 * only one member will involve in the annotaion
 * eg @SuppressWarning("unchecked")
 * 
 * 
 * 3.Multivalued Annotation
 * @WebSErvlet(name="myServlet",urlpattern="{/abc,xyz/"})
 *    
 *    
 *    
 *    Classification of Annotation
 *    
 * 1.Standard Annotation
 *     1.1 General purpose
 *        1.1.1 @Override
 *        1.1.2 @SuppressWarning
 *        1.1.3 @Deprecated
 *        1.1.4 @FunctionalInterface
 *        
 *2. meta annotation
 *   2.1 @Documented
 *   2.2 @Inherited
 *   2.3 @Target
 *   2.4 @Retention
 *     
 */
package Annotations;
import java.lang.annotation.*;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test 
{
    int tid();
	String tname() default "Test-case";
	String type();
}
class Test1
{int tno;
String mode;
String location;
	public Test1(int tno, String mode, String location) {
	super();
	this.tno = tno;
	this.mode = mode;
	this.location = location;
}
	@Test(tid=11,tname="java",type="Recryitment")
	public void testCase()
	{
		System.out.println("Test1 class members");
		System.out.println("Test1 no"+tno);
		System.out.println("Test1 mode"+mode);
		System.out.println("Test1 location"+location);
		
	}
}

public class Question1 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Test1 t1=new Test1(2,"online","bangalore");
		t1.testCase();
		Class c=t1.getClass();
		Method m=c.getMethod("testCase");
		Annotation a=m.getAnnotation(( Test.class));
		Test t2=(Test)a;
		System.out.println("Test Annotation details");
		System.out.println("Test id"+t2.tid());
		System.out.println("Test name"+t2.tname());
		System.out.println("Test type"+t2.type());
		

	}

}
