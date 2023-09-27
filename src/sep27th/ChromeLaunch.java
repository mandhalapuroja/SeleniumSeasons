package sep27th;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\005 Live Tech\\jars\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		new ChromeDriver();

	}

}
