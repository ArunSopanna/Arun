package genrick_libries;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import object_repository.LoginPage;

public class Base_class {
	static WebDriver driver;
	public static Propertyutility ppt;
	public static LoginPage login; 
	@BeforeClass
	public  void launchingBrowser() throws IOException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(options);
		ppt=new Propertyutility();
		driver.get(ppt.readingData("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login=new LoginPage(driver);
		
	}
	@AfterClass
	public void main() throws InterruptedException, IOException
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,2000000)");
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot1/insta.png");
		FileUtils.copyFile(src, dest);
        driver.close();
		
	}

}
