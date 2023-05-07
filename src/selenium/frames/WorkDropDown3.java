package selenium.frames;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class WorkDropDown3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice");	
		
		
		

	    driver.findElement(By.id("autocomplete")).sendKeys("united");

	    Thread.sleep(2000);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

	       

	       

	}

	
	

}
