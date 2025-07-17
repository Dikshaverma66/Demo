package TestFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SvgFlipkart {

    //(//*[local-name() = 'svg'])[1]


    @Test
    public void svg(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.flipkart.com/");

        WebElement searchInputBox = driver.findElement(By.name("q"));
        searchInputBox.sendKeys("macmini");

        WebElement searchIcon = driver.findElement(By.xpath("(//*[name() = 'svg'])[1]"));
        searchIcon.click();

        //2nd method to click search icon
//        List<WebElement> svgElements = driver.findElements(By.xpath("//*[name() = 'svg']"));
//        svgElements.get(0).click();

        driver.close();
    }
}
