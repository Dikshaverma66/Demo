package TestFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;
import java.time.Duration;
import java.util.List;


public class MakeMyTripDynamicDropdown {

    @Test
    public void dynamicDropdown(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement loginPopup = driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]"));
        loginPopup.click();
        WebElement from = driver.findElement(By.xpath("//label[@for='fromCity']"));
        Actions action = new Actions(driver);
        action.moveToElement(from).click().perform();
        WebElement inputFromCity = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
        inputFromCity.sendKeys("Delhi");
        List<WebElement> elementList = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));
        for(WebElement e:elementList) {
            if (e.getText().contains("New Delhi, India")) {
                e.click();
                break;
            }
        }//So for ul, li we have to fetch list of elements and select the particular element

//        WebElement cityFound = driver.findElement(By.xpath("//span[text() = \"New Delhi\"]"));
//        cityFound.click();

//        WebElement to = driver.findElement(By.xpath("//label[@for='toCity']"));
//        to.click();
//        WebElement inputToCity = driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
//        inputToCity.sendKeys("Mumbai");
//        WebElement cityFound2 = driver.findElement(By.xpath("//div[@class=\"makeFlex column flexOne\"]"));
//        cityFound2.click();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//
//        WebElement departureDate = driver.findElement(By.xpath("//p[text() ='19']"));
//        departureDate.click();
//
//        WebElement searchButton = driver.findElement(By.xpath("//a[text() ='Search']"));
//        searchButton.click();
    }



}
