package testpackk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pompack.apollosite;

public class ApolloHomepage {
	WebDriver driver;
	apollosite main;
	@BeforeClass
	public void Apollo() {
		System.setProperty("webdriver.chrome.Driver","C:\\Users\\Payal\\Desktop\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
   	
	@BeforeMethod
	public void login() {
	             driver.get("https://demo.guru99.com/V4/");
	       		 main=new apollosite();

   		           main.setUserName();
   	              	main.setPassword();
   	             	main.clickLogin();
	}
   	@Test
   	public void checkTitle() {
   		
   		String title=main.getLoginTitle();
   		Assert.assertEquals(title, "Guru 99");
      	}
   	
      @AfterMethod
      public void logout()
      {
	  
      }
  	@Test
   	public void checkurl() {
 	  main=new apollosite();
 	  String url=driver.getCurrentUrl();
      Assert.assertEquals(url, "https://demo.guru99.com/V4/","correct urlfetch");
   		}
		 @AfterClass
		 public void closetab() {
			 driver.close();
		 }
	  }
		  
	  


