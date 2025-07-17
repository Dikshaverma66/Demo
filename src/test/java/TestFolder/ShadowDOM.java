package TestFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ShadowDOM {

    @Test
    public void implementJSExecutor()  {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        //Normal weblement does not work in Shadow DOM.
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement scrollTo = driver.findElement(By.xpath("//div[@id=\"userName\"]"));
        js.executeScript("arguments[0].scrollIntoView(true);",scrollTo);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement pizzaInputBox = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector('input#pizza')");

        pizzaInputBox.sendKeys("Margarita");



    }
}
