
public abstract class MarketProduct {
	private String name;
	public MarketProduct(String name) {
		this.name = name; //initiate the String with the variable
	}
	public final String getName() {
		return name;
	}
	public abstract int getCost();
	public abstract boolean equals(Object typeOfProduct);

}
