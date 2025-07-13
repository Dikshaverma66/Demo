package TestFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownExample {

    @Test
    public void dropdown() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--guest");// for opening browser in guest mode
        WebDriver driver = new EdgeDriver(options);
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
        WebElement element = driver.findElement(By.cssSelector("select#dropdown"));
        Select select = new Select(element);
        select.selectByIndex(1);
        //Thread.sleep(3000);
        select.selectByIndex(2);

    }




}
