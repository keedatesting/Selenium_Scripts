package java_sel_project;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/chromedriver/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
    	//blinking text going t another child window how to handle child window
    	driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
    	Set<String> windows = driver.getWindowHandles();
    	//[parentid,childid,subchildId]

    	Iterator <String>it = windows.iterator();

    	String parentId = it.next();  //for first tab 

    	String childId = it.next(); //child window

    	driver.switchTo().window(childId);
    	driver.findElement(By.cssSelector(".im-para.red")).getText();
    	String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

    	driver.switchTo().window(parentId);

    	driver.findElement(By.id("username")).sendKeys(emailId); 

	}

}
