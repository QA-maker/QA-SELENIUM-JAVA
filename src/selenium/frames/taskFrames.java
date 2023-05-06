package selenium.frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;

public class taskFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://the-internet.herokuapp.com");

		// Select link nested frames

		driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		returnFrame(driver);

	}

	public static void returnFrame(WebDriver driver) {
		System.out.println(driver.findElements(By.tagName("frame")).size());

		try {

			driver.switchTo().frame("frame-top");

			driver.switchTo().frame("frame-middle");

			
			System.out.println(driver.findElement(By.id("content")).getText());
			
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
