package inventory;

import java.util.Scanner;

public class InventoryTest {

	public static void main(String[] args) {

		Inventory vo = new Inventory(100);
		InventoryBiz biz = new InventoryBiz();
		printList(vo);
		while (true) {
			printMenu();
			int inputMenu = getUserInput();
			if (inputMenu == 9)
				break;

			int inputStockCount = 0;
			int inputSalesCount = 0;
			if (inputMenu == 1) {
				System.out.print("입고수량 => ");
				inputStockCount = getUserInput();
				biz.stockInventory(vo, inputStockCount);
			} else if (inputMenu == 2) {
				System.out.print("판매수량 => ");
				inputSalesCount = getUserInput();
				if(inputSalesCount > vo.getInvenCount()){
					System.out.println("판매불가! 재고가 부족합니다.");
					continue;
				}
				biz.salesInventory(vo, inputSalesCount);
			}
			printList(vo);
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

	private static void printMenu() {
		System.out.println("1.입고  2.판매  9.종료");
	}

	public static void printList(Inventory vo) {
		System.out.println("=======================================");
		System.out.println("입고수량\t판매수량\t재고수량");
		System.out.println("=======================================");
		int sum = 0;
		System.out.print(vo.getStockCount() + "\t");
		System.out.print(vo.getSalesCount() + "\t");
		System.out.println(vo.getInvenCount() + "\t");
		sum += vo.getInvenCount();
		System.out.println("=======================================");
		System.out.println("\t\t합계:" + sum);
		System.out.println("=======================================");
	}

	private static int getUserInput() {
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}

}
