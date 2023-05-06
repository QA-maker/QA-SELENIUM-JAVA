package selenium.introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownDinamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// elements allow load
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] -origin
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']")).click();
		System.out.println("Seleccion es From \n"+driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']")).getText());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		System.out.println("Destino TO \n"+driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).getText());
		
			//--> //a[@value='MAA'] xpath  for chenauii
		   // --> //a[@value='BLR'] xpath for  bengaluru
		
		//padres e hijos
		
		
		Thread.sleep(2000);
		String dateSel=	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).getText();
		String fecha= driver.findElement(By.cssSelector(".ui-datepicker-title span")).getText();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		
		System.out.println("La fecha es "+dateSel+"\t"+fecha);
		
	}

}
