package TestFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SwiggyAddToCart {

    WebDriver driver;

    @Test
    public void addToCart(){
        driver = new ChromeDriver();
        driver.get("https://www.swiggy.com/instamart");
        driver.manage().window().maximize();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5))
//                wait.until(ExpectedConditions.visibilityOfElementLocated())
        WebElement pop_up = driver.findElement(By.xpath("//div[@class=\"_3VnBa\"]"));
        pop_up.click();

        WebElement searchBox = driver.findElement(By.xpath("//div[@class='_1AaZg']"));
        searchBox.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        WebElement inputSearchBox = driver.findElement(By.xpath("//input[@type=\"search\"]"));
        inputSearchBox.sendKeys("Nachos");

        driver.findElement(By.xpath("(//span[text() = \"Nachos\"])[1]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement addItem =  driver.findElement(By.xpath("(//button[@class=\"_1Imv1 _1L7yC _2rSIx\"])[1]"));
        addItem.click();

        WebElement goToCart = driver.findElement(By.xpath("//div[@class=\"sc-aXZVg fMtlSA\"]"));
        goToCart.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement productOnCart = driver.findElement(By.xpath("//div[text() = \"Cornitos Nacho Chips Peri Peri\"]"));
        String productName = productOnCart.getText();
        Assert.assertEquals(productName,"Cornitos Nacho Chips Peri Peri");

    }

}
