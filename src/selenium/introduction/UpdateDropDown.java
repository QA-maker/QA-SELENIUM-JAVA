package selenium.introduction;

import java.time.Duration;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UpdateDropDown {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));// elements allow load
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		//method to Obtain selected option checkbox
		//Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());//checkboxes radio buttons
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//Method to count size of checkbox
		
		//
		
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\isc_e\\OneDrive\\Documentos\\screenshots"));
		/*System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.findElement(By.id("divpaxinfo")).click();
		// click on plus
		Thread.sleep(4000L);

		// While loop
		/*
		 * int i=1;
		 * 
		 * while(i<5) {
		 * 
		 * driver.findElement(By.id("hrefIncAdt")).click(); i++;
		 * 
		 * 
		 * }
		 *
		System.out.println("Es la primer ves \n" + driver.findElement(By.id("divpaxinfo")).getText());

		for (int i= 1; i<5; i++) {

			driver.findElement(By.id("hrefIncAdt")).click();
			

		}

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println("Es la \n " + driver.findElement(By.id("divpaxinfo")).getText());

		driver.quit();*/

	}
}
