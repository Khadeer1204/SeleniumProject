package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicNavigationalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  //Setup ChromeDriver automatically
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      
      //Navigate
      driver.get("https://www.google.com");
      driver.manage().window().maximize();
      
      System.out.println("Title: "+ driver.getTitle());
      driver.quit();
	} 

}
