package game;

public class Game {
	private String gameCode;
	private String gameName;
	private int gameType; //게임유형
	private String[] serverLoc; //서버위치
	private int minGamer;
	private int maxGamer; 
	private int reservedGamer; //게임예약인원

	public static final int RPG=0; //static final을 밑줄로 표시 
	public static final int SPORT=1;
	public static final int FPS=2;
	
	public Game(String gameCode, String gameName, int gameType, String[] serverLoc, int minGamer, int maxGamer,
			int reservedGamer) {
		super();
		this.gameCode = gameCode;
		this.gameName = gameName;
		this.gameType = gameType;
		this.serverLoc = serverLoc;
		this.minGamer = minGamer;
		this.maxGamer = maxGamer;
		this.reservedGamer = reservedGamer;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getGameType() {
		return gameType;
	}

	public void setGameType(int gameType) {
		this.gameType = gameType;
	}

	public String[] getServerLoc() {
		return serverLoc;
	}

	public void setServerLoc(String[] serverLoc) {
		this.serverLoc = serverLoc;
	}

	public int getMinGamer() {
		return minGamer;
	}

	public void setMinGamer(int minGamer) {
		this.minGamer = minGamer;
	}

	public int getMaxGamer() {
		return maxGamer;
	}

	public void setMaxGamer(int maxGamer) {
		this.maxGamer = maxGamer;
	}

	public int getReservedGamer() {
		return reservedGamer;
	}

	public void setReservedGamer(int reservedGamer) {
		this.reservedGamer = reservedGamer;
	}
	
}
