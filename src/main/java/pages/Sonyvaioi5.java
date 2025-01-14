package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sonyvaioi5 {

    WebDriver driver ;
    WebDriverWait wait;
    public Sonyvaioi5 (WebDriver driver) {
        this.driver = driver;
    }

    //loactors

    private By addtocart= By.xpath("//a[@class=\"btn btn-success btn-lg\"]");
    private By homepage = By.xpath("(//a[@class=\"nav-link\"])[1]");







    //actions
    public void setAddtocart(){driver.findElement(addtocart).click();}

    public String getmessage(){String text=driver.switchTo().alert().getText();
        return text;}
    public void clickonokbutton(){driver.switchTo().alert().accept();}

    public void setHomepage(){driver.findElement(homepage).click();}



}
