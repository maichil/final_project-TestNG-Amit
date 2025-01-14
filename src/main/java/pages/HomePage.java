package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver ;
    WebDriverWait wait;
    public HomePage(WebDriver driver){
        this.driver= driver;

    }

    //loacters
    private By signup = By.id("signin2");
    private By usernamesignup = By.id("sign-username");
    private By passwordsignup = By.id("sign-password");
    private By clickonsignupbutton = By.xpath("//button[@onclick=\"register()\"]");

    private By loginhomepage =By.id("login2");
    private By enterusernamelogin = By.id("loginusername");
    private By enterpasswordlogin =By.id("loginpassword");
    private By clickonloginbutton = By.xpath("//button[@onclick=\"logIn()\"]");
    private By welcomemessage = By.id("nameofuser");
    private By laptops = By.xpath("//a[@onclick=\"byCat('notebook')\"]");
    private By sonyvaioi5 = By.xpath("(//a[@class=\"hrefch\"])[1]");
    private By Sonyvaioi7 = By.xpath("(//a[@href=\"prod.html?idp_=9\"])[1]");





    //Actions
    public void clickOnSignUp(){driver.findElement(signup).click();}
    public void enteruserName(String username){driver.findElement(usernamesignup).sendKeys(username);}
    public void enterPassword(String password){driver.findElement(passwordsignup).sendKeys(password);}
    public void signupbutton(){driver.findElement(clickonsignupbutton).click();}

    public String getmessage(){String text=driver.switchTo().alert().getText();
    return text;}
    public void clickonokbutton(){driver.switchTo().alert().accept();}

    public void clickonloginhomepage(){driver.findElement(loginhomepage).click();}
    public void setEnterusernamelogin(String username){driver.findElement(enterusernamelogin).sendKeys(username);}
    public void setEnterpasswordlogin(String password){driver.findElement(enterpasswordlogin).sendKeys(password);}
    public void Clickonloginbutton(){driver.findElement(clickonloginbutton).click();}
    public String setWelcomemessage() {
        String text = driver.findElement(welcomemessage).getText();
        return text;
    }
    public void setLaptops(){driver.findElement(laptops).click();}
    public Sonyvaioi5 setSonyvaioi5(){driver.findElement(sonyvaioi5).click();
        return new Sonyvaioi5(driver);
    }
    public Sonyvaioi7 setSonyvaioi7(){driver.findElement(Sonyvaioi7).click();
        return new  Sonyvaioi7(driver);
    }






}
