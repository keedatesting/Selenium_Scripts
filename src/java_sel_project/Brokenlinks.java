package java_sel_project;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// broken URL whic gives some error like 404 etc count links which are getting
		// status code grater than 400

		// Step 1 - IS to get all urls tied up to the links using Selenium

		// Java methods will call URL's and gets you the status code

		// if status code >400 then that url is not working-> link which tied to url is
		// broken

		// a[href*="soapui"]' it is locator for soapui link

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		//List<WebElement> links = driver.findElements(By.cssSelector("a[href*=\"soapui\"]"));   for one url only
		List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li']"));
		//for all the links get class name of all the name which is common

		SoftAssert a = new SoftAssert();   //soft assertion comes from testNG framewrok and we se it because assert only stops when one lik fail and doest ot move formward to check other links 
		

		for (WebElement link : links)

		{

			String url = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

			conn.setRequestMethod("HEAD");

			conn.connect();

			int respCode = conn.getResponseCode();

			System.out.println(respCode);

			a.assertTrue(respCode < 400, "The link with Text" + link.getText() + " is broken with code" + respCode);

		}

		a.assertAll();

	}

}
