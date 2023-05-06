package selenium.introduction;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
public class AutomationSibiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*" );
		WebDriver driver= new ChromeDriver(chromeOptions);
		//Driver load 
		String name="sam";
		//System.getProperty("webdriver.chrome.driver", "C:\\Users\\isc_e\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//elements allow load
		//getLoginText(driver);
		//String pass=getPassword(driver);
		//Driver load Methods to fill Label for locators
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice");
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText()); //login hihjos
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[1]")).getText()); //login //padres
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[1]")).getText()); //signup //padres
		driver.quit();
		
		
	}
}
	
