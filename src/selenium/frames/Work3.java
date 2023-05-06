package selenium.frames;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Work3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice");
		//1 click on option
		//List<WebElement>select=driver.findElements(By.xpath("//*[@id='checkbox-example']/fieldset/label/input]"));
		
		//for(WebElement selec :select) {
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]/input")).click();
//		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input]")).click();
//		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]/input]")).click();
//		//Extract text all options
		String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText();
//		String opt2=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input]")).getText();
//		String opt3=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]/input]")).getText();
//		//Select option
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select selec= new Select(dropdown);
		selec.selectByVisibleText(opt);
		
		
		driver.findElement(By.id("name")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
		
		String text =driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
//		for(WebElement selec :select) {
			
		if(text.contains(opt)) {
		
		System.out.println("Alerta satisfactoria");
	
		}else {
			System.out.println("No es por aqui!!");
			}
driver.quit();		
		}
	

			
	}
		
		



