package selenium.introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*" );
		WebDriver driver= new ChromeDriver(chromeOptions);
		//Driver load 
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\isc_e\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//elements allow load
		//Driver load Methods to fill Label for locators
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		
		
		//data entering formulary
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(2000);//Estabylize to Web
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("neto");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("cybsarynet@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("123@.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("neto");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//form[@class='form']/button")).click();
		
		Thread.sleep(4000);
		
		System.out.println(driver.findElement(By.cssSelector("div h2")).getText());
		System.out.println(driver.findElement(By.cssSelector("div h1")).getText());
		System.out.println(driver.findElement(By.cssSelector("div p")).getText());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();
		//driver.close()
		}

}
