package redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\redbus\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement from=driver.findElement(By.id("src"));
		from.sendKeys("tambaram");
		WebElement to=driver.findElement(By.id("dest"));
		to.sendKeys("cmbt");
		
	
	}

}
