
public class Egg extends MarketProduct {
	private int numOfEggs;
	private int priceByDozen;
	
	

	public Egg(String nameOfEggs, int numOfEggs, int priceByDozen) {
		super(nameOfEggs);
		this.numOfEggs = numOfEggs;
		this.priceByDozen = priceByDozen;
	}

	public int getCost() {
		int cost = (int) (numOfEggs * priceByDozen/12);
		return cost;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Egg){//compare if the classes are equal
			if(((Egg) obj).getName().equals(this.getName())) {
				if(((Egg) obj).getCost() == this.getCost()) {
					if(((Egg) obj).numOfEggs == this.numOfEggs) {
						return true;
					}
				}
			}
		}
		return false;	
	}


}
