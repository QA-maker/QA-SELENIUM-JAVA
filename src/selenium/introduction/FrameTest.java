package selenium.introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://jqueryui.com/droppable/");
		
		//Select Frame techniques
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		Actions act= new Actions(driver);
		
		act.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();
	}

}
