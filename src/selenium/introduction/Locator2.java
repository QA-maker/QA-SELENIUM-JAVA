package selenium.introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;


public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*" );
		WebDriver driver= new ChromeDriver(chromeOptions);
		//Driver load 
		String name="sam";
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\isc_e\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//elements allow load
		//getLoginText(driver);
		String pass=getPassword(driver);
		//Driver load Methods to fill Label for locators
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(pass);
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.cssSelector("div[class=login-container] h2")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class=login-container] h2")).getText(),"Hello "  +name+ ",");
		//div[class='login-container'] button
		driver.findElement(By.cssSelector("div[class='login-container'] button")).click();
		driver.quit();
		
		
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		
		//extract text Please use temporary password 'rahulshettyacademy' to Login.
		String passwordText =driver.findElement(By.tagName("p")).getText();
		String [] passwordArrays=passwordText.split("'"); //El texto se divide en 2 indices
		//in0 --> Please use temporary password
		//ind1 --> 'rahulshettyacademy' to Login.
		
		//----
		//ind 0 --> rahulshettyacademy
				//ind 1 --> to login
		String password=passwordArrays[1].split("'")[0]; //in this line with split divid two elements
		System.out.println("El texto extraido es "+password+" ");
		
		
		
		
		return password ;
		
		
	}
	
	public static String getLoginText(WebDriver driver) throws InterruptedException {
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String LoginText=driver.findElement(By.tagName("p")).getText();//Capturamos el texto en una cadena
		String [] loginTextto=LoginText.split("to");
		//ind 0 --> Please use temporary password 'rahulshettyacademy'
		//ind 1 --> to Login
		String extractText=loginTextto[1];
		System.out.println("es el la leyenda de "+extractText);
		return extractText;
		
	}
	

}
