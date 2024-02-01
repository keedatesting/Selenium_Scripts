package java_sel_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/chromedriver/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://jqueryui.com/droppable/");
//    	driver.findElement(By.id("draggable")).click();
    	//driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); // thi is done by webelement
    	//next is done by index
    	System.out.println(driver.findElements(By.tagName("iframe")).size()); 
    	driver.switchTo().frame(0);  //index frame start from zero.
    	
    	//drag and drop perform
    	Actions a = new Actions(driver);
    	 WebElement source = driver.findElement(By.id("draggable"));
    	 WebElement target = driver.findElement(By.id("droppable"));
    	a.dragAndDrop(source, target).build().perform();
      //come back to the normal page or out ofthe frame 
    	driver.switchTo().defaultContent();
	}

}
