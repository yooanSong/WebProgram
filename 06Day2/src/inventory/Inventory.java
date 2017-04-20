package inventory;
public class Inventory {

	private int stockCount; 
	private int salesCount; 
	private int invenCount; 
	
	public Inventory() {}
	public Inventory(int invenCount) {
		this.invenCount = invenCount;
	}
	public int getSalesCount() {
		return salesCount;
	}
	public void setSalesCount(int salesCount) {
		this.salesCount = salesCount;
	}
	public int getStockCount() {
		return stockCount;
	}
	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}
	public int getInvenCount() {
		return invenCount;
	}
	public void setInvenCount(int invenCount) {
		this.invenCount = invenCount;
	}

	
}
