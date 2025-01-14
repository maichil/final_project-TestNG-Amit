package purchasedsucessfully;

import base.BaseSteps;
import org.testng.annotations.Test;
import pages.Cartpage;
import pages.Sonyvaioi5;
import pages.Sonyvaioi7;

import static org.testng.AssertJUnit.assertTrue;

public class TestPurchasedSucessfully extends BaseSteps {

    @Test
    public void Testpurchase () throws InterruptedException {

        //login section

        homePage.clickonloginhomepage();
        homePage.setEnterusernamelogin("micheal1");
        homePage.setEnterpasswordlogin("12345");
        homePage.Clickonloginbutton();
        homePage.setWelcomemessage();
        Thread.sleep(3000);
        String actualresult = homePage.setWelcomemessage();
        String expectedresult = "Welcome micheal1";
        assertTrue(actualresult.contains(expectedresult));


        //adding laptops sonyi5
        Thread.sleep(4000);
        homePage.setLaptops();
        Thread.sleep(4000);
        Sonyvaioi5 sonyvaioi5= homePage.setSonyvaioi5();
        sonyvaioi5.setAddtocart();
        Thread.sleep(4000);
       sonyvaioi5.getmessage();
       String actualresult1 = sonyvaioi5.getmessage();
       String expctedresult1 = "Product added.";
       assertTrue(actualresult1.contains(expctedresult1));

       sonyvaioi5.clickonokbutton();
       Thread.sleep(3000);
       sonyvaioi5.setHomepage();


       //adding laptopi7
       homePage.setLaptops();
      Sonyvaioi7 sonyvaioi7= homePage.setSonyvaioi7();
      sonyvaioi7.setAddtocart();

      Thread.sleep(3000);
        String actualresult2 = sonyvaioi7.getmessage();
        String expctedresult2 = "Product added.";
        assertTrue(actualresult2.contains(expctedresult2));

        Thread.sleep(2000);
        sonyvaioi7.clickonokbutton();

        //Cartpage

        Cartpage cartpage =sonyvaioi7.setCartbutton();
        cartpage.setTitle1();

        Thread.sleep(2000);
        String actualresult3 =cartpage.setTitle1();
        String expctedresult3 = "Sony vaio i5";
        assertTrue(actualresult3.contains(expctedresult3));


        Thread.sleep(2000);
        String actualresult4 =cartpage.setTitle2();
        String expctedresult4 = "Sony vaio i7";
        assertTrue(actualresult4.contains(expctedresult4));

        Thread.sleep(2000);
        String actualresult5 =cartpage.setprice1();
        String expctedresult5 = "790";
        assertTrue(actualresult5.contains(expctedresult5));


        Thread.sleep(2000);
        String actualresult6 =cartpage.setprice2();
        String expctedresult6 = "790";
        assertTrue(actualresult6.contains(expctedresult6));

        Thread.sleep(2000);
        String actualresult7 =cartpage.settotal();
        String expctedresult7 = "1580";
        assertTrue(actualresult7.contains(expctedresult7));


        //section purchase

        cartpage.setPlaceorder();
        cartpage.setName("michael");
        cartpage.setCountry("egypt");
        cartpage.setCity("giza");
        cartpage.setCreditcard("34543365");
        cartpage.setMonth("02");
        cartpage.setYear("2000");
        cartpage.setPurchasebutton();

Thread.sleep(2000);
        String actualresult8 = cartpage.setThankyoumessage();
        String expctedresult8 = "Thank you for your purchase!";
        assertTrue(actualresult8.contains(expctedresult8));

        cartpage.setOkmessage();
























    }
}
