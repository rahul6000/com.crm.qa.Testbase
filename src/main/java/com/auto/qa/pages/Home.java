package com.auto.qa.pages;

import com.auto.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends TestBase {

    @FindBy(xpath = "//*[@id=\"search_query_top\"]")
            @CacheLookup
    WebElement searchBar;

    @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
    @CacheLookup
    WebElement searchBtn;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    @CacheLookup
    WebElement women;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")
    @CacheLookup
    WebElement dresses;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    @CacheLookup
    WebElement tShirts;

    @FindBy(xpath = "//*[@id=\"htmlcontent_home\"]/ul/li[1]/a/img")
    @CacheLookup
    WebElement topTrends;

    @FindBy(xpath = "//*[@id=\"htmlcontent_home\"]/ul/li[2]/a/img")
    @CacheLookup
    WebElement mensCoats;

    @FindBy(xpath = "//*[@id=\"newsletter-input\"]")
    @CacheLookup
    WebElement newsletter;

    @FindBy(xpath = "//*[@id=\"newsletter_block_left\"]/div/form/div/button")
    @CacheLookup
    WebElement newsLetterBtn;

    @FindBy(xpath = "//*[@id=\"block_various_links_footer\"]/ul/li[1]/a")
    @CacheLookup
    WebElement special;

    @FindBy(xpath = "//*[@id=\"block_various_links_footer\"]/ul/li[3]/a")
    @CacheLookup
    WebElement bestSpecial;

    @FindBy(xpath = "//*[@id=\"block_various_links_footer\"]/ul/li[7]/a")
    @CacheLookup
    WebElement aboutUs;

    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    @CacheLookup
    WebElement logoImg;


    //Initialization page objects using Page Factory

    public Home () {
        PageFactory.initElements(driver, this);
    }
    //Actions

    public String validateHomePageTitle() {
        return driver.getTitle();

    }

    public boolean validateLogoImg() {
        return logoImg.isDisplayed();
    }

    public void searchbar(String search) {
        //searchBar.sendKeys(search);
        searchBar.sendKeys(prop.getProperty(search));
        searchBtn.click();
    }
    public void womanlabel() {

        women.click();
    }
    public void dresslabel() {
        dresses.click();
    }
    public void tshirtlabel() {
        tShirts.click();
    }
    public void banner1() {
        topTrends.click();
    }
    public void banner2() {
        mensCoats.click();
    }
    public void special() {
        special.click();
    }
    public void aboutus() {
        aboutUs.click();
    }
    public void bestspecial() {
        bestSpecial.click();
    }

    public Home newsLetter(String email){
        newsletter.sendKeys(prop.getProperty(email));
        newsLetterBtn.click();
        return new Home();

    }

}
