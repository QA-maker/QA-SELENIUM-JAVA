package selenium.introduction;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleWindowsexcersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://the-internet.herokuapp.com");
		driver.findElement(By.cssSelector("a[href='/windows")).click();
		getHandleWindowsText(driver);
		
	}
	
	public static void getHandleWindowsText(WebDriver driver) {
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> itero=windows.iterator();
		String Actualwindow=itero.next();
		String nextwindow=itero.next();
		
		driver.switchTo().window(nextwindow);
		String newWin=driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
		System.out.println(newWin);
		
		driver.switchTo().window(Actualwindow);
		
		String Actual=driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
		System.out.println(Actual);
		
	}
	
	

}
