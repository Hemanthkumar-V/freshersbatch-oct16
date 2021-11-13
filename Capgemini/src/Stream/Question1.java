package Stream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Fruits {
	
	private String name;
	private int calories;
	private int price;
	private String color;
	
	public Fruits(String name,Integer calories,Integer price,String color) {
		this.name=name;
		this.calories=calories;
		this.price=price;
		this.color=color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
    public String toString() {
    	return this.name+ " " + this.calories+ " " + this.price+" " +  this.color + " ";
    	

    }
    
}

public class Question1 
{

	public static void main(String[] args) 
	{
		
		List<Fruits> fruitslist=Arrays.asList(new Fruits("Mango",95, 90,"Yellow"),
		new Fruits("Apple", 95, 30, "Red"),
	    new Fruits("Strawberry", 25, 10,"Red"),
		new Fruits("Cherry", 10, 10, "Red"),
		new Fruits("Grapes", 15, 20, "Green"));
		
		//fruits.forEach(System.out::println);
	
		List<Fruits>sortedList=fruitslist.stream().sorted(Comparator.comparingInt(Fruits::getCalories).reversed()).collect(Collectors.toList());
		System.out.println("Fruits with calories<100 are:");
		sortedList.forEach(System.out::println);

		
		

	}

}
