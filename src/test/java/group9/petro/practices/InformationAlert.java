package group9.petro.practices;

import group9.petro.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InformationAlert extends TestBase {
    //TC #1: Information alert practice

    //1. Open browser
    @Test
    public void informationAlert(){
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");

        //3. Click to “Click for JS Alert” button
        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();

        //4. Click to OK button from the alert
        Alert btn = driver.switchTo().alert();
        btn.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement result = driver.findElement(By.id("result"));
        Assert.assertEquals(result.getText(),"You successfully clicked an alert", "Verification is failed");
    }
}
