package selenium.introduction;

import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class final_Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String usr = "rahulshettyacademy";
		String pwd = "learning";

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise");
		LoginPage(driver, usr, pwd);
		acceptButton(driver);
		acceptElements(driver);

	}

	public static void LoginPage(WebDriver driver, String usr, String pwd) {

		try {

			driver.findElement(By.cssSelector("#username")).sendKeys(usr);
			driver.findElement(By.cssSelector("#password")).sendKeys(pwd);
			driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();

			//
		} catch (Exception e) {
			System.out.println("error" + e);

		}

	}

	public static void acceptButton(WebDriver driver) {
		try {
			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(8));
			w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#okayBtn")));
			driver.findElement(By.cssSelector("#okayBtn")).click();
			System.out.println(driver.findElement(By.cssSelector("#okayBtn")).getText());

			WebElement getposition = driver.findElement(By.cssSelector("select.form-control"));
			Select dropdownBox = new Select(getposition);
			dropdownBox.selectByVisibleText("Consultant");
			System.out.println(dropdownBox.getFirstSelectedOption().getText());

//		driver.findElement(By.cssSelector("#terms")).click();
			driver.findElement(By.cssSelector("#signInBtn")).click();

		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public static void acceptElements(WebDriver driver) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(8));
		try {
			w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
			List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

			for (int i = 0; i<products.size(); i++) {

				products.get(i).click();
			}
			
			driver.findElement(By.partialLinkText("Checkout")).click();
		} catch (Exception e) {

		}
	}
}
