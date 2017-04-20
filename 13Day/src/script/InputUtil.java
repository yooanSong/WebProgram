package script;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputUtil {
	private static BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in));

	public static int readNumber() {

		int number = 0;
		try {
			number = Integer.parseInt(in.readLine());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return number;
	}

}
