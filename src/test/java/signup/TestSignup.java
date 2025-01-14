package signup;

import base.BaseSteps;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.Sonyvaioi5;

import static org.testng.Assert.assertTrue;

public class TestSignup extends BaseSteps {

    @Test

    public void testSignUp() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickOnSignUp();
        homePage.enteruserName("michael ");
        homePage.enterPassword("12345");
        homePage.signupbutton();

Thread.sleep(3000);
        String actualresult = homePage.getmessage();
        String expctedresult = "Sign up successful.";

        assertTrue(actualresult.contains(expctedresult));
        homePage.clickonokbutton();
        Thread.sleep(1000);
        homePage.setLaptops();
       Sonyvaioi5 sonyvaioi5 = homePage.setSonyvaioi5();

    }


}
