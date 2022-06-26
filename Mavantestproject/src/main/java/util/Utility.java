package util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static void captureScreenshot() throws IOException {
		WebDriver driver=new ChromeDriver();
		TakesScreenshot object=(TakesScreenshot)driver;
		File stored =object.getScreenshotAs(OutputType.FILE);
		File store =new File("C:\\Users\\Payal\\Desktop\\Screenshot\\file1.png");
        FileHandler.copy(stored, store);
	}

}
