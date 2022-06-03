package group9.petro.tests;

import group9.petro.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class StaleElementReferenceException {
    /*
    *** In this practice StaleElementReferenceException is
coming because of navigation(refresh). When exception
comes because of navigation, we should handle with
reassigning (relocating) the web element after navigation
happens.
     */
    public static void main(String[] args) {
        //1. Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3. Locate “CYDEO” link, verify it is displayed.
        WebElement cydeo = driver.findElement(By.xpath("//*[@href='https://cydeo.com/']"));
        System.out.println("cydeo.isDisplayed() = " + cydeo.isDisplayed());

        //4. Refresh the page.
        driver.navigate().refresh();

        //5. Verify it is displayed, again.
        try{
            System.out.println("cydeo.isDisplayed() = " + cydeo.isDisplayed());
        }catch (org.openqa.selenium.StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException is thrown");
            System.out.println("Don't worry you'll be fine");
            WebElement cydeoRelocating = driver.findElement(By.xpath("//*[@href='https://cydeo.com/']"));
            System.out.println("cydeoRelocating.isDisplayed() = " + cydeoRelocating.isDisplayed());
            System.out.println("You see:)");
        }
        driver.quit();
    }
}
