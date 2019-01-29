

import java.util.Scanner;

public class StockCommission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the amount of stock");
		double stock = keyboard.nextDouble();
		
		System.out.println("What is the price");
		double price = keyboard.nextDouble();
		
		keyboard.close();
		
		double commission = (stock * price) * 0.02;
		
		System.out.println("The Commission is: $" + commission);
		
		
	}

}
