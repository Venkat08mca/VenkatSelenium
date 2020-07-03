package venkatSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://selenium-vinod.blogspot.in/p/selenium-webdriver.html");
		List<WebElement> links = d.findElements(By.tagName("a"));
		// Printing size of WebElement links
		  System.out.println(links.size());
		  //printing first 10 links
		/*  for(int i = 1; i<= 10; i++) {
			  System.out.println(links.get(i).getText());
		  } */
		  
		  // finding total no of check boxes
		  List<WebElement> checkboxes = d.findElements(By.xpath("//input[@type='checkbox']"));
		  System.out.println(checkboxes.size());
		  
		// finding total no of text boxes
		  List<WebElement> textboxes =  d.findElements(By.xpath("//input[@type='text']"));
		  System.out.println(textboxes.size());
		  
d.close();
	}
}
