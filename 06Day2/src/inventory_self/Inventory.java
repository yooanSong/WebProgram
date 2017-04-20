//물품의 입고수량, 판매수량, 재고수량 정보저장

package inventory_self;

public class Inventory {
	private int stockCount;
	private int salesCount;
	private int invenCount;
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Inventory(int invenCount) {
		super();
		this.invenCount = invenCount;
	}
	public int getStockCount() {
		return stockCount;
	}
	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}
	public int getSalesCount() {
		return salesCount;
	}
	public void setSalesCount(int salesCount) {
		this.salesCount = salesCount;
	}
	public int getInvenCount() {
		return invenCount;
	}
	public void setInvenCount(int invenCount) {
		this.invenCount = invenCount;
	}
	
	
	
	

}
