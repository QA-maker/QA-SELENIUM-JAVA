package selenium.frames;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice");

		// give me to link count in this link page

		System.out.println(driver.findElements(By.tagName("a")).size());

		// 3 give me only footer seftion link

		// WebElement footer=driver.findElement(By.id("gf-BIG"));
		WebElement columncounterlink = driver.findElement(By.xpath("//table//tbody//tr//td[1]/ul"));

		System.out.println(columncounterlink.findElements(By.tagName("a")).size());
		// open all the tabs
		for (int i = 0; i < columncounterlink.findElements(By.tagName("a")).size(); i++) {

			String clickonLink = Keys.chord(Keys.CONTROL, Keys.ENTER);

			columncounterlink.findElements(By.tagName("a")).get(i).sendKeys(clickonLink);

		}

		// obtain all the tables and title

		Set<String> loop = driver.getWindowHandles(); // Obtiene las ventas

		Iterator<String> it = loop.iterator(); // itarato all windows

		while (it.hasNext()) { // whie the elelemnt is present

			driver.switchTo().window(it.next());// change a new winwow
			System.out.println(driver.getTitle()); // get the title
		}
//		try {
//		List <WebElement> links=driver.findElements(By.tagName("a"));
//		
//		for (WebElement link :links)
//		{
//			if(link.getText().equalsIgnoreCase("SoapUI"))
//				
//				
//				link.click();
//			
//			

//			Set<String> windows = driver.getWindowHandles();// [parantId, childID]//method get obtiene las ventanas
//			// disponibles
//			Iterator<String> it = windows.iterator();
//			String parentId = it.next();// [Parentid]
//			String childId = it.next();// [childId]
//			driver.switchTo().window(childId);
//			System.out.println(driver.findElement(By.cssSelector("h1[class='text-white font-weight-light']")).getText());
//
//			driver.switchTo().defaultContent();
	}
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		System.out.println(driver.findElement(By.cssSelector("h1[class='text-white font-weight-light']")).getText());
//		
//		//get title all courses
//		
//		
//	
//		}catch(Exception e) {
//			e.getLocalizedMessage();

//		System.out.println(footer.findElements(By.tagName("a")).size());
//		System.out.println(footer.findElement(By.cssSelector("a[href='http://www.restapitutorial.com/']")).getText());
//		
//		driver.quit();
}
