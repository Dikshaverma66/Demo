package TestFolder;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaticTableSelenium {

    @Test
    @Description("Printing all table data and also printing sibling of Helen Bennet")
    public void staticTable() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");

        int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th")).size();

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part =  "]";


        for(int i=2; i<=row; i++){
            for(int j =1; j<=col; j++){

                String tableDataPath = first_part + i + second_part + j +third_part;
                //System.out.println(tableData);
                String tableData = driver.findElement(By.xpath(tableDataPath)).getText();
                //System.out.println(data);
                if(tableData.contains("Helen")){
                    String sibling_path= tableDataPath + "/following-sibling :: td";
                    String sibling_text = driver.findElement(By.xpath(sibling_path)).getText();
                    System.out.println(sibling_text);
                }
            }
        }
        driver.quit();
    }
}
