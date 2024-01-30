package java_sel_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/chromedriver/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
    	
    	driver.findElement(By.xpath("//a[@value='BLR']")).click();
    	Thread.sleep(2000);
    	//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();  // if we do not want our locator with the index then do parent child relationship with space.
    	
    	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
    	
    	driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]")).click();
    	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

    	{

    	System.out.println("its disabled");

    	Assert.assertTrue(true);

    	}

    	else

    	{

    	Assert.assertTrue(false);

    	}
    	
    	driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
    	
    	
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
    	
    	driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();


	}

}
