package java_sel_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumbrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//for firefox bowser i we do not write system.setsalenium manager automatically handles it.
		//System.setProperty("webdriver.gecko.driver", "C:/Users/Admin/Documents/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
//		for Edge
		
        
		driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
	}

}
