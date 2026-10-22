package ProductProject;

import java.util.Scanner;
import java.util.ArrayList;
public class Controller {
	 static ArrayList<Product> cart = new ArrayList<Product>();
	 static double totalPrice = 0.0;
	 
	 public static void addCart(Product item) {
		 if(item != null) {
			 
		 	 cart.add(item);
			 System.out.println("Your item is added to cart !!");
		 }
	 }
	 public static void showCart() {
		 if(cart.isEmpty()) {
			 System.out.println("Your cart is Empty please add items !!");
			 return;
		 }
		 System.out.println("\t\t-----------Cart Item -----------\t\t");
		 totalPrice = 0.0;
		 for(int i = 0 ; i <= cart.size()-1 ; i++) {
//			 System.out.println(i+1 + " Product is => " + cart.get(i));
			 cart.get(i).display();
			 totalPrice = totalPrice + cart.get(i).getTotalPrice();
		 }
	 }
	 
	 public static double getDiscount() {
		 if(totalPrice >= 1000 && totalPrice <2000) {
			 System.out.print("Your total bill after 100rs discount => ");
			 totalPrice = totalPrice - 100;
			 System.out.println(totalPrice);
		 }else if(totalPrice >= 2000) {
			 double discount = 0.0;
			 System.out.print("Your total bill after 10% discount => ");
			 discount = (totalPrice/100) * 10;
			 totalPrice = totalPrice - discount;
			 System.out.println(totalPrice);
		 }
	
		 //Travel inside cart
		 //Find out total bill amount
		 // check if(Bil78lAmount > 1000)---> 100rs discount
		 //else if(BillAmount > 2000) ----> 10% discount
		 return 0.0;
	 }
	 
	 public static void payBill(double bill) {
		 
	 }
	 
//	 public static double placeOrder() {
//		 return 0.0;
//	 }
	 
//	 
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 while(true) {
		 System.out.println();
		 System.out.println();
		 System.out.println("\t ---------- Your Menu ----------");
		 System.out.println("Press 1 for Vegetable Items !! ");
		 System.out.println("Press 2 for Fruit Items !! ");
		 System.out.println("Press 3 for Drinks Items !! ");
		 System.out.println("Press 4 for Electronics Items !! ");
		 System.out.println("Press 5 to view cart !! ");
		 //System.out.println(" !!");
		 System.out.println("Press 0 to exit cart !!");
		 System.out.println();
		 System.out.print("Enter you Choice : ");
		 int taskInput = input.nextInt();
		 if(taskInput == 0) {
			 System.out.println("Thank you !, please come again ");
			 return;
		 }
		 if(taskInput == 1) {
			 
			 System.out.println("\t ------------ Welcome in Vegeatables ----------");
			 System.out.println("Press 1 for Peas !!");
			 System.out.println("Press 2 for Chilies !!");
			 System.out.println("Press 0 for exit !!");
			 System.out.println();
			 System.out.print("Enter you Choice : ");
			 int choice = input.nextInt();
			 
			 Product item;
			 
			 if(choice == 0) {
				 System.out.println("Thank you for shopping from Vegetables, please come again");
				 return;
			 }
			 if(choice == 1) {
				 System.out.println("Your Vegetable name is  = Peas");
				 System.out.println("Peas Price is = 40rs" );
				 System.out.println("is Seasonal = " +  true );
				 System.out.print("Enter your Quantity : ");
				 int qty = input.nextInt();
				 item = new Peas(qty);
				 addCart(item);
				 
			 }else if(choice == 2) { 
				 System.out.println("Your Vegetable name is  = chilies");
				 System.out.println("Chilies Price is = 20rs" );
				 System.out.println("is Seasonal = " +  true );
				 System.out.print("Enter your Quantity in kg: ");
				 int qty = input.nextInt();
				 item = new Chilies(qty);
				 addCart(item);
			 }
			 
			 
		 }else if(taskInput == 2) {
			 System.out.println("\t ------------ Welcome in Fruit Items ----------");
			 System.out.println("Press 1 for Apple !!");
			 System.out.println("Press 2 for Mango !!");
			 System.out.println("Press 3 for Melan !!");
			 System.out.println("Press 0 for exit !!");
			 System.out.println();
			 System.out.print("Enter you Choice : ");
			 int choice = input.nextInt();
			 
			 Product item;
			 if(choice == 0) {
				 System.out.println("Thank you for shopping from Vegetables, please come again");
				 return; 
			 }
			 
			 if(choice == 1) {
				 System.out.println("Your Fruit name is  = Apple");
				 System.out.println("Apple Price is = 50rs" );
				 System.out.println("is Seasonal = " +  false );
				 System.out.print("Enter your Quantity in kg: ");
				 int qty = input.nextInt();
				 item = new Apple(qty);
				 addCart(item);
			 }else if(choice == 2) {
				 System.out.println("Your Fruit name is  = Mango");
				 System.out.println("Mango Price is = 45rs" );
				 System.out.println("is Seasonal = " +  true );
				 System.out.print("Enter your Quantity in kg: ");
				 int qty = input.nextInt();
				 item = new Mango(qty);
				 addCart(item);
				 
			 }else if(choice == 3) {
				 System.out.println("Your Fruit name is  = Melan");
				 System.out.println("Melan Price is = 25rs" );
				 System.out.println("is Seasonal = " +  true );
				 System.out.print("Enter your Quantity in kg: ");
				 int qty = input.nextInt();
				 item = new Melan(qty);
				 addCart(item);
			 }
		 }else if(taskInput == 3) {
			 System.out.println("\t ------------ Welcome in Drink Items ----------");
			 System.out.println("Press 1 for Applefizz !!");
			 System.out.println("Press 2 for Sprite !!");
			 System.out.println("Press 3 for Fruity !!");
			 System.out.println("Press 0 for exit !!");
			 System.out.println();
			 System.out.print("Enter you Choice : ");
			 int choice = input.nextInt();
			 
			 Product item;
			 if(choice == 0) {
				 System.out.println("Thank you for shopping from Drinks Item, please come again");
				 return; 
			 }
			 if(choice == 1) {
				 System.out.println("Your Drink name is  = Applefizz");
				 System.out.println("Apple Price is = 90rs" );
				 System.out.print("Enter your Quantity : ");
				 int qty = input.nextInt();
				 item = new Applefizz(qty);
				 addCart(item);
			 }else if(choice == 2) {
				 System.out.println("Your Drink name is  = Sprite");
				 System.out.println("Sprite Price is = 95rs" );
				 System.out.print("Enter your Quantity : ");
				 int qty = input.nextInt();
				 item = new Sprite(qty);
				 addCart(item);
				 
			 }else if(choice == 3) {
				 System.out.println("Your Drink name is  = Fruity");
				 System.out.println("Fruity Price is = 20rs" );
				 System.out.print("Enter your Quantity : ");
				 int qty = input.nextInt();
				 item = new Fruity(qty);
				 addCart(item);
			 }
		 }else if(taskInput == 4) {
			 System.out.println("\t ------------ Welcome in Electronics Items ----------");
			 System.out.println("Press 1 for Laptop !!");
			 System.out.println("Press 2 for TV !!");
			 System.out.println("Press 3 for Mobile !!");
			 System.out.println("Press 0 for exit !!");
			 System.out.println();
			 System.out.print("Enter you Choice : ");
			 int choice = input.nextInt();
			 
			 Product item;
			 if(choice == 0) {
				 System.out.println("Thank you for shopping from Electronics Item, please come again");
				 return; 
			 }
			 if(choice == 1) {
				 System.out.println("Your Electronic name is  = Laptop");
				 System.out.println("Laptop Price is = 25000rs" );
				 System.out.print("Enter your Quantity : ");
				 int qty = input.nextInt();
				 item = new Laptop(qty);
				 addCart(item);
			 }else if(choice == 2) {
				 System.out.println("Your Electronic name is  = TV");
				 System.out.println("TV Price is = 13000rs" );
				 System.out.print("Enter your Quantity : ");
				 int qty = input.nextInt();
				 item = new TV(qty);
				 addCart(item);
				 
			 }else if(choice == 3) {
				 System.out.println("Your Electronic name is  = Mobile");
				 System.out.println("Mobile Price is = 15000rs" );
				 System.out.print("Enter your Quantity : ");
				 int qty = input.nextInt();
				 item = new Mobile(qty);
				 addCart(item);
			 }
			 
		 }
		 else if(taskInput == 5) {
			 showCart();
			 System.out.println("--------Total Price ---------");
			 System.out.println(totalPrice);
			 System.out.print("Press 'Y' to to check you have discount or not : ");
			 //System.out.println("Press 'M' for more shoping.");
			 //System.out.print("Enter your choice : ");
			 char ch = input.next().charAt(0);
//			 if(ch == 'm' || ch == 'M') {
//				 ;
//			 }else 
			 //double tempBill = 0.0;
			if(ch == 'y' || ch == 'Y') {
			 	if(totalPrice >= 1000) {
					 System.out.println("Yes, You have discount !! ");
					 System.out.println("If you want to get discount than press 'Y' !! ");
					 System.out.println("If you do not want to discount than again press 'N' !! ");
					 System.out.println("Enter your choice :");
					 char ch1 = input.next().charAt(0);
					 if(ch1 == 'y' || ch1 == 'Y') {
						 getDiscount();
						 //tempBill = totalPrice;
					 }else {
						 System.out.println("Okay, your total price is => " + totalPrice);
					 }
				 }else {
					 System.out.println("You have not any discount, your total price is => " + totalPrice);
				 }
			 	
			 }else {
				 System.out.println("Now your total price without any discount => " + totalPrice);
			 }
			 System.out.println("Press 1 for pay Bill.");
			 System.out.println("Press 2 for more shoping.");
			 System.out.print("Enter your choice : ");
			 int num = input.nextInt();
//			 if(num == 1 || num == 2) {
//				 System.out.println("Invalid choice !!");
//				 return;
//			 }
			 if(num == 1) {
				 System.out.println("Your total bill => " + totalPrice);
				 System.out.print("Enter money to pay : ");
				 double bill = input.nextDouble();
				 if(totalPrice == bill) {
					System.out.println("Payment is Succesfull....");
				 }else if(totalPrice > bill){
					 System.out.println("Unpaid, Please pay Total Bill ------->");
					 System.out.println("Bill =>" + (totalPrice-bill));
					 System.out.print("Enter amount to pay : ");
					 double pay = input.nextDouble();
					 if((totalPrice-bill) == pay) {
						 System.out.println("Payment is Succesfull....");
					 }else if(pay > (totalPrice-bill)) {
						 System.out.println("Payment is Succesfull....");
						 System.out.println("Thank you for tip => " + (totalPrice-bill));
					 }
				 }else if(totalPrice < bill) {
					 System.out.println("Payment is Succesfull....");
					 System.out.println("Thank you for tip => " + (totalPrice - bill));
				 }
			 }else if(num == 2) {
			 }
			 
			 
		 }
		 
		 
		 
		 
		 
		 }
		 
		 
	 }
	 
	 

}
