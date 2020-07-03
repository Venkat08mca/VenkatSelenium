package venkatSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioBtn {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		//WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com");
		WebElement mrb = d.findElement(By.xpath("//label[contains(text(),'Male')]"));
		boolean mrbStatus = mrb.isSelected();
		System.out.println("Male radio button is selected:"  +mrbStatus);
		mrb.click();
		Thread.sleep(1000);
		WebElement mrb1 = d.findElement(By.xpath("//label[contains(text(),'Male')]"));
		boolean mrbStatus1 = mrb1.isSelected();
		System.out.println("Male radio button is selected:"  +mrbStatus1);
		
d.close();
		
	}
}
