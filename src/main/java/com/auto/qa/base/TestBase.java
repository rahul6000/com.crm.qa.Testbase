package com.auto.qa.base;

import com.auto.qa.util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase  {

        public static WebDriver driver;
        public static Properties prop;


        public TestBase() {
            try {

                prop = new Properties();
                FileInputStream ip = new FileInputStream("/Users/rahul/IdeaProjects/com.crm.qa.Testbase/src/main/java/com/auto/qa/config.properties");
                prop.load(ip);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void initialization (){
            String browserName = prop.getProperty("browser");

            if(browserName.equals("chrome")){
                System.setProperty("webdriver.chrome.driver", "/Users/rahul/Desktop/testing/chromedriver");
                driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

            driver.get(prop.getProperty("url"));
        }
    }

