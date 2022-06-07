package group9.petro.homework;

import group9.petro.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

//1. Open Chrome browser
public class DropdownSelectingDate extends TestBase {

    @Test
    public void dropdownSelectingDate() {

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

        // Select year using   : visible text
        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("1923");

        //Select month using    : value attribute Select
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByValue("11");

        //day using : index number
        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByIndex(0);

        //3. Select “December 1st, 1923” and verify it is selected.
        Assert.assertEquals(year.getFirstSelectedOption().getText(), "1923","Wrong input");
        Assert.assertEquals(month.getFirstSelectedOption().getText(),"December","Wrong input");
        Assert.assertEquals(day.getFirstSelectedOption().getText(),"1","Wrong input");

    }
}
