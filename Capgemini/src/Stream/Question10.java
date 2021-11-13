package Stream;



	
	
	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Stream;

	public class Question10 {

		String name;
		String city;
		public Question10(String name, String city) {
			super();
			this.name = name;
			this.city = city;
		}

		public static void main(String[] args)
		{
			List<Question10> list=Arrays.asList(
					new Question10("Iron Man", "Pune"),
					new Question10("Thor", "Bangalore"),
					new Question10("Hulk", "Pune"),
					new Question10("Captain", "Delhi")
					);
			

			list.stream().filter(x->x.city.contains("Pune"))
			.map(x->x.name)
			.sorted()
			.forEach(System.out::println);

			

		}

		@Override
		public String toString() {
			return "Trader [name=" + name + ", city=" + city + "]";
		}
	}


	


	




