package TestFolder;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class OrangeHRMFindFirstITManager {
    @Test
    @Description("Find first IT Manager Employee and delete it")
    public void dynamicTable() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input@class='oxd-input oxd-input--active']")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[text()= \"PIM\"]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        List<WebElement> rowPath = driver.findElements(By.xpath("//div[@role='row']"));
        int rows = rowPath.size();
        System.out.println(rows);
        driver.quit();
    }
}
