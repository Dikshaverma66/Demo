package TestFolder;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class MiniProjectTestingAcademy {

    WebDriver driver;

//    @BeforeMethod
//    public void openBrowser() {
//        driver = new EdgeDriver();
//        driver.get("https://katalon-demo-cura.herokuapp.com/");
//
//
//    }

    @Test
    @Description("Make Appointment on the Heroku app")
    public void miniProjectHeroku() {
        driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Make Appointment")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt-username")));
        usernameField.sendKeys("John Doe");

        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement options = driver.findElement(By.id("combo_facility"));
        Select dropdown = new Select(options);
        dropdown.selectByIndex(1);
        WebElement checkbox = driver.findElement(By.id("chk_hospotal_readmission"));
        checkbox.click();
        WebElement radiobutton = driver.findElement(By.id("radio_program_medicaid"));
        radiobutton.click();
        WebElement date = driver.findElement(By.id("txt_visit_date"));
        date.sendKeys("02/07/2025");
        WebElement comment = driver.findElement(By.id("txt_comment"));
        comment.sendKeys("No comments test comments No comments test comments No comments test comments No comments test comments No comments test comments");

        WebElement bookAppointment = driver.findElement(By.id("btn-book-appointment"));
        bookAppointment.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement commentField = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("comment")));
        String message = commentField.getText();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//        WebElement appointmentConfirmation = driver.findElement(By.id("comment"));
//        String message = appointmentConfirmation.getText();

        Assert.assertEquals(message, "No comments test comments No comments test comments No comments test comments No comments test comments No comments test comments");

    }


    @AfterMethod
    public void quitBrowser() {
    driver.quit();
    }
}


