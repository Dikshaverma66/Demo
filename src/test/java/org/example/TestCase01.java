package org.example;


import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase01 {
@Test
@Description("Verify the title of the Heroku and Browserstack")
    public void demo() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://katalon-demo-cura.herokuapp.com/");
    driver.get("https://www.browserstack.com/");

    driver.navigate().back();
    driver.navigate().forward();
   


    //driver.navigate().wait(1000);
    //driver.navigate().back();
    driver.navigate().refresh();
    System.out.println(driver.getTitle());

    }
}
