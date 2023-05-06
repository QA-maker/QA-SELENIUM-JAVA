package selenium.introduction;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.amazon.com/");
		getCapitalLetter(driver);
		//driver.quit();
		

	}
	
	public static void getCapitalLetter(WebDriver driver) {
		Actions a= new Actions(driver);
		WebElement move= driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
			
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.moveToElement(move).contextClick().build().perform();
		
		//a.moveToElement(move).clickAndHold().build().perform();	
		//a.moveToElement(move).getActivePointer();
	}
	

}
