package group9.petro.tests;

import group9.petro.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class WoodenSpoon {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //1. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        //2. Search for “wooden spoon”
        driver.findElement(By.xpath("//input[@ data-id='search-query']")).sendKeys("wooden spoon" + Keys.ENTER);

        //3. Click on filters
        driver.findElement(By.xpath("//span[.='All Filters']")).click();

        //4. Select free shipping, on sale
        driver.findElement(By.xpath("//label[@for='special-offers-free-shipping']")).click();

        //5. Select under $25 Click on apply filters
        driver.findElement(By.xpath("//label[@for='price-input-1']")).click();

        //6. Print count of results
        driver.findElement(By.xpath("//button[contains(.,'Apply')]")).click();
        Thread.sleep(5000);
        WebElement result = driver.findElement(By.xpath("//span[@class='wt-display-inline-flex-sm']/span[1]"));
        if (result.getText().contains("9,295")) {
            System.out.println(result.getText() + " matches to clint's requirements");
        } else {
            System.out.println(result.getText() + " does not match to clint's requirements");
        }
        driver.quit();

    }
}
