package selenium.frames;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate().to("https://www.path2usa.com/travel-companion");

		// Scroll to element
		WebElement element = driver.findElement(By.xpath("//*[contains( text(),'Find A Travel Companion')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(7000);

		System.out.println("Este es el scrooll" + element.getText());

		WebElement element2 = driver.findElement(By.xpath("//*[contains( text(),'Date of travel')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(7000);

		System.out.println("Este es el scrooll" + element2.getText());
//		getMonths(driver);
		getDaysDate(driver);
		

	}

	public static void getDaysDate(WebDriver driver) {
		driver.findElement(By.xpath(".//*[@id='form-field-travel_comp_date']")).click();
//		String month = driver.findElement(By.xpath("//div/*[@class='cur-month']")).getText().contains("June");
//		System.out.println(driver.findElement(By.xpath("//div/*[@class='cur-month']")).getText());
		while (!driver.findElement(By.xpath("//div/*[@class='cur-month']")).getText().equals("August")) {
			
			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
			System.out.println(driver.findElement(By.xpath("//div/*[@class='cur-month']")).getText());
			
		}

		List<WebElement> elementsDay = driver.findElements(By.className("flatpickr-day"));

		int countday = driver.findElements(By.cssSelector("span[class='flatpickr-day ']")).size();

	System.out.println("estos son los días" + countday);

		for (int i = 0; i < countday; i++) {

			String day = driver.findElements(By.cssSelector("span[class='flatpickr-day ']")).get(i).getText();

			if (day.equalsIgnoreCase("12")) {

				System.out.println("el dia es" + day);

				driver.findElements(By.cssSelector("span[class='flatpickr-day ']")).get(i).click();
				break;
			}

		}
	}
	

}