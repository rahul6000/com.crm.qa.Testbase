package com.auto.qa.Testcases;

import com.auto.qa.base.TestBase;
import com.auto.qa.pages.Home;
import org.openqa.selenium.support.CacheLookup;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {
    Home homepage;
    public HomeTest(){
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
    homepage=new Home();
    }

    @Test (priority = 1)
    public void titletest(){
        String homepagetitle=homepage.validateHomePageTitle();
        System.out.println(homepagetitle);
        Assert.assertEquals(homepagetitle,"My Store");

    }


    @Test (priority = 2)
    public void searchBarTest(){
     homepage.searchbar("search");
   }
    @Test (priority = 3)
    public void womanLabel(){
        homepage.womanlabel();
    }
    @Test (priority = 4)
    public void dressLabel(){
        homepage.dresslabel();
    }
    @Test (priority = 5)
    public void tshirtLabel(){
        homepage.tshirtlabel();
    }
    @Test (priority = 6)
    public void nLetter(){
        homepage.newsLetter("email");
    }

    @AfterMethod
    public void teardown(){
        driver.quit();


}

}
