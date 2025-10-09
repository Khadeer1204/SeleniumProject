package practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HerokuDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//button[text()='Add' or text()='Remove']
		//WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();
        
  
        
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dropdown");
      
       driver.findElement(By.xpath("//select[@id='dropdown']")).click();
       List<WebElement> e =   driver.findElements(By.xpath("//option"));

       e.get(1).click();
      driver.close();
   //        Actions action = new Actions(driver);    
//        action.scrollByAmount(500, 0).perform();
        
        

	}

}
