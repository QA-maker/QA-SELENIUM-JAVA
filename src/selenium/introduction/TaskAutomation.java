package selenium.introduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import com.google.common.base.StandardSystemProperty;

public class TaskAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));// elements allow load
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000L);
		//Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked

		Assert.assertFalse(driver.findElement(By.cssSelector("div input[id='checkBoxOption1']")).isSelected());
		
		System.out.println(driver.findElement(By.cssSelector("div input[id='checkBoxOption1']")).isSelected());
		
		driver.findElement(By.cssSelector("div input[id='checkBoxOption1']")).click();
		
		Assert.assertTrue(driver.findElement(By.cssSelector("div input[id='checkBoxOption1']")).isSelected());
		
		System.out.println(driver.findElement(By.cssSelector("div input[id='checkBoxOption1']")).isSelected());
		
		//Count size
		
		System.out.println(driver.findElements(By.cssSelector("input[value='checkbox']")).size());
		
		List <WebElement> reload =driver.findElements(By.cssSelector("div[id='checkbox-example'] label"));
		
		
		
		
		
		
		
		
		for (WebElement reloads :reload) {
			
			
			
			String print=reloads.getText();
			
			System.out.println(print);
			
			
		}
	

//		 List<WebElement> tableDataCollections;
		 
		
		 
		 List <WebElement> columns= driver.findElements(By.xpath("//table//tbody//tr"));
//		 List <WebElement> rows= driver.findElements(By.tagName("td"));
		 
//		int rowIndex=0;
		
		for(WebElement column :columns) {
			int colIndex=0;
			
                  List <WebElement> coldata=column.findElements(By.xpath("//table//tbody//tr//td"));
			
			
				String courses=column.getText();
				System.out.println(courses);
			
				colIndex ++;
				
		}
	//	rowIndex ++;
		 }
	}

