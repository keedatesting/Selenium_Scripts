package java_sel_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class updateddropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/chromedriver/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    	driver.findElement(By.id("divpaxinfo")).click();
    	Thread.sleep(2000L);
    	
//    	int i=1;
//    	while(i<5)
//    	{
//    		driver.findElement(By.id("hrefIncAdt")).click(); // click 1 time only with loop cloick 4 more time
//    		i++;  //click 4 times
//    	}
    	 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    	
    	for(int i=1;i<5;i++)
    	{
    		driver.findElement(By.id("hrefIncAdt")).click(); 
    	}
    	
    	driver.findElement(By.id("btnclosepaxoption")).click();
    	
    	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
    	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}

