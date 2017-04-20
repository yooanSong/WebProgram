package game;

public class GameBiz {

	// 전체 게임 목록
	public void printGameList(Game[] gameList) {
		printTitle();
		for (Game game : gameList) {
			String data = game.getGameCode() + "\t";
			data += game.getGameName() + "\t\t";
			data += printGameType(game.getGameType()) + "\t";
			data += pringServerInfo(game.getServerLoc()) + "\t";
			data += game.getMaxGamer() + "\t";
			data += game.getMinGamer() + "\t";
			data += game.getReservedGamer();
			System.out.println(data);
		}
		System.out.println("---------------------------------------");
	}
	//게임 유형 목록
	public void printGameList(Game[] gameList, int gameType){
		printTitle();
		for(Game game: gameList){
			if(gameType == game.getGameType()){
				String data = game.getGameCode()+"\t";
				data += game.getGameName()+"\t";
				data += printGameType(game.getGameType())+"\t";
				data += pringServerInfo(game.getServerLoc())+"\t";
				data += game.getMinGamer()+"\t";
				data += game.getReservedGamer();
				System.out.println(data);
			}
		}
		System.out.println("------------------------------------------");
	}
	//게임 참가를 위한 예약
	public void reservationGame(Game[] gameList){
		System.out.println("게임코드를 입력하세요 =>");
		String gameCode = GameUtil.getUserInput();
		
		if(isExistGameCode(gameList, gameCode)){
			System.out.println("참가인원수를 입력하세요 =>");
			int gameGamer = Integer.parseInt(GameUtil.getUserInput())
			int reservedGamer = 0;
			for(Game game : gameList){
				if(gameCode.)
			}
		}
	}

	private void printTitle() {
		System.out.println("======================================================");
		System.out.println("게임코드\t게임명\t\t게임유형\t서버위치\t\tMin인원\tMax인원\t참가인원");
		System.out.println("======================================================");

	}

}// end GameBiz
