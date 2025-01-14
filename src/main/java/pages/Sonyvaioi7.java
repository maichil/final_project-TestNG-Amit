package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sonyvaioi7 {

    WebDriver driver ;
    WebDriverWait wait;
    public Sonyvaioi7 (WebDriver driver) {
        this.driver = driver;
    }

    //loactors

    private By addtocart= By.xpath("//a[@class=\"btn btn-success btn-lg\"]");
    private By cartbutton = By.id("cartur");







    //actions
    public void setAddtocart(){driver.findElement(addtocart).click();}

    public String getmessage(){String text=driver.switchTo().alert().getText();
        return text;}
    public void clickonokbutton(){driver.switchTo().alert().accept();}

    public Cartpage setCartbutton(){driver.findElement(cartbutton).click();
        return new Cartpage(driver);
    }




}
