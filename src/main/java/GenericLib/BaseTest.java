package GenericLib;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	 public WebDriver driver;
	
	@BeforeClass(alwaysRun = true)
	public void LaunchingBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String url="https://demowebshop.tricentis.com/";
		driver.get(url);
		Thread.sleep(5000);
		
		
	}

	@AfterClass(alwaysRun=true)
	public void ClosingBrowser() {
		driver.quit();
	}
}
