package ProductProject;

public abstract class Fruit extends Item{
	public Fruit(String name, double price, int qty) {
		super(name, price, qty);
	}
//	public String toString() {
//		return "\nProdeuct Name : " + name+
//				"\nProduct Price : " + price+
//				"\nQuantity : " + qty+
//				"\n Total Price : " + qty*price;
//	}
}
