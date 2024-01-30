package java_sel_project;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseOfProductAdd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/chromedriver/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	int j=0;
    	String[] veggies = {"Cucumber","Brocolli", "Beetroot"};
    	driver.get("https://rahulshettyacademy.com/seleniumPractise/");
    	Thread.sleep(3000);
    	//button[text()='ADD TO CART'] to add 30 prodcuts but we will got with product then fech button specific
    	//h4[class='product-name']  for classes name cucumber broccli etc.
    	 List <WebElement> productName =driver.findElements(By.cssSelector("h4[class='product-name']"));
    	 
    	 for(int i=0;i>productName.size();i++)
    	 {
    		String[] actualName= productName.get(i).getText().split("-");
    		String formattedName = actualName[0].trim();
    		//format it properly brocalli and i kg 
    	      //convert arrray into array list
    		//check wheter extracted name is present in array list or not 
    	 
    		 List itemsNeededList = Arrays.asList(veggies);
    		       if(itemsNeededList.contains(formattedName))
    				{
    		    	   j++;
    		    	   
    			       //ADD TO CART button click
    			     driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
    			     //only 3 times
    			     if(j== veggies.length)
    			     {
    			    	 break;
    			     }
    				}
    	 }
	}

}
