package TestFolder;

import io.qameta.allure.Description;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class NonEqualColumns {
    @Test
    @Description("Printing table data of non-equal columns")
    public void columns(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();

        List<WebElement> elements = driver.findElements(By.tagName("tr"));
        int rows = elements.size();
        System.out.println(rows);

        for(int i=0; i<rows; i++){
            System.out.println(elements.get(i).getText());
//            List<WebElement> col = elements.get(i).findElements(By.tagName("td"));
//            for(WebElement e: col){
//            System.out.println(e.getText());
     //      }
            Actions action = new Actions(driver);
            action.sendKeys(Keys.F5);
        }
        driver.quit();




    }
}
