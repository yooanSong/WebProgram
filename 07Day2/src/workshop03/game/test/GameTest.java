package workshop03.game.test;

import workshop03.game.biz.GameBiz;
import workshop03.game.entity.Game;
import workshop03.game.util.GameUtil;

public class GameTest {

	public static void main(String[] args) {
		
		//����
		Game [] gameList = new Game[5];
		gameList[0] = new Game("game01", "��Ÿ", Game.RPG, new String[]{"�ѱ�","�Ϻ�","�̱�"}, 2, 8, 0);
		gameList[1] = new Game("game02", "����2000",  Game.SPORT, new String[]{ "�Ϻ�","�̱�","�߱�","������"}, 4, 8, 0);
		gameList[2] = new Game("game03", "�������",  Game.FPS, new String[]{"����","�Ϻ�"}, 2, 4, 0);
		gameList[3] = new Game("game04", "����89",  Game.SPORT, new String[]{"�̱�", "�ѱ�","�Ϻ�","�߱�","����"}, 1, 3, 0);
		gameList[4] = new Game("game05", "��ƺ��2",  Game.RPG , new String[]{"�ѱ�"}, 1, 8, 0);
		
		
		
		GameBiz biz = new GameBiz();
		
		while (true) {
			printMenu();
			String inputMenu = GameUtil.getUserInput();
			if (inputMenu.equals("1")) {
				biz.printGameList(gameList);
			} else if (inputMenu.equals("2")) {
				biz.printGameList(gameList , Game.RPG);
			} else if (inputMenu.equals("3")) {
				biz.printGameList(gameList , Game.SPORT);
			} else if (inputMenu.equals("4")) {
				biz.printGameList(gameList , Game.FPS);
			} else if (inputMenu.equals("5")) {
				biz.reservationGame(gameList);
			} else if (inputMenu.equals("6")) {
			   biz.printRunningGame(gameList);
			} else if( inputMenu.equals("9")) {
				break;
			} else {
				System.out.println("�޴����� Ȯ���� �ٽ� �Է��ϼ���");
			}
		}

		System.out.println("���α׷� ����");

	}
	
	

	private static void printMenu() {
		System.out.println("============================");
		System.out.println("[���� ���� ���� �ý���]");
		System.out.println("============================");
		System.out.println("1.��ü ���� ���� ����");
		System.out.println("2.RPG ���� ���� ����");
		System.out.println("3.Sport ���� ���� ����");
		System.out.println("4.FPS ���� ���� ����");
		System.out.println("5.���� ����");
		System.out.println("6.���۵� ���� ����");
		System.out.println("9.����");
		System.out.println("============================");
		System.out.print("�޴� �Է� => ");
	}

}
