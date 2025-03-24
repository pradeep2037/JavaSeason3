package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreatingNewFile {
	
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\kravm\\OneDrive\\Desktop\\f1.txt");
		f1.createNewFile();
	}
}
