package typing;
import java.util.Random;
import java.util.Scanner;


public class TypingBiz {
	
	private String[] words;
	
	public TypingBiz(){
		words = new String[] { "JAVA", "java", "LG", "lg" , "LOVE"};
	}
	
	public  void printMessage() {
		double result = 0.0;
		double good = 0.0;
		long startTime = System.currentTimeMillis();
		
		System.out.println("��ü �ܾ� ����Ʈ");
		System.out.println("============================================");
		for (String str : words) {
			System.out.print(str+"\t");
		} 
		System.out.println("\n============================================");
		Random rand = new Random();
		for (int i = 5; i > 0; i--) {
			System.out.println("\n���� �ܾ�� : " + i);
			int r = rand.nextInt(i);
			String rStr = words[r];
			System.out.println("\n�����ܾ�:"+rStr);
			System.out.print("Ÿ���� �Է� => ");
			String inputTyping = getUserInputString();
			if (rStr.equals(inputTyping)) {
				System.out.println("��!");
				good++;
			} else {
				System.out.println("��!");
			}
			for (int j = r; j < i - 1; j++) {
				words[j] = words[j + 1];
			}
		}
		result = good/5*100;
		long endTime = System.currentTimeMillis();
		System.out.println("----------------------------");
		System.out.println("������ : "+result+"%");
		System.out.println("�ð� : "+(double)((endTime-startTime)/1000)+"��");
		System.out.println("----------------------------");
		
	}//end printStart

	public  String getUserInputString() {
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}

	public  void printMenu() {
		System.out.println("============================");
		System.out.println("[Ÿ�� ����]");
		System.out.println("1.����");
		System.out.println("2.����");
		System.out.println("============================");
		System.out.print("�޴� �Է� => ");
	}
}
