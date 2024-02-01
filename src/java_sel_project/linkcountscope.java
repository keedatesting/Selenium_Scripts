package java_sel_project;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkcountscope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/chromedriver/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	//get the total number of the links on the page 
    	//get the total number of the links on the footer
    	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    	System.out.println(driver.findElements(By.tagName("a")).size());
    	WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
    	System.out.println(footerdriver.findElements(By.tagName("a")).size());
    	
    	//get the total number links in th first column of footer and click on all the link and get the title fo them
    	
    	 WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
    	 System.out.println(columndriver.findElements(By.tagName("a")).size());
    	 
    	 for(int i=1; i<columndriver.findElements(By.tagName("a")).size(); i++)
    	 {
    		 // to click on the every link seperately cntl plus enter then it will open in different tabs all the links
    		String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
    		 columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
    		 
    		 Thread.sleep(3000);
    		 
    	 }
    		 
    	     Set <String> abc =driver.getWindowHandles();  // get the four windows opened
             Iterator <String>	it = abc.iterator();
              while(it.hasNext())
              {
            	  driver.switchTo().window(it.next());
            	  System.out.println(driver.getTitle());
              }
    	
    		 
    	 
	}

}
