package group9.petro.practices;

import group9.petro.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ConfirmationAlert {

    public static void main(String[] args) throws InterruptedException {

        //1. Open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");

        //3. Click to “Click for JS Confirm” button
        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();

        //4. Click to OK button from the alert
        Alert btn = driver.switchTo().alert();
        btn.accept();

        //  Thread.sleep(4000);
        //5. Verify “You clicked: Ok” text is displayed.
        WebElement result = driver.findElement(By.xpath("//p[.='You clicked: Ok']"));
        if (result.getText().equals("You clicked: Ok")) {
            System.out.println("Verification test for result text passed - "+ "\""+ result.getText() + "\"");
        }else {
            System.err.println("Verification test for result text failed" + "\"" + result.getText() + "\"");
        }

        driver.quit();
    }
}
