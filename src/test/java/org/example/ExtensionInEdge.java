package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class ExtensionInEdge {
//Extension to the Edge browser
    //Youtube video-- ad blocker extension

    @Test
    public void ext(){
        EdgeOptions options=new EdgeOptions();
        //options.addArguments("--headless");
        options.addExtensions(new File("C:\\Users\\Lenovo\\Downloads\\AdBlock.crx"));
        WebDriver driver= new EdgeDriver(options);
        driver.get("https://youtube.com");
        //driver.quit();

    }
}
