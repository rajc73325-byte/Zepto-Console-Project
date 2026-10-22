package ProductProject;

public abstract class Drink extends Item{
	public Drink(String name, double price, int qty) {
		super(name, price, qty);
	}
//	@Override
//	public String toString() {
//		return "\nProdeuct Name : " + name+
//				"\nProduct Price : " + price+
//				"\nQuantity : " + qty+
//				"\n Total Price : " + qty*price;
//	}
}
