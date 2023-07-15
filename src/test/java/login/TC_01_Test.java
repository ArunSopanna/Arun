package login;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import genrick_libries.Base_class;

public class TC_01_Test extends Base_class {
	@Test
	public void login() throws InterruptedException
	{
		login.getUsername().sendKeys("mr_yalawar");
		login.getPwd().sendKeys("sopanna12345");
		login.getLogin().click();
		login.getNotnow().click();
		login.getNot().click();
		login.getMassage().click();
		login.getAbu().click();
		login.getProfile().click();
		Thread.sleep(2000);
		
		
	}
	
}
