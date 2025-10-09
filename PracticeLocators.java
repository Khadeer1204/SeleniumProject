package practice;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticeLocators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        
//        ChromeOptions options = new ChromeOptions();
//
//        // Disable Chrome password manager popups
//        Map<String, Object> prefs = new HashMap<>();
//        prefs.put("credentials_enable_service", false);
//        prefs.put("profile.password_manager_enabled", false);
//
//        options.setExperimentalOption("prefs", prefs);


        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("submit-button")).click();

        boolean inventoryVisible = driver.findElement(By.id("inventory_container")).isDisplayed();
        System.out.println("Login success? " + inventoryVisible);
        
     // After login, count images
        int imgCount = driver.findElements(By.tagName("img")).size();
        System.out.println("Image count: " + imgCount);
        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        driver.findElement(By.linkText("About")).click(); // adjust if present
        System.out.println("Navigated title: " + driver.getTitle());
        driver.quit();
    }
}