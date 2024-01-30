package java_sel_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsactivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/chromedriver/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.google.com/");
    	driver.navigate().to("https://rahulshettyacademy.com/");
    	driver.navigate().back();
    	driver.navigate().forward();
	}

}
