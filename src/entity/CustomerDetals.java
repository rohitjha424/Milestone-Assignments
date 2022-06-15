package entity;

public class CustomerDetals {
	
	private int id;
	private String name;
	private int purchaseAmount;
	
	
	public CustomerDetals(int id, String name, int purchaseAmount) {
		super();
		this.id = id;
		this.name = name;
		this.purchaseAmount = purchaseAmount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPurchaseAmount() {
		return purchaseAmount;
	}
	public void setPurchaseAmount(int purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}
	
	@Override
	public String toString() {
		return "Customer id = " + id + ", \t Cutomer Name = " + name + ", \tPurchase Amount = " + purchaseAmount + "";
		
		
	}
	
	
	
}
