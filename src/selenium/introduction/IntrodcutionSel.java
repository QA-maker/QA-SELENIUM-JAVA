package selenium.introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IntrodcutionSel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*" );
		WebDriver driver= new ChromeDriver(chromeOptions);
		
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\isc_e\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.navigate().to("https://google.com.mx");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.close();
	}

}
