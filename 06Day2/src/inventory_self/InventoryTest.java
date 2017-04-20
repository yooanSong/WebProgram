package inventory_self;

import java.util.Scanner;
public class InventoryTest {

	public static void main(String[] args) {
		Inventory vo=new Inventory(100);
		InventoryBiz biz = new InventoryBiz();
		printList(vo);
		while(true){
			printMenu();
			int inputMenu= getUserInput();
			if(inputMenu== 9)
				break;
			
		}

	private static void printList(Inventory vo) {
		// TODO Auto-generated method stub
		
	}
	}
	


		
		
	}//end main
}//end class
