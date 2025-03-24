package readandwriteexcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("config.properties");
		
		Properties properties = new Properties();
		
		properties.load(fis);
		
		System.out.println(properties.getProperty("browser"));
	}
}
