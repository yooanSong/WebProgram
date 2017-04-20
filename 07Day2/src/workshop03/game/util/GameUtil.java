package workshop03.game.util;

import java.util.Scanner;

public class GameUtil {
	public static String getUserInput() {
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
}
