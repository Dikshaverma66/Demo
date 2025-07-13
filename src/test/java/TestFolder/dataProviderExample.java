package TestFolder;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class dataProviderExample {

    @Test //(dataProvider="login")
    @Description("Opening login page and providing two invalid data sets of username and password")
    @Parameters({"username","phoneNumber","password"})
    public void login(String userID,String mobileNumber,String password) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("");
        WebElement element = driver.findElement(By.id("email"));
        element.sendKeys(userID);
        WebElement element1 = driver.findElement(By.id("phoneNumber"));
        element1.sendKeys(mobileNumber);
        WebElement element2 = driver.findElement(By.id("password"));
        element2.sendKeys(password);

        WebElement loginButton = driver.findElement(By.partialLinkText("LOGIN"));
        loginButton.click();


        Wait<WebDriver> fluentWait = new FluentWait<>(driver).
                withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofMillis(500)).
                ignoring(NoSuchElementException.class);
        WebElement error_msg = fluentWait.until(driver1 -> driver1.findElement(By.className("ant-notification-notice-description")));

       // WebElement error_msg = driver.findElement(By.className("ant-notification-notice-description"));
        String error_msgText = error_msg.getText();
        Assert.assertEquals(error_msgText,"Incorrect email or password");

        driver.quit();

    }
//    @DataProvider(name = "login")
//    public Object[][] test(){
////        Object[][] test1 = new Object[2][3];
////        test1[0][0]= "diksha@gmail.com";
////        test1[0][1]= "9919705775";
////        test1[0][2] = "12345678";              //first method
////        test1[1][0]="akansha@gmail.com";
////        test1[1][1]="8812345670";
////        test1[1][2]= "12345678";
//
//        return new Object[][]{
//                {"diksha@gmail.com", "9919705775", "12345678"},
//                {"akansha@gmail.com", "8812345670", "12345678"}              //second method
//        };
//        }
//
//        //return test1;

    }

