package java_sel_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/chromedriver/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//    	driver.findElement(By.id("autosuggest")).sendKeys("ind");
//    	Thread.sleep(2000);
//    	//li[class='ui-menu-item'] a   xpath showing the three elements after auto sugeestion typed ind it will be set under find elments list  make generic csss selector fo rthe three elemets
//    	List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//    	
//    	for(WebElement option :options)
//    	{
//    		if(option.getText().equalsIgnoreCase("India"))
//    		{
//    			option.click();
//    			break;
//    		}
//    	}
//    	
    	driver.findElement(By.id("autosuggest")).sendKeys("ala");
    	Thread.sleep(2000);
    	
    	List<WebElement> options2 = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
    	
    	for(WebElement option1 :options2)
    	{
    		if(option1.getText().equalsIgnoreCase("Guatemala"))
    		{
    			option1.click();
    			break;
    		}
    	}
      
	}

}
