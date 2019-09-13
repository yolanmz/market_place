
public class Customer {
	private String name;
	private int balanceOfCustomer;
	private Basket wantedProducts;

	public Customer(String name, int balanceOfCustomer) {
		this.name = name;
		this.balanceOfCustomer = balanceOfCustomer;
		wantedProducts = new Basket(); 
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balanceOfCustomer;
	}
	public Basket getBasket() {
		return wantedProducts;
	}
	public int addFunds(int theAmountsToBeAdded) {
		if(theAmountsToBeAdded < 0) {
			throw new IllegalArgumentException("The amount is incorrect. Please try it again");	
		}
		balanceOfCustomer = balanceOfCustomer + theAmountsToBeAdded;
		return balanceOfCustomer;
		
	}
	public void addToBasket(MarketProduct mProduct) {
		wantedProducts.add(mProduct);
		
	}
	public boolean removeFromBasket(MarketProduct mProduct) {
		if(wantedProducts.remove(mProduct) == true) {
			return true;		
		}
		return false;
	}
	
	public String checkOut() {
		if (balanceOfCustomer < wantedProducts.getTotalCost()) {
			throw new IllegalStateException("Not enough money. Please come back again with more money");	
		}
		balanceOfCustomer = balanceOfCustomer - wantedProducts.getTotalCost();
		String receipt = wantedProducts.toString();
		wantedProducts.clear();
		return receipt;
		
				
	}

}
