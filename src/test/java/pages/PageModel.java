package pages;

import cucumber.api.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SetProperty;
import org.openqa.selenium.Keys;

public abstract class PageModel {

    public WebElement getElementById(String id){
        WebElement webElem = (new WebDriverWait(SetProperty.driver,10).until(ExpectedConditions.presenceOfElementLocated(By.id(id))));
        return  webElem;
    }

    public WebElement getElementsByXpath(String xpath){
        System.out.println("Dirver is " +SetProperty.driver);
        WebElement webElem = (new WebDriverWait(SetProperty.driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        return webElem;
    }

    public WebElement getElementsByClassName(String classname){
        WebElement webElem = SetProperty.driver.findElement(By.className(classname));
        return  webElem;
    }

    public void clickOnElementByXPath(String xpath){
        ( new WebDriverWait(SetProperty.driver,5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
    }

    public void sendKeysByXPath(String xpath,String keys){
        ( new WebDriverWait(SetProperty.driver,5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).sendKeys(keys);
    }

    public void PressEnterByXpath(String xpath){
        WebElement textBox = this.getElementsByXpath(xpath);
        textBox.sendKeys(Keys.RETURN);
    }

}
