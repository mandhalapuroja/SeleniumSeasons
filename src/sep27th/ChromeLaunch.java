package sep27th;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLaunch {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\005 Live Tech\\jars\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		new ChromeDriver();
		//new FirefoxDriver();

	}

}
