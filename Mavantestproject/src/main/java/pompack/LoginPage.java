package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	  
	@FindBy(xpath="//input[@name='email']")
	private WebElement Username ;
	
	@FindBy(xpath="//input[@type='password']") 
	private WebElement Password;
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement Login;
	
	@FindBy(xpath="//a[text()='Sign up for Facebook']")
	private WebElement  Logout;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sendUserName()
	{
		Username.sendKeys("rautpayal665@gmail.com");
	}
	
	public void Password()
	{
		Password.sendKeys("Payal@94031");
	}
	public void Login()
	{
		Login.click();
	}
	
    public void Logout()
    {
    	Logout.click();
    }
    
 
}
