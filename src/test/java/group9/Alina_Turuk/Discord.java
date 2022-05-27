package group9.Alina_Turuk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Discord {
    public static void main(String[] args) throws  InterruptedException {
        /*
        guys, i was inspired to create  new selenium excersise for us:
e.g.  test case: the user can send a direct message in discord app
                              steps:  step 1. the user is on the HOME
                                           step 2. click + icon to create a direct message
                                           step 3. type a user-name
       step 4.  assign a check mark to the user-name
 step 5.  click "Create Group DM" button
                                           step 6. type a message in the input box
  step 7. hit Enter/Return keyboard to send the message
  step 8. Verify that the user sent the message successfully
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://discord.com/channels/971571069473423410/971571070035431527");
        Thread.sleep(1500);
        WebElement login=driver.findElement(By.cssSelector("input[type='text']"));
        login.sendKeys("alinajob@aol.com");

        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Amira3828");
        Thread.sleep(2500);
        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(2500);
        // step 1. the user is on the HOME
        WebElement homeButton=driver.findElement(By.cssSelector("div[class='childWrapper-1j_1ub']"));
        homeButton.click();

        Thread.sleep(1500);
        WebElement danaIvey= driver.findElement(By.xpath("//div[text()='Dana Ivey']"));
        danaIvey.click();

        Thread.sleep(1500);
        WebElement message=driver.findElement(By.cssSelector("div[data-slate-node='element']"));
        message.sendKeys("This message created by Alina Turuk and sent automatic. Please, do not answer. I  Just practice Dana task ");
        message.sendKeys(Keys.ENTER);
        Thread.sleep(1500);

        message.click();















// driver.quit();
    }
}
