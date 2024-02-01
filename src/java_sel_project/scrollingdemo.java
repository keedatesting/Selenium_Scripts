package java_sel_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class scrollingdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/chromedriver/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    	
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	 js.executeScript("window.scrollBy(0,500)");
    	 Thread.sleep(3000);
    	 //Assinment part here
    	 System.out.println(driver.findElements(By.cssSelector("#product:nth-child(2) tr")).size());
    	 System.out.println(driver.findElements(By.cssSelector("#product:nth-child(2) th")).size());
    	 System.out.println(driver.findElement(By.cssSelector("#product:nth-child(2) tr:nth-child(3)")).getText());
    	 //till here
    	 js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
    	 
    	List<WebElement> values=  driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
    	int sum = 0;
    	for(int i=0; i<values.size();i++)
    	{
    		sum= sum +Integer.parseInt(values.get(i).getText());  //28+all element values
    	}
    	
    	System.out.println(sum);
    	 // Total Amount Collected: 296 
    	String[] name =driver.findElement(By.className("totalAmount")).getText().split(":");
        int   	Total = Integer.parseInt(name[1].trim());
        
        Assert.assertEquals(sum, Total);
    	

	}

}
