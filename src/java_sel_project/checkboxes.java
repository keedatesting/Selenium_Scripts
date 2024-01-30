package java_sel_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/chromedriver/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    	Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
    	//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
    	driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
    	//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());  //it return in true or false if selected true otherwise false.
    	Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
    	//check all the number of the checkboxes present on the page for that create a generic locator which grabs all the checkboxes and check size
    	
    	driver.findElements(By.cssSelector("input[type='checkbox']")).size();
    	 
	}

}
