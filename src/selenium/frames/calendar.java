package selenium.frames;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calendar {

	public static <WebDriverWait> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate().to("https://www.path2usa.com/travel-companion");
		Thread.sleep(5000);
		
		WebElement element = driver.findElement(By.className("pp-button-content-wrapper"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//	Thread.sleep(5000); 
//		scrollToElement(By.className("scrollToElement"));
//		driver.findElement(By.xpath("//input[@id='form-field-travel_from']")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='form-field-travel_from']")).sendKeys("USA");
		
		driver.findElement(By.xpath(".//*[@id='form-field-travel_comp_date']")).click();
		
		List <WebElement>date=driver.findElements(By.className("flatpickr-day"));
		
		int countday=driver.findElements(By.className("flatpickr-day")).size();
		
		System.out.println(countday);
		
		for (int i=0; i<countday;i++){
			
			String day=driver.findElements(By.className("flatpickr-day")).get(i).getText();
			
			if(day.equalsIgnoreCase("23")) {
				
				System.out.println("EL dia es "+day);
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				
				
				
			} 
				System.out.println("Algo esta mal!!");
		}
	}



}
