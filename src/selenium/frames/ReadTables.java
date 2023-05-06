package selenium.frames;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReadTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		getTableElements(driver);
		getTableTwo(driver);
	

	}
	
	public static void getTableElements(WebDriver driver) {
		
		List <WebElement> columns= driver.findElements(By.xpath("//table[@name='courses']"));
//		WebElement elements=driver.findElement(By.tagName("td"));
		//List <WebElement> rows= driver.findElements(By.tagName("td"));
		 
		 
		for(WebElement column :columns) {
			int colIndex=0;
			
            
			
			
				String courses=column.getText();
				System.out.println(courses);
			
				colIndex++;
				
		}
		 
		
//		rowIndex ++;
		 }
		
	public static void getTableTwo(WebDriver driver) {
		List <WebElement> table2= driver.findElements(By.cssSelector("table[id='product']:nth-child(1) "));
		//div[class='tableFixHead'] table thead tr th
		for(WebElement table :table2) {
			
			int colIndex=0;
			
			
			
			String coursesTable=table.getText();
			
			System.out.println(coursesTable);
			
			colIndex++;
		}
		
		
	}
	}

	 
	
	



