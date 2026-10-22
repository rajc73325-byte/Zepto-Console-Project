package ProductProject;

public abstract class Item implements Product{
	int qty;
	String name;
	double price;
	public Item(String name, double price, int qty) {
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	@Override
	public double getTotalPrice() {
		return price*qty;
	}
	@Override
	public void display() {
		System.out.println("Name \t : \t" + name);
		System.out.println("Price \t : \t" + price);
		System.out.println("Quantity \t : \t" + qty);
//		System.out.println("--------Total Price ---------");
//		System.out.println(getTotalPrice());
	}
}


