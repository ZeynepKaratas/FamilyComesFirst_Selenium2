package group9.petro.practices;


import group9.petro.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

//1. Open browser
public class InformationAlert1 extends TestBase {

    @Test
    public void informationAlert() {

        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");

        //3. Click to “Click for JS Prompt” button
        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();

        //4. Send “hello” text to alert
        Alert btn = driver.switchTo().alert();
        btn.sendKeys("hello");

        //5. Click to OK button from the alert
        btn.accept();

        //6. Verify “You entered: hello” text is displayed.
        WebElement results = driver.findElement(By.xpath("//p[.='You entered: hello']"));

//        Assert.assertEquals(results.getText(),"You entered: hello","\""+results.getText()+"\""+" verification test failed");

        if (results.getText().equals("You entered: hello")) {
            System.out.println("\"" + results.getText() + "\"" + " - verification test passed");
        } else {
            System.out.println("\"" + results.getText() + "\"" + " - verification test failed");
        }
    }

}
