package com.auto.qa.pages;

import com.auto.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends TestBase {

    @FindBy(xpath="//*[@id=\"search_query_top\"]")
    WebElement searchBar;

    @FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    WebElement women;

    @FindBy(xpath="///*[@id=\"block_top_menu\"]/ul/li[2]/a")
    WebElement men;

    @FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    WebElement tShirts;

    @FindBy(xpath="//*[@id=\"htmlcontent_home\"]/ul/li[1]/a/img")
    WebElement topTrends;

    @FindBy(xpath="//*[@id=\"htmlcontent_home\"]/ul/li[2]/a/img")
    WebElement mensCoats;

    @FindBy(xpath="//*[@id=\"newsletter-input\"]")
    WebElement newsLetter;

    @FindBy(xpath="//*[@id=\"block_various_links_footer\"]/ul/li[1]/a")
    WebElement special;

    @FindBy(xpath="//*[@id=\"block_various_links_footer\"]/ul/li[3]/a")
    WebElement bestSpecial;

    @FindBy(xpath="//*[@id=\"block_various_links_footer\"]/ul/li[7]/a")
    WebElement aboutUs;

    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    WebElement logoImg;


    //Initialization page objects using Page Factory

    public Home(){
        PageFactory.initElements(driver, this);
    }
    //Actions

    public String validateHomePageTitle(){
        return driver.getTitle();
    }

    public boolean validateLogoImg(){
        return logoImg.isDisplayed();
    }








}
