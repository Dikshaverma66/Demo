package TestFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazon {
    @Test
    public void clickOnMobiles(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.navigate().refresh();
        WebElement element = driver.findElement(By.linkText("Mobiles"));
        element.click();
        driver.quit();
    }
}
