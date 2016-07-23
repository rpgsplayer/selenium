/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author adhitya
 */
public class FacebookLogin {

    public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", "chromedriver directory");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.id("loginbutton"));
        email.sendKeys("your email");
        password.sendKeys("your password");

    }
    
}
