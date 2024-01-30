package java_sel_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling browsers--chromedrver
		//WebDriver driver = new WebDriver(); //if we create webriver object inner class will automatically arrive to which chrome driver s not aware
		//Chromedriver.exe -> Chrome browser
//		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/chromedriver/chromedriver.exe"); windows write path with exe
//		WebDriver driver = new ChromeDriver();
		  
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Admin/Documents/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        //driver.quit();
	}

}
