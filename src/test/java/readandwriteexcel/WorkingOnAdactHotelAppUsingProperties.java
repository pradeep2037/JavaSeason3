package readandwriteexcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingOnAdactHotelAppUsingProperties {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = null;

		FileInputStream fis = new FileInputStream("config.properties");
		
		//to read config.properties file we need to use properties class
		
		Properties pr = new Properties();
		
		pr.load(fis);
		
		String browser = pr.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.get(pr.getProperty("url"));
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(pr.getProperty("implicitWait"))));
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
