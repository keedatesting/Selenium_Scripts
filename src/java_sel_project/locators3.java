package java_sel_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/chromedriver/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
//    	sibling hild traversing //header/div/button[1]/following-sibling::button[1]
    	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
    	
//    	child to parent traversing 
    	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a[2]")).getText());
    	driver.close();

	}

}
