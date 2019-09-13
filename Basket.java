
public class Basket {

	private MarketProduct[] marketProducts; 
	
	public Basket() {
		marketProducts = new MarketProduct[0];
	}
	
	public MarketProduct[] getProducts() {
		MarketProduct[] shallowCopy = marketProducts.clone();
		return shallowCopy;//create a shallow copy
	}
	
	public void add(MarketProduct mProduct) {
		MarketProduct[] newProducts = new MarketProduct[marketProducts.length + 1];//create a new array to fit mProduct in
		for (int i=0; i < marketProducts.length; i++) {
			newProducts[i] = marketProducts[i];
		}
		newProducts[marketProducts.length] = mProduct;
		marketProducts = newProducts;//point the variable to the new array we created
	}
	
	public boolean remove(MarketProduct mProduct) {
		int positionOfRemovedPoint = 0;
		for (int i=0; i<marketProducts.length; i++) {
			if (mProduct.equals(marketProducts[i])){
				positionOfRemovedPoint =i;//loop to locate the product where we want to remove 
				MarketProduct[] newProducts = new MarketProduct[marketProducts.length -1];
				for(int j=0; j<positionOfRemovedPoint; j++) {
					newProducts[j] = marketProducts[j];//copy the array before we reach the product we want to remove
				}
				for (int k=positionOfRemovedPoint; k<marketProducts.length-1; k++) {
					newProducts[k] = marketProducts[k+1];//copy the rest of the arrays(skip the point to remove)
					
					marketProducts = newProducts;//point the variable to the new array we created 
				}
				return true;
			}
		}
		return false;
	}
	
	public void clear() {
		marketProducts = new MarketProduct[0];
	}
	
	public int getNumOfProducts() {
		return marketProducts.length;
	}
	
	public int getSubTotal() {
		int sTotal = 0;
		for (int i=0; i<marketProducts.length; i++) {
			sTotal += marketProducts[i].getCost();
		}
		return sTotal;	
	}
	
	public int getTotalTax() {
		int tax = 0;
		for (int i=0; i<marketProducts.length; i++) {
			if(marketProducts[i] instanceof Jam) {
				tax = (int) (tax + marketProducts[i].getCost() * 0.15);
			}
		}
		return tax;
	}
	public int getTotalCost() {
		int subtotal = this.getSubTotal();
		int tax = this.getTotalTax();
		return subtotal + tax;	
	}
	
	public String toString() {
		
		String s = "" ; 
		for (int i=0; i< marketProducts.length; i++) {
			s = s + marketProducts[i].getName() + "\t" + marketProducts[i].getCost() + "\n";
		}
		
		String subTotal = "Subtotal" + "	\t" + getSubTotal();
		String tax = "Total" +" "+ "Tax" +"	" + getTotalTax();
		String totalCost = "Total" + " " + "Cost"+ "\t" + getTotalCost();
		
		String print = s + "\n" + subTotal + "\n" + tax + "\n\n" + totalCost;
		System.out.println(print);
		return print;
	
				
				
	}

}
