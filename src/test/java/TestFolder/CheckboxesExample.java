package TestFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class CheckboxesExample {

    @Test
    public void checkbox(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> element = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(element.get(1).getText());
    }
}
