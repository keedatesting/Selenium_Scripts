package java_sel_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dyanamicdropdwon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/chromedriver/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//    	xapth for chennai == a[value='MAA']
//    	pathfor bengaluru --a[value='BLR']
    	
    	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
    	
    	driver.findElement(By.xpath("//a[@value='BLR']")).click();
    	Thread.sleep(2000);
    	//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();  // if we do not want our locator with the index then do parent child relationship with space.
    	
    	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
    	
    	//handle all dynamic Ui also with this method.
    	//handling calender current date as it is unique
    	driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
	}

}
