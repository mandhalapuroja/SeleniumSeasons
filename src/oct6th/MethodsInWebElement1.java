package oct6th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsInWebElement1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys("reyaz009");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("password")).sendKeys("reyaz123");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).clear();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(3000);
		
		System.out.println( driver.findElement(By.id("username_span")).getText());
		
		System.out.println( driver.findElement(By.id("username_span")).getAttribute("class"));
		
		System.out.println( driver.findElement(By.id("username_span")).getAttribute("name"));
		
		System.out.println( driver.findElement(By.id("username_span")).getCssValue("color"));
		
		System.out.println( driver.findElement(By.id("username_span")).getCssValue("font-size"));
		
		 System.out.println(driver.findElement(By.id("username")).getLocation().getX());
		 System.out.println(driver.findElement(By.id("username")).getLocation().getY());
		 System.out.println(driver.findElement(By.id("username")).getSize().getHeight());
		 System.out.println(driver.findElement(By.id("username")).getSize().getWidth());
		 
		 System.out.println(driver.findElement(By.id("username")).getRect().getX());
		 System.out.println(driver.findElement(By.id("username")).getRect().getY());
		 System.out.println(driver.findElement(By.id("username")).getRect().getHeight());
		 System.out.println(driver.findElement(By.id("username")).getRect().getWidth());
		 
		 
		 
		
		driver.quit();

	}

}
