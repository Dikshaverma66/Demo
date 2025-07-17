package TestFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class PathAmCharts {
    @Test
    public void indiaMap(){

        //For path tag also use local-name() or name() function
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        driver.manage().window().maximize();

        //driver.findElement(By.xpath("//button[text() =\"I understand and agree\"]")).click();


        WebElement element = driver.findElement(By.xpath("//*[local-name() = 'path' and @aria-label=\"Tripura  \"]"));
        element.click();

        driver.quit();
    }
}
