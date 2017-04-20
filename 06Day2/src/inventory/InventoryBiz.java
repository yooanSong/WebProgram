package inventory;

public class InventoryBiz {

	
	public void stockInventory(Inventory inven , int count){
		inven.setStockCount(inven.getStockCount() + count);
		inven.setInvenCount(inven.getInvenCount() + count);
	}
	
	
	public void salesInventory(Inventory inven , int count){
		inven.setSalesCount(inven.getSalesCount() + count);
		inven.setInvenCount(inven.getInvenCount() - count);
	}
}
