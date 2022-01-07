package Order_and_pick_up;

import java.util.Scanner;

public class Order_and_pick_up {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		 String[] ingredients = { "Macaroni", "Spaghetti", "Bolognese", "Turkey meat", "Beef prosciutto", "Bacon",
		"Chicken meat", "4 cheeses", "Smoked cheese", "Parmesan", "Sour cream", "Pesto sauce", "Napolitana",
		"Vegetable mix", "Mushrooms", "Box" };

		 int[] prices = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };

		 String[] regularCustomers = { "0621122333", "0605544333", "0641234561", "0654321321", "0671234567" };

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
