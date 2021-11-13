package collection;

	import java.util.*;
	import java.util.Map.Entry;
	public class Question1 {
	public static void main(String[] args) {
		Long a1= Long.valueOf(56465654534l);
		Long a2=Long.valueOf(56465654534l);
		Long a3=Long.valueOf(56465654534l);
		Contact c1=new Contact(12,"hemanth",Gender.male);
		Contact c2=new Contact(13,"hemanth",Gender.female);
		Contact c3=new Contact(14,"hemanth",Gender.male);
	Map<Long,Contact> indmap = new HashMap<Long, Contact>();
	indmap.put(a1, c1);
	indmap.put(a2, c2);
	indmap.put(a3, c3);
	System.out.println(indmap);
	Set<Entry<Long,Contact>> set=indmap.entrySet();
	for(Entry<Long,Contact> entry:set) {
	Long key=entry.getKey();
	Contact val=entry.getValue();
	System.out.println(key+" = "+" "+val);
	}
	System.out.println("Iterating Map using keySet()");
	Set<Long> s=indmap.keySet();
	for(Long i:s) {
	System.out.println("Key ="+" "+i);
	}
	System.out.println("Iterating Map using values()");
	Collection<Contact> c=indmap.values();
	for(Contact s1:c) {
	System.out.println("value ="+" "+s1);
	}
	}
	
	

	}
/*lass Long
{
private long a1;

public Long(long l) {
	this.a1=a1;
}
public long getA1() {
	return a1;
}
@Override
public String toString() {
	return " a1= "+ a1 ;
}

}*/
enum Gender{male,female};
class Contact
{
	private int id;
	private String name;
	private Gender gender;
	public Contact(int id, String name, Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Gender getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return " id=" + id + " name=" + name + " gender=" + gender ;
	}
	
}

