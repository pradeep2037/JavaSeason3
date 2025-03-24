package FileHandling;

import java.io.File;
import java.io.IOException;

public class SavingInAnySystem {
	

	public static void main(String[] args) throws IOException {
		File f2 = new File(System.getProperty("user.dir")+"\\f2.txt");
		f2.createNewFile();
	}
}
