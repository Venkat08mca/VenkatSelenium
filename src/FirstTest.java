import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		WebElement gmLnk = driver.findElement(By.linkText("Gmail"));
		gmLnk.click();
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[contains(text(),'Email or phone')]")).sendKeys("venkatdvv1108@gmail.com");
	}
	

}
 