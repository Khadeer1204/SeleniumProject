package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HerokuTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 WebDriver driver = new EdgeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(20));
		 
		 wt.until(ExpectedConditions.elementToBeClickable(By.tagName("tr")));
		 driver.manage().window().maximize();
		 driver.manage().window().minimize();
		 
		 driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/tables");
        
        WebElement table1 = driver.findElement(By.id("table1"));
        
        List<WebElement> rows = table1.findElements(By.tagName("tr"));
        
        for(WebElement row : rows) {
        	
        	List<WebElement> cells = row.findElements(By.tagName("td"));
        	
        	for(WebElement cell : cells) {
        		
        		System.out.print(cell.getText()+" | ");
        	}
        	System.out.println();
        }
        
       
   WebElement table2 = driver.findElement(By.id("table2"));
   System.err.println("****************************************************");
        List<WebElement> rows1 = table2.findElements(By.tagName("tr"));
        
        for(WebElement row : rows1) {
        	
        	List<WebElement> cells = row.findElements(By.tagName("td"));
        	
        	for(WebElement cell : cells) {
        		
        		System.out.print(cell.getText()+" | ");
        	}
        	System.out.println();
        }
        
        
        driver.close();
        
		
	}

}
