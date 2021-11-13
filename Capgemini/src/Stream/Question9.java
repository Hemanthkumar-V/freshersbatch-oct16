package Stream;



	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Stream;

	public class Question9 {

		String name;
		String city;
		public Question9(String name, String city) {
			super();
			this.name = name;
			this.city = city;
		}

		public static void main(String[] args)
		{
			List<Question9> list=Arrays.asList(
					new Question9("Iron Man", "Pune"),
					new Question9("Thor", "Bangalore"),
					new Question9("Hulk", "Pune"),
					new Question9("Captain", "Delhi")
					);
			

			//Question 9
			list.stream().map(x-> x.city)
			.distinct()
			.forEach(System.out::println);


			System.out.println("==========================================");


			

		}

		@Override
		public String toString() {
			return "Trader [name=" + name + ", city=" + city + "]";
		}
	}


	


	


