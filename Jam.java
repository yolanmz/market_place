
public class Jam extends MarketProduct {
	int numOfJars;
	int pricePerJar;

	public Jam(String nameOfJam, int numOfJars, int pricePerJar) {
		super(nameOfJam);
		this.numOfJars = numOfJars;
		this.pricePerJar = pricePerJar;
				
	}
	public int getCost() {
		int cost = (int) (numOfJars * pricePerJar);//cast double to integer
		return cost;
	}
	public boolean equals(Object obj){
		if(obj instanceof Jam){
			if(((Jam) obj).getName().equals(this.getName())) {
				if(((Jam) obj).getCost() == this.getCost()) {
					if(((Jam) obj).numOfJars == numOfJars) {
						return true;
					}
				}
			}
			
		}
		return false;	
	}
}
