import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//para configurar proxys cuando se necesite ingresar 
		//examples 
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.getBrowserVersion();
		Proxy proxy =new Proxy();
		proxy.setHttpProxy("ipadrres:4444");
		chromeOptions.setCapability("proxy",proxy);
		chromeOptions.setAcceptInsecureCerts(true);
		chromeOptions.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("https://expired.badssl.com");
		
		
	}

}
