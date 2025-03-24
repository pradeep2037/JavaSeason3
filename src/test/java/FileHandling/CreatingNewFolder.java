package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreatingNewFolder {
	

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\kravm\\OneDrive\\Desktop\\f1folder");
		f1.mkdir();
	}
}
