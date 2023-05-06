package selenium.introduction;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Navigate to new WindowTab 
		
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();// [parantId, childID]//method get obtiene las ventanas
														// disponibles
		Iterator<String> it = windows.iterator();
		String parentId = it.next();// [Parentid]
		String childId = it.next();// [childId]

		driver.switchTo().window(childId);
		driver.findElement(By.cssSelector(".im-para.red")).getText();
String Emailid=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		System.out.println(Emailid);
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(Emailid);
		
	}

}
