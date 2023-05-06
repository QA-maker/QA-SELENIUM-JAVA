package selenium.introduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSugestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// elements allow load
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("Al");
		
		Thread.sleep(2000);
		List <WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option :options) {
			
			if(option.getText().equalsIgnoreCase("Australia"))
			{
				option.click();
			}
			System.out.println(option.getText());
			
			//System.out.println("La opcion es"+option);
			//System.out.println("La opcion es"+options);
			
			
		}
		
		
	}

}
