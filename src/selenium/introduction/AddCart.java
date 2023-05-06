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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(8));
		
//		private  WebDriverWait(WebDriver driver, Duration timeout) {
//		    this(
//		        driver,
//		        timeout,
//		        Duration.ofMillis(DEFAULT_SLEEP_TIMEOUT),
//		        Clock.systemDefaultZone(),
//		        Sleeper.SYSTEM_SLEEPER);
//		  }
				


		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/");
		// Thread.sleep(3000);
		// create Matriz
		String[] elements = { "Cucumber", "Brocolli", "Beetroot", "Beans" };
		getElements(driver, elements);
		addElements(driver);
//		verifyElementsCode(driver);

	}

	public static void getElements(WebDriver driver, String[] elements) {

		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			// int i=0;i<products.size();i++ )

			String[] name = products.get(i).getText().split("-");
			String formattedname = name[0].trim();

			List elementsCart = Arrays.asList(elements);

			if (elementsCart.contains(formattedname)) {

				System.out.println("el carrito es \n" + formattedname);

				j++;
				// incrementa el valor del carrito seleccionado

				// click on vegetables select
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == elements.length) {
					// longitud de la matriz...
				}
			}
		}
	}

	public static void addElements(WebDriver driver) throws InterruptedException {

		// Click on button addCart

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();

		// click on Proceeded to checkout

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
//		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(8));
		// Input Label promotion code
		
		Thread.sleep(3000);
//		w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		
//		w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[@class='promoBtn']")));
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
//		w.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		String dataText=driver.findElement(By.cssSelector("span.promoInfo")).getText();
		System.out.println("El texto es"+dataText);

	}

//	public static void verifyElementsCode(WebDriver driver) {
		
		// Click on Apply Button
		
//		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
//		w.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("span.promoInfo")));
//		String dataText=driver.findElement(By.cssSelector("span.promoInfo")).getText();
//		System.out.println("El texto es"+dataText);

		//String textElement = driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();

//		System.out.println("WebElement" + textElement);

//		String WebElement=driver.findElement(By.cssSelector("span.promoInfo")).getAttribute("Code applied ..!");
//		
//		
//		if(WebElement.contains("Code applied ..!")){
//			
//			System.out.println("WebElement"+WebElement);
//			
//		}
//		driver.findElement(By.xpath("//span[@class='promoInfo']")).getAttribute("Code applied ..!");
//		

		// Click on Place Order Button

		// driver.findElement(By.tagName("Place Order")).click();
	}

