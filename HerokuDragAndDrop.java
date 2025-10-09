//package practice;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class HerokuDragAndDrop {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        
//		WebDriverManager.chromedriver().setup();
//
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//
//		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
//		
//		
//		WebElement source = driver.findElement(By.xpath("//div[@id='column-a'][@class='column']"));
//		
//		WebElement target = driver.findElement(By.xpath("//div[@id='column-b'][@class='column']"));
//		
//		Actions action =  new Actions(driver);
//		
//		action.dragAndDrop(source, target).perform();
//		
//		
//		System.out.println(target.getText());
//		driver.close();
//		
//	}
//
//}

package practice;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HerokuDragAndDrop {
    public static void main(String[] args) {
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);

        // Select by visible text
        select.selectByVisibleText("Option 1");

        // Select by value
        select.selectByValue("2");

        // Select by index (starts from 0)
        select.selectByIndex(1); // Option 1

        // Print selected option
        WebElement selected = select.getFirstSelectedOption();
        System.out.println("Selected: " + selected.getText());

        List<WebElement> options = select.getOptions();
        for (WebElement opt : options) {
            System.out.println(opt.getText());
        }

        driver.quit();
    }
}
