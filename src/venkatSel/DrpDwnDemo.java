package venkatSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrpDwnDemo {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		//WebDriver d = new ChromeDriver();
		d.get("file:///E:/DropDownDemo.html");
		WebElement el = d.findElement(By.id("mySelect"));
		Select dd = new Select(el);
		boolean B = dd.isMultiple();
		System.out.println(B);
		
	/*	dd.selectByIndex(1);
		Thread.sleep(1000);
		dd.selectByValue("option5");
		Thread.sleep(1000);
		dd.selectByVisibleText("Nasik");  */
		
		
		// To get and print all options from drop-down
		
		List<WebElement> Options = dd.getOptions();
		
		/* for(WebElement Option : Options) {
			System.out.println(Option.getText());
		}  */
			
		// Select all elements from multiselect dropdownlist
		
		for(WebElement Option : Options) {
			Thread.sleep(1000);
			Option.click();
		}
		// To deselect all options
		//dd.deselectAll();  
		d.close();
	}

}
