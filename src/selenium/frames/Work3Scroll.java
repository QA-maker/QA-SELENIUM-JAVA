package selenium.frames;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Work3Scroll {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getScreenShoot(driver);
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice");
		
		getScreenShoot(driver);
		getElementsTable(driver);
		getScreenShoot(driver);
		
	}
		
public static void getElementsTable(WebDriver driver) throws IOException {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;

	js.executeScript("window.scrollBy(0,700)");
	// tr ROWS 11
	
	
//			 System.out.println(tables.findElements(By.tagName("tr")).size());
	WebElement tables= driver.findElement(By.cssSelector(".left-align table[id='product']"));
	
	
//	 System.out.println(tables.findElements(By.tagName("tr")).size());
	 int rows=0;
	 int column=0;
	 for (int i=0; i<tables.findElements(By.tagName("th")).size(); i++) { //rows
			 
		 System.out.println(tables.findElements(By.tagName("th")).get(i).getText());
		
	 }
		 for(int y=0; y<tables.findElements(By.tagName("td")).size(); y++) {//count columns
		 System.out.println(tables.findElements(By.tagName("td")).get(y).getText());
		
//			 column++;
		 }
	 rows++;
	 
//		 break;
	 }

	public static void getScreenShoot(WebDriver driver) throws IOException {
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Users\\isc_e\\eclipse-workspace\\Introduction\\src\\selenium\\frames\\ScrreenShot//screenshot.png"));
		
		
	}

		
		
		
		
}


		


