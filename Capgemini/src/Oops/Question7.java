package Oops;


	import java.util.Scanner;
	 abstract class DessertItem
	{
		public abstract int getCost();

	}




	 class IceCream extends DessertItem{
		private int icecreamCost;
		private int icecreams;
		private int icecreamOrdered;
		
		
		private static IceCream singleton_obj=null;
		private IceCream()
		{
			//System.out.println("First instance");
		}
		public static IceCream getInstance()
		{
			if(singleton_obj==null)
			{
				singleton_obj=new IceCream();
			}
			return singleton_obj;
		}
		
		
		
		
		
		@Override
		public int getCost() {
			// TODO Auto-generated method stub
			System.out.println("Icecream cost:"+ this.icecreamCost +" Icecreams:"+this.icecreams+" icecreams ordered:"+this.icecreamOrdered);

			return this.icecreamCost*this.icecreamOrdered;
		}
		/**
		 * @param icecreamCost the icecreamCost to set
		 */
		public void setIcecreamCost(int icecreamCost) {
			this.icecreamCost = icecreamCost;
		}
		public void addiceCream(int icecreams) {
			// TODO Auto-generated method stub
			this.icecreams=icecreams;
			System.out.println("Icecream cost:"+ this.icecreamCost +" Icecreams:"+this.icecreams+" icecreams ordered:"+this.icecreamOrdered);

		}
		public void updateIceCreams(int icecreams) {
			// TODO Auto-generated method stub
			this.icecreams-=icecreams;
			this.icecreamOrdered=icecreams;
			
		}
		

	}



	 class Cookie extends DessertItem{
		private int cookieCost;
		private int cookies;
		private int cookiesOrdered;
		
		
		private static Cookie singleton_obj=null;
		private Cookie()
		{
			//System.out.println("First instance");
		}
		public static Cookie getInstance()
		{
			if(singleton_obj==null)
			{
				singleton_obj=new Cookie();
			}
			return singleton_obj;
		}
		
		
		
		
		@Override
		public int getCost() {
			// TODO Auto-generated method stub
			System.out.println("Cookie cost:"+ this.cookieCost +" Cookies:"+this.cookies+" cookies ordered:"+this.cookiesOrdered);

			return this.cookieCost*70*this.cookiesOrdered;
		}
		/**
		 * @param cookieCost the cookieCost to set
		 */
		public void setCookieCost(int cookieCost) {
			this.cookieCost = cookieCost;
		}
		public void addCookie(int cookies) {
			// TODO Auto-generated method stub
			this.cookies=cookies;
			System.out.println("Cookie cost:"+ this.cookieCost +" Cookies:"+this.cookies+" cookies ordered:"+this.cookiesOrdered);

			
		}
		public void updateCookies(int cookies2) {
			// TODO Auto-generated method stub
			this.cookies-=cookies2;
			this.cookiesOrdered=cookies2;
		}
		

	}


	 class Candy extends DessertItem {
		private int candycost;
		private int candies;
		private int candyOrdered;
		
		
		
		private static Candy singleton_obj=null;
		private Candy()
		{
			//System.out.println("First instance");
		}
		public static Candy getInstance()
		{
			if(singleton_obj==null)
			{
				singleton_obj=new Candy();
			}
			return singleton_obj;
		}
		
		
		
		
		@Override
		public int getCost() {
			// TODO Auto-generated method stub
			System.out.println("Candycost:"+ this.candycost +" Candies:"+this.candies+" candies ordered:"+this.candyOrdered);
			return this.candycost*60*this.candyOrdered;
			
		}
		/**
		 * @return the candycost
		 */
		
		/**
		 * @param candycost the candycost to set
		 */
		public void setCandycost(int candycost) {
			this.candycost = candycost;
		}

		public void addCandy(int candies) {
			// TODO Auto-generated method stub
			this.candies=candies;
			System.out.println("Candycost:"+ this.candycost +" Candies:"+this.candies+" candies ordered:"+this.candyOrdered);
			
		}

		public void updateCandies(int candies2) {
			// TODO Auto-generated method stub
			this.candies-=candies2;
			this.candyOrdered=candies2;
			
		}
		

	}


	 class Customer {

		private int candies;
		private int cookies;
		private int icecreams;
		private int totalCost;

		public void orderItems() {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of items you want to order");
			System.out.println("Enter number of candies:");
			this.candies=sc.nextInt();		
			System.out.println("Enter number of cookies:");
			this.cookies=sc.nextInt();
			System.out.println("Enter number of Ice creams:");
			this.icecreams=sc.nextInt();
			//Cookie co2 = new Cookie();
			Cookie co1=Cookie.getInstance();
			co1.updateCookies(cookies);
			Candy ca1=Candy.getInstance();
			ca1.updateCandies(candies);
			IceCream ice1=IceCream.getInstance();
			ice1.updateIceCreams(icecreams);
			this.totalCost=co1.getCost()+ca1.getCost()+ice1.getCost();
			System.out.println("The total cost is:"+this.totalCost);
		
		}
		

	}



	 class Owner {
		private int cookies;
		private int candies;
		private int icecreams;
		private int candiecost;
		private int cookiecost;
		private int icecreamcost;
		public void addItems() {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			Cookie co=Cookie.getInstance();
			Candy ca=Candy.getInstance();
			IceCream ice=IceCream.getInstance();
			System.out.println("Enter cost of candy in $:");
			candiecost = sc.nextInt();
			System.out.println("Enter cost of cookie in euros:");
			cookiecost=sc.nextInt();
			System.out.println("Enter cost of icecream in rs:");
			icecreamcost=sc.nextInt();
			co.setCookieCost(cookiecost);
			ca.setCandycost(candiecost);
			ice.setIcecreamCost(icecreamcost);
			
			System.out.println("Enter the number of items to be added in storage");
			System.out.println("Enter number of candies:");
			this.candies=sc.nextInt();		
			System.out.println("Enter number of cookies:");
			this.cookies=sc.nextInt();
			System.out.println("Enter number of Ice creams:");
			this.icecreams=sc.nextInt();	
			
			co.addCookie(cookies);
			
			ca.addCandy(candies);
			
			ice.addiceCream(icecreams);
		}

	}





	public class Question7 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc=new Scanner(System.in);
			String s;
			do
			{
			System.out.print("Enter your role:");
			s = sc.next();
			if(s.equalsIgnoreCase("owner"))
			{
				Owner o=new Owner();
				o.addItems();
				System.out.println("Owner completed");
			}
			else if(s.equalsIgnoreCase("customer"))
			{
				Customer c=new Customer();
				c.orderItems();
			}
			else
			{
				System.out.println("Wrong choice..Try again");
			}

			}while(!s.equalsIgnoreCase("Stop"));
		}

	}


