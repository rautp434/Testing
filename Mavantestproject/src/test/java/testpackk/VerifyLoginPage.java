package testpackk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pompack.LoginPage;

public class VerifyLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Payal\\Desktop\\New folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver ();
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
        driver.get("https://www.facebook.com/");
        LoginPage loginpage = new LoginPage(driver);
        loginpage.sendUserName();
        loginpage.Password();
        loginpage.Login();
       
       Thread.sleep(7000);
       
       driver.switchTo().alert().accept();
      
       loginpage.Logout();

       
     
		
	}
         
       
    		   
    	        
    		   

	}
         

