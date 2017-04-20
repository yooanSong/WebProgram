package workshop03.game.biz;

import workshop03.game.entity.Game;
import workshop03.game.util.GameUtil;

public class GameBiz {

	//��ü ���� ���
	public void printGameList(Game[] gameList) {
		printTitle();
		for (Game game : gameList) {
		  String data = game.getGameCode()+"\t";
		         data += game.getGameName()+"\t\t";
		         data += printGameType(game.getGameType())+"\t";
		         data += printServerInfo(game.getServerLoc())+"\t";
		         data += game.getMinGamer()+"\t";
		         data += game.getMaxGamer()+"\t";
		         data += game.getReservedGamer();
		     System.out.println(data);
		}
		System.out.println("-------------------------------------------------------------------------------");
	}
	//�������� ���
	public void printGameList(Game[] gameList, int gameType) {
		printTitle();
		for (Game game : gameList) {
		  if(gameType == game.getGameType()){
			  String data = game.getGameCode()+"\t";
			         data += game.getGameName()+"\t\t";
			         data += printGameType(game.getGameType())+"\t";
			         data += printServerInfo(game.getServerLoc())+"\t";
			         data += game.getMinGamer()+"\t";
			         data += game.getMaxGamer()+"\t";
			         data += game.getReservedGamer();
			     System.out.println(data);
			}//end if
		}//end for
		System.out.println("-------------------------------------------------------------------------------");
	}
	//���� ������ ���� ����
	public void reservationGame(Game[] gameList){
		System.out.print("�����ڵ带 �Է��ϼ��� =>");
		String gameCode = GameUtil.getUserInput();
		
		if(isExistGameCode(gameList, gameCode)){
			System.out.print("�����ο����� �Է��ϼ��� =>");
			int gameGamer = Integer.parseInt(GameUtil.getUserInput());
			int reservedGamer = 0;
		    for (Game game : gameList) {
				if(gameCode.equalsIgnoreCase(game.getGameCode())){
					reservedGamer = game.getReservedGamer();
					if(gameGamer+reservedGamer > game.getMaxGamer()){
						System.out.println("�ִ� ���� �ο����� �ʰ��Ͽ����ϴ�.");
					}else{
						game.setReservedGamer(gameGamer+reservedGamer);
						System.out.println(gameGamer+" �� ������ �Ϸ�Ǿ����ϴ�.");
						printGameList(gameList);
					}
				}
			}//end for
		}else{
			System.out.println("�Է��� �����ڵ尡 �����ϴ�. Ȯ���� �ٽ� �Է��ϼ���");
		}
		
	}
	//
	private boolean isExistGameCode(Game[] gameList, String gameCode){
	
		boolean result =false;
		
		for (Game game : gameList) {
			if(game.getGameCode().equalsIgnoreCase(gameCode)){
				result = true;
			}
		}
		return result;
	}
	//���� �������� ���
	public void printRunningGame(Game[] gameList){
		printTitle();
		for (Game game : gameList) {
			if(game.getMinGamer() <= game.getReservedGamer()){
				  String data = game.getGameCode()+"\t";
			         data += game.getGameName()+"\t\t";
			         data += printGameType(game.getGameType())+"\t";
			         data += printServerInfo(game.getServerLoc())+"\t";
			         data += game.getMinGamer()+"\t";
			         data += game.getMaxGamer()+"\t";
			         data += game.getReservedGamer();
			     System.out.println(data);
			}
		}
		System.out.println("-------------------------------------------------------------------------------");
	}
	
	//���� ���� ���
	public String printServerInfo(String [] serverLoc){
		int num = serverLoc.length-1;
		String result = serverLoc[0];
		
		if( num != 0){
		   result += "�� " + num+"��";	
		}else{
			result += "\t";	
		}
			
		return result;
	}
	
	//�������� Ÿ��
	public String printGameType(int gameType){
		String typeName = "";
		switch(gameType){
		  case Game.RPG:
			   typeName = "RPG"; break;
		  case Game.SPORT:
			   typeName = "SPORT"; break;
		  case Game.FPS:
			   typeName = "FPS"; break;
		}
		return typeName;
	}
	

	
	private void printTitle(){
		System.out.println("================================================================================");
		System.out.println("�����ڵ�\t���Ӹ�\t\t��������\t������ġ\t\tMin�ο�\tMAX�ο�\t�����ο�");
		System.out.println("================================================================================");
	}
	
}
