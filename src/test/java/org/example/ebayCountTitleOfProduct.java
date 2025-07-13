package org.example;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ebayCountTitleOfProduct {
    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL); //to makesure page loaded normally

        driver = new ChromeDriver();
    }

    @Test(groups = "QA")
    @Description("Count of Title")
    public void count()
    {
    driver.get("https://www.ebay.com/sch/i.html?_nkw=macmini&_sacat=0&_from=R40&_trksid=p4432023.m570.l1313");
        WebElement searchInput = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        searchInput.sendKeys("macmini");
        WebElement searchButton = driver.findElement(By.cssSelector("span.gh-search-button__label"));
        searchButton.click();

        Wait<WebDriver> fluentWait = new FluentWait<>(driver).
                withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofMillis(500)).
                ignoring(NoSuchElementException.class);
        List<WebElement> listOfTitles = driver.findElements(By.className("s-item__title"));
        int i =0;
        for(WebElement title: listOfTitles){
            System.out.println(i + " " + title.getText());
            if(i==10){
                title.click();
            }
            i++;
        }

    }
  @AfterTest
  public void closeBrowser() {
       driver.quit();
  }
}
