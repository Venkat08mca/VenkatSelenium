import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class FbLogin {
	public static void main(String[] args) throws InterruptedException,IOException {
		String Login = "Google Login";
		
		// TODO Auto-generated method stub
        ChromeOptions options = new ChromeOptions();
        options.addArguments("-disable-notifications");
        
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver(options);
		//WebDriver d = new ChromeDriver();
		try {
		d.get("https://www.google.com");
		d.findElement(By.id("testing")).sendKeys("test");
	/*	d.findElement(By.id("email")).sendKeys("venkat.08mca@gmail.com");
		d.findElement(By.id("pass")).sendKeys("271319271319");
		//Thread.sleep(1000);
		d.findElement(By.xpath("//input[@value='Log In']")).click();  */
		//d.close();
		}catch(Exception e)
		{
			System.out.println("Im In exception");
			File screenshot = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			   File targetFile = new File("F:\\Selenium\\Automation\\src\\"+Login+".png");
			   FileUtils.copyFile(screenshot, targetFile);
			   d.close();
			   
		}

}
}
