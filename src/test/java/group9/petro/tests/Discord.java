package group9.petro.tests;

import group9.petro.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Discord {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //                              steps:  step 1. the user is on the HOME
        driver.get("https://discord.com/login");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("petrokozovyi@gmail.com" + Keys.TAB);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Petrokozovyi27$" + Keys.ENTER);
        Thread.sleep(5000);
        WebElement home = driver.findElement(By.xpath("//div[@class='listItemWrapper-3d87LP selected-3a1QGn']"));
        home.click();
        //                                           step 2. click + icon to create a direct message
        //                                           step 3. type a user-name
        //       step 4.  assign a check mark to the user-name
        // step 5.  click "Create Group DM" button
        driver.findElement(By.xpath("//a[@href='/channels/@me/979583951368777738']")).click();
        //                                           step 6. type a message in the input box
        //  step 7. hit Enter/Return keyboard to send the message
        WebElement message = driver.findElement(By.xpath("//div[@data-slate-node='element']"));
        message.sendKeys("Hi Dana How is life, This message means that the test is done successfully! Good luck in your test" + Keys.ENTER);
        //  step 8. Verify that the user sent the message successfully
        System.out.println("message.isDisplayed() = " + message.isDisplayed());
        driver.close();
    }
}
