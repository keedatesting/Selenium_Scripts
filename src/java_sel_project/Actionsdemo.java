package java_sel_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/chromedriver/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.flipkart.com/");
    	Actions a =  new Actions(driver);
    	WebElement move = driver.findElement(By.cssSelector("div[class='H6-NpN _3N4_BX']"));
    	//writing anything incapital letter in search bar
    	a.moveToElement(driver.findElement(By.cssSelector("input[class='Pke_EE']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
    	//moves to specific element 
    	a.moveToElement(move).contextClick().build().perform();
    	//context click used for right click
    	

	}

	

}
