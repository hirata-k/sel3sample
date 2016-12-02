package sel3sample;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FireFoxGeckoSample {

	WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		// プロファイルをセットする
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.PROFILE, firefoxProfile);
		driver = new FirefoxDriver(capabilities);			
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	
	@Test
	public void test() throws InterruptedException {				
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("lst-ib"));
		element.sendKeys("シャノン");
		element.submit();
		
		WebDriverWait wait = new WebDriverWait(driver, 10, 10000);
		wait.until(ExpectedConditions.titleContains("シャノン"));
		assertThat(driver.getTitle(),is("シャノン - Google 検索"));
	}


}
