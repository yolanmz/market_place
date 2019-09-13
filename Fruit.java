
public class Fruit extends MarketProduct {
	
	private double weightInKg;
	private int pricePerKg;

	public Fruit(String nameOfFruit, double weightInKg, int pricePerKg) {
			super(nameOfFruit);
			this.weightInKg =weightInKg;
			this.pricePerKg = pricePerKg;
	}
	public int getCost() {
		
		return (int)(weightInKg * pricePerKg);
	}
	public boolean equals(Object obj) {
		if(obj instanceof Fruit){
			if(((Fruit) obj).getName().equals(this.getName())) {
				if(((Fruit) obj).getCost() == this.getCost()) {
					if(((Fruit) obj).weightInKg == this.weightInKg) {
						return true;
					}
				}
			}
		}
		return false;
	}
	

}
