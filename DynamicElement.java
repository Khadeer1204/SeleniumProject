package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        WebDriver driver = new EdgeDriver();
        
  
        
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
      
        WebElement e = driver.findElement(By.xpath("//button[text()='Add' or text()='Remove']"));
        System.out.println(e.getText());
         e.click();
        //System.out.println(e.toString());
        
//        e.click();
//        System.out.println(e.getText());
//        e.click();
//        System.out.println(e.getText());
	}

}
