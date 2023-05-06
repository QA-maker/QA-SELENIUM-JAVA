package selenium.introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropdownsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*" );
		WebDriver driver= new ChromeDriver(chromeOptions);
		//invoke chrome driver
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\isc_e\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//elements allow load
		driver.manage().window().maximize();
	
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//call to element Select
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdownBox= new Select(staticdropdown);
		dropdownBox.selectByIndex(2);
		//Confirm Select Text and show in console
		System.out.println(dropdownBox.getFirstSelectedOption().getText());
		//sELECT BY vALUE
		dropdownBox.selectByValue("USD");
		System.out.println(dropdownBox.getFirstSelectedOption().getText());
		
		
		
		driver.quit();
		
		
		
	}

}
