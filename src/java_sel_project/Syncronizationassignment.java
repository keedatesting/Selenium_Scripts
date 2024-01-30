package java_sel_project;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Syncronizationassignment {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/chromedriver/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	String[] itemsNeeded = {"iphone", "Samsung"};
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
    	driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
    	driver.findElement(By.cssSelector("input[value='user']")).click();
    	Thread.sleep(3000);
    	System.out.println(driver.findElement(By.xpath("//p[contains(text(),'You will be limited to only fewer functionalities ')]")).getText());
    	driver.findElement(By.id("okayBtn")).click();
    	 WebElement staticDropdown = driver.findElement(By.cssSelector("div[class='form-group'] select"));
    	 Select dropdown =new Select(staticDropdown);
    	 dropdown.selectByValue("consult");
    	 System.out.println(dropdown.getFirstSelectedOption().getText());
    	 //System.out.println(dropdown.getFirstSelectedOption().getText());
    	 Assert.assertFalse(driver.findElement(By.id("terms")).isSelected());
    	 driver.findElement(By.id("terms")).click();
    	 Assert.assertTrue(driver.findElement(By.id("terms")).isSelected());
    	 driver.findElement(By.id("signInBtn")).click();
    	 Thread.sleep(3000);
    	 addItems(driver, itemsNeeded);
	}
    	 
	
    	//till here we logged in succesfully 
    	 
    	 //adding product
    	 //button[class='btn btn-info'] for button
    	//List <WebElement> productTitle =driver.findElements(By.cssSelector("h4[class='card-title']"));
    	 
    	 public static void addItems(WebDriver driver, String[] itemsNeeded)

    		{

    			int j = 0;

    			List<WebElement> products = driver.findElements(By.cssSelector("h4[class='card-title']"));

    			for (int i = 0; i < products.size(); i++)

    			{
    				String formattedName = products.get(i).getText().trim();
    				List itemsNeededList = Arrays.asList(itemsNeeded);

    				if (itemsNeededList.contains(formattedName))

    				{

    					j++;

    					// click on Add to cart

    					driver.findElements(By.xpath("button[class='btn btn-info']")).get(i).click();

    					if (j == itemsNeeded.length)

    					{

    						break;

    					}

    				}

    			}

     }
}
