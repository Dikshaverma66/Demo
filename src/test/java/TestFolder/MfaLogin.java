package TestFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.http.Message;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Properties;

//import static jdk.jpackage.internal.WixAppImageFragmentBuilder.Id.Folder;
//
//public class MfaLogin {
//
//    @Test
//    public void loginWithOTP(){
//        WebDriver driver = new EdgeDriver();
//        driver.get("https://practice.expandtesting.com/otp-login");
//        WebElement emailInput = driver.findElement(By.id("email"));
//        emailInput.sendKeys("dikshaverma446@gmail.com");
//        WebElement otpButton = driver.findElement(By.id("btn-send-otp"));
//        otpButton.click();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("otp")));
//
//        // Sample logic to read OTP email using JavaMail
//        Properties props = new Properties();
//        props.setProperty("mail.store.protocol", "imaps");
//        Session session = Session.getInstance(props, null);
//        Store store = session.getStore();
//        store.connect("imap.gmail.com", "your_email@gmail.com", "your_password");
//
//        Folder inbox = store.getFolder("INBOX");
//        inbox.open(Folder.READ_ONLY);
//
//        Message[] messages = inbox.getMessages();
//        for (int i = messages.length - 1; i >= 0; i--) {
//            String subject = messages[i].getSubject();
//            if (subject.contains("Your OTP")) {
//                String content = messages[i].getContent().toString();
//                // Extract OTP using regex
//                String otp = content.replaceAll("\\D", "");
//                break;
//            }
//        }
//
//    }
//}
