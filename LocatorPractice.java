package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorPractice {
	public static void xPathAndCssSelector() {
		 WebDriver driver = new ChromeDriver();
	      
	      driver.get("https://www.saucedemo.com/");  // Demo login site
	      driver.manage().window().maximize();
	      
	   // XPath
	      driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");


	   // CSS
	      driver.findElement(By.cssSelector("input[name='password']")).sendKeys("secret_sauce");


	     
	   // XPath by text
	      driver.findElement(By.xpath("//input[@type='submit']")).click();

	   // CSS by class
	   //   driver.findElement(By.cssSelector(".submit-button")).click();

	     
	     System.out.println("Page Title after login: " + driver.getTitle());
	     
	     driver.quit();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      
      driver.get("https://www.saucedemo.com/");  // Demo login site
      driver.manage().window().maximize();
      
      //Locate by id
     WebElement username = driver.findElement(By.id("user-name"));
     username.sendKeys("standard_user");
     
     //Locate by name
     WebElement password = driver.findElement(By.name("password"));
     password.sendKeys("secret_sauce");
     
     //Locate by className
     WebElement loginbtn = driver.findElement(By.className("submit-button"));
     loginbtn.click();
     
     System.out.println("Page Title after login: " + driver.getTitle());
     
     driver.quit();
    xPathAndCssSelector();
    
    
     
	}

}
