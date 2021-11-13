package StringAssignment;

public class Question3 {

	public static void main(String[] args) {
String s1=new String("Java String pool refers to collection of Strings which are stored in heap memory");
//lowercase
System.out.println(s1.toLowerCase());
//Uppercase
System.out.println(s1.toUpperCase());

//replace with a with $


System.out.println(s1.replace("a","$"));
System.out.println(s1.contains("collection"));
System.out.println(s1.equals("java string pool refers to collection of strings which are stored in heap memory"));

//StringBuffer

StringBuffer st=new StringBuffer();
System.out.println(st.append("String buffers"));
System.out.println(st.append("is a peer class of strings"));
System.out.println(st.append("that provides much of"));
System.out.println(st.append("functionalities of strings"));
StringBuffer st1=new StringBuffer("it is used to _ at specied index position ");
System.out.println(st1.insert(st1.indexOf("_"),"insert text"));
StringBuffer st3=new StringBuffer("This method returns the reversed object on which it was called");
System.out.println(st3.reverse());


//StringBuilder

StringBuilder st4=new StringBuilder();
System.out.println(st4.append("String buffers"));
System.out.println(st4.append("is a peer class of strings"));
System.out.println(st4.append("that provides much of"));
System.out.println(st4.append("functionalities of strings"));
StringBuilder st5=new StringBuilder("it is used to _ at specied index position ");
System.out.println(st5.insert(st5.indexOf("_"),"insert text"));
StringBuilder st6=new StringBuilder("This method returns the reversed object on which it was called");
System.out.println(st6.reverse());

	}

}
