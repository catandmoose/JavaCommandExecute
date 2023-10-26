import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadLocalRandom;

class Main {
	public static void main(String[] args) {
		String command = "msg * hello!";
		int min = 5;
		int max = 10;
		boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
				
		try {
			TimeUnit.MINUTES.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(isWindows);
		if (isWindows == true) {
			try {
				Process process = Runtime.getRuntime().exec(command);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}