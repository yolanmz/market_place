
public class SeasonalFruit extends Fruit {//subclass of Fruit

	public SeasonalFruit(String nameOfFruit, double weightInKg, int pricePerKg) {
		super(nameOfFruit, weightInKg, pricePerKg);
		

	}
	public int getCost() {
		int cost = (int) ((1-0.15)*super.getCost());//get discounted cost
		return cost;
	}

}
