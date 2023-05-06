package selenium.introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Worktwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		
		//angularPractice
		driver.navigate().to("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		//Element of form
		Thread.sleep(2000L);
		driver.findElement(By.name("name")).sendKeys("net");
		driver.findElement(By.name("email")).sendKeys("cybsarynet@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123tribilin");
		//driver.findElement(By.cssSelector("div input[id='exampleCheck1']")).isSelected();
		
		getCheckActivate(driver);
		WebElement selectoption=driver.findElement(By.cssSelector("div select[id='exampleFormControlSelect1']"));
		
		Select option= new Select(selectoption);
		option.selectByVisibleText("Male");
		System.out.println("La opcion seleccionada es "+ option );
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		Thread.sleep(1000);	
		driver.findElement(By.name("bday")).sendKeys("04/22/1978");
	
		
		
		 driver.findElement(By.cssSelector("input[class='btn btn-success']")).click();
		
		
		
	}
	
	public static void getCheckActivate(WebDriver driver) {
	
		
	
		
		Assert.assertFalse(driver.findElement(By.cssSelector("div input[id='exampleCheck1']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("div input[id='exampleCheck1']")).isSelected());
		driver.findElement(By.cssSelector("div input[id='exampleCheck1']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("div input[id='exampleCheck1']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("div input[id='exampleCheck1']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("div label[for='exampleCheck1']")).getText());
	}
}
