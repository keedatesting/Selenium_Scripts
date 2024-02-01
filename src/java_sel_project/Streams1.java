package java_sel_project;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Streams1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		ArrayList <String>  names =  new ArrayList();
              names.add("Amana");
              names.add("rati");
              names.add("Arijit");
              names.add("Anil");
              names.add("ramaaa");
              int count=0;
              for(int i=0; i<names.size(); i++)
              {
            	String actual= names.get(i);
            	if(actual.startsWith("A"))
            	{
            		count++;
            	}
            	
              }
              System.out.println(count);   //normal way to count 
	}
	
	public void streamFilter()
	{

		ArrayList <String>  names =  new ArrayList();
              names.add("Amana");
              names.add("rati");
              names.add("Arijit");
              names.add("Anil");
              names.add("ramaaa");
            Long c=   names.stream().filter(s->s.startsWith("A")).count();
            System.out.println(c);
		
	}

}

