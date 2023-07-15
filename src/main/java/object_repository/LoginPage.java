package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(xpath="//div[text()='Log in']")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin() {
		return login;
	}
	@FindBy(xpath="//div[text()='Not Now']")
	private WebElement notnow1;

	public WebElement getNotnow() {
		return notnow1;
	}
	
	@FindBy(xpath="//button[text()='Not Now']")
	private WebElement not1;

	public WebElement getNot() {
		return not1;
	}
	@FindBy(xpath="//span[@class=\"xwmz7sl x1ncwhqj xo1l8bm xyqdw3p x1mpkggp xg8j3zb x1t2a60a\"]")
	private WebElement massage;

	public WebElement getMassage() {
		return massage;
	}
	@FindBy(xpath="//span[text()='‎(سید‎ sent an attachment.']")
	private WebElement abu1;

	public WebElement getAbu() {
		return abu1;
	}
	
	@FindBy(xpath="//img[@alt=\"mr_yalawar's profile picture\"]")
	private WebElement profile;

	public WebElement getProfile() {
		return profile;
	}

	public void setProfile(WebElement profile) {
		this.profile = profile;
	}
	

	
	
}
