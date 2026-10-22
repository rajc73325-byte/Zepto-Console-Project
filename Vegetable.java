package ProductProject;

public abstract class Vegetable extends Item{
	final static String unit = "KilloGrams";
	boolean isSeasonal;
	public Vegetable(String name, double price, int qty, boolean isSeasonal) {
		super(name, price, qty);
		this.isSeasonal = isSeasonal;
	}
	@Override
	public void display(){
		System.out.println("Name \t : \t" + name);
		System.out.println("Price \t : \t" + price);
		System.out.println("Quantity \t : \t" + qty);
		//System.out.println("--------Total Price ---------");
		//System.out.println(getTotalPrice());
	}
	
//	@Override
//	public String toString() {
//		return "\nProdeuct Name : " + name+
//				"\nProduct Price : " + price+
//				"\nQuantity : " + qty+
//				"\n Total Price : " + qty*price;
//	
//	}

}
