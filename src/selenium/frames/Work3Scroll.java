package selenium.frames;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Work3Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,700)");
		// tr ROWS 11
		
		
//				 System.out.println(tables.findElements(By.tagName("tr")).size());
		WebElement tables= driver.findElement(By.cssSelector(".left-align table[id='product']"));
//		 System.out.println(tables.findElements(By.tagName("tr")).size());
		 int rows=0;
		 int column=0;
		 for (int i=0; i<tables.findElements(By.tagName("th")).size(); i++) {
			 
			 System.out.println(tables.findElements(By.tagName("th")).get(i).getText());
		 
		 }
			 for(int y=0; y<tables.findElements(By.tagName("td")).size(); y++) {
				 
				 System.out.println(tables.findElements(By.tagName("td")).get(y).getText());
//				 column++;
			 }
		 rows++;
//			 break;
		 }
			
			
			
			
		 }

	// th columns 3
//				 System.out.println(tables.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
//				 
//				List <WebElement> value2=driver.findElements(By.tagName("tr")).get(1).findElements(By.tagName("td"));
//				
//				System.out.println(value2.get(0).getText());
//				System.out.println(value2.get(1).getText());
//				System.out.println(value2.get(2).getText());
//				

//

