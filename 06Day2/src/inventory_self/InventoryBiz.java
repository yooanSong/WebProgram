//물품에 대한 비즈니스 로직을 처리하는 
//클래스 
package inventory_self;

public class InventoryBiz {
	
	public void stockInventory(Inventory inven, int count){
		inven.setStockCount(inven.getStockCount()+count);
		inven.setInvenCount(inven.getInvenCount()+count);
	}
	
	public void salesInventory(Inventory inven, int count){
		inven.setSalesCount(inven.getSalesCount()+count);
		inven.setInvenCount(inven.getInvenCount()-count);
	}

}

