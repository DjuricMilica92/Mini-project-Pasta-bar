package Order_and_pick_up;

import java.util.Scanner;

public class Order_and_pick_up {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		 String[] ingredients = { "Macaroni", "Spaghetti", "Bolognese", "Turkey meat", "Beef prosciutto", "Bacon",
		"Chicken meat", "4 cheeses", "Smoked cheese", "Parmesan", "Sour cream", "Pesto sauce", "Napolitana",
		"Vegetable mix", "Mushrooms", "Box" };
		 
		 
		 int[] prices = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };

		 String[] regularCustomers = { "0631111111", "063222222", "063333333", "064444444", "065555555", "066666666" };
		 
		 String ingredientName="";
		 String phone="";
		 double fullPrice=0;
		 
		 
		System.out.println("Welcome to 'Fantasy pasta bar'!");
		System.out.println("*******************************");
		System.out.println("Here you can make your own paste!");
		System.out.println("*******************************");

		while (!ingredientName.equals("Order")) {
			System.out.println("Choose an ingredient: ");
			ingredientName = s.nextLine();
		
		if(!ingredientName.equals("Order")) {
			int index = findIngredient(ingredients, ingredientName);
			int price=prices[index];
			fullPrice=fullPrice + price;
		}
	}
		System.out.println("Insert your phone number: ");
		phone = s.next();
		
		boolean isRegular= isRegularCustomer(regularCustomers, phone);
		
		if(isRegular) {
			fullPrice=fullPrice- fullPrice*10/100;
			System.out.println("Price for your paste is " + fullPrice + " RSD.");
		}
		System.out.println("Price for your paste is " + fullPrice + " RSD.");
		 

	}
	public static int findIngredient(String[] ingredients, String ingredientName) {
		int index = 0;
		for (int i = 0; i < ingredients.length; i++)
			if (ingredientName.equals(ingredients[i])) {
				return index = i;
			}
		return index;
	}
	public static boolean isRegularCustomer(String[] regularCustomers, String phone) {
		boolean isRegularCustomer = false;
		for (int i = 0; i < regularCustomers.length; i++) {
			if (phone.equals(regularCustomers[i]))
				isRegularCustomer = true;
		}
		return isRegularCustomer;

}
}