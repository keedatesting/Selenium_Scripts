package java_sel_project;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);  //removes ssl certificate 
		Proxy proxy = new Proxy();

		proxy.setHttpProxy("ipaddress:4444");  //handles proxy

		options.setCapability("proxy", proxy);
		
		Map<String, Object> prefs = new HashMap<String, Object>();



		prefs.put("download.default_directory", "/directory/path");  //set the downloaded file path 



		options.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/chromedriver/chromedriver.exe");
    	WebDriver driver = new ChromeDriver(options);
    	driver.get("https://expired.badssl.com/");
    	System.out.println(driver.getTitle());
	}

}
