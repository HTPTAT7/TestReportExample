package by.htp.testreport.test;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.htp.testreport.pageobject.MainPage;

public class LoginTest extends BaseTest {
	
	private static Logger logger = LogManager.getLogger();
	//private static Logger logger = LogManager.getRootLogger();
	

//	@BeforeClass
//	public WebDriver startBrowser() {
//	
//		System.setProperty("webdriver.gecko.driver", "c:\\driver\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		
//		return driver;
//	}
	
	@Test
	public void testLog4j2(){
		logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
	}


	@Test(enabled = false)
	public void doLogin() {
	
	
		MainPage mainPage = navigate(MainPage.URL);
		mainPage.login("tathtp@mail.ru", "Klopik123");
		closeBrowser();
	}
}
