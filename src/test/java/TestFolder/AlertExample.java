package TestFolder;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class AlertExample {

    @Test
    public void alerts(){
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement elementSimpleAlert = driver.findElement(By.xpath("//button[starts-with(text(),'Click for JS Al')]"));
        elementSimpleAlert.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement elementResult = driver.findElement(By.id("result"));
        Assert.assertEquals(elementResult.getText(),"You successfully clicked an alert");

        WebElement elementConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
        elementConfirm.click();

        Alert alert1 = driver.switchTo().alert();
        alert1.dismiss();

        WebElement elementResult1 = driver.findElement(By.id("result"));
        Assert.assertEquals(elementResult1.getText(),"You clicked: Cancel");

        WebElement elementPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
        elementPrompt.click();

        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.sendKeys("Diksha");
        alert2.accept();


        WebElement elementResult2 = driver.findElement(By.id("result"));
        Assert.assertEquals(elementResult2.getText(),"You entered: Diksha");

    }
}
