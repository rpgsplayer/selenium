import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author adhitya
 */
public class FacebookRegister {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\installer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.findElement(By.id("u_0_1")).sendKeys("First Name");
        driver.findElement(By.id("u_0_3")).sendKeys("Last Name");
        driver.findElement(By.id("u_0_6")).sendKeys("Your Email");
        driver.findElement(By.id("u_0_9")).sendKeys("Your Email");
        driver.findElement(By.id("u_0_b")).sendKeys("Your Password");
        new Select (driver.findElement(By.id("day"))).selectByVisibleText("30");
        new Select (driver.findElement(By.id("month"))).selectByVisibleText("Okt");
        new Select (driver.findElement(By.id("year"))).selectByVisibleText("1993");
        driver.findElement(By.id("u_0_f")).click();
        driver.findElement(By.id("u_0_j")).click();
    }
}
