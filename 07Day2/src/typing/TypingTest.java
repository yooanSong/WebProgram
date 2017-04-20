package typing;
public class TypingTest {

	public static void main(String[] args) {

		
		TypingBiz biz = new TypingBiz();
		
		while (true) {
			biz.printMenu();
			String inputMenu = biz.getUserInputString();
			if (inputMenu.equals("1")) {
				biz.printMessage();
			}else if(inputMenu.equals("2")) {
				break;
			}else{
				System.out.println("�߸� �Է��ϼ̽��ϴ�. Ȯ���� �ٽ� �Է��ϼ���");
			}
		}

		System.out.println("���α׷� ����");
	}
}
