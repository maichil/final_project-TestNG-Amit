package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cartpage {

    WebDriver driver;

    public Cartpage(WebDriver driver){
        this.driver = driver;
    }

    //loactors


    private By title1 = By.xpath("//td[contains(text(),'i5')]");
    private By title2 = By.xpath("//td[contains(text(),'i7')]");
    private By price1 = By.xpath("//td[contains(text(),'790')]");
    private By price2 = By.xpath("//td[contains(text(),'790')]");
    private By total = By.id("totalp");
    private By placeorder =By.xpath("//button[@data-toggle=\"modal\"]");
    private By name = By.id("name");
    private By country = By.id("country");
    private By city = By.id("city");
    private By creditcard = By.id("card");
    private By month = By.id("month");
    private By year = By.id("year");
    private By purchasebutton = By.xpath("//button[@onclick=\"purchaseOrder()\"]");
    private By thankyoumessage = By.xpath("//h2[contains(text(),'Thank')]");
    private By okmessage = By.xpath("//button[@class=\"confirm btn btn-lg btn-primary\"]");










    //actions


    public String setTitle1() {
        String text = driver.findElement(title1).getText();
        return text;
    }
    public String setTitle2() {
        String text = driver.findElement(title2).getText();
        return text;
    }
    public String setprice1() {
        String text = driver.findElement(price1).getText();
        return text;
    }
    public String setprice2() {
        String text = driver.findElement(price2).getText();
        return text;
    }
    public String settotal() {
        String text = driver.findElement(total).getText();
        return text;
    }
    public void  setPlaceorder(){driver.findElement(placeorder).click();}

    public void setName(String Name){driver.findElement(name).sendKeys(Name);}
    public void setCountry(String Country){driver.findElement(country).sendKeys(Country);}
    public void setCity(String City){driver.findElement(city).sendKeys(City);}
    public void setCreditcard(String Creditcard){driver.findElement(creditcard).sendKeys(Creditcard);}

    public void setMonth(String Month){driver.findElement(month).sendKeys(Month);}
    public void setYear(String Year){driver.findElement(year).sendKeys(Year);}
    public void setPurchasebutton(){driver.findElement(purchasebutton).click();}

    public String setThankyoumessage() {
        String text = driver.findElement(thankyoumessage).getText();
        return text;
    }

    public void setOkmessage(){driver.findElement(okmessage).click();}
}
