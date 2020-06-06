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
                FileInputStream ip = new FileInputStream("Macintosh HD\u2069 ▸ \u2068Users\u2069 ▸ \u2068rahul\u2069 ▸ \u2068IdeaProjects\u2069 ▸ \u2068com.crm.qa.Testbase\u2069 ▸ \u2068src\u2069 ▸ \u2068main\u2069 ▸ \u2068java\u2069 ▸ \u2068com\u2069 ▸ \u2068auto\u2069 ▸ \u2068qa\u2069 ▸ \u2068config\u2069");
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
                System.setProperty("webdriver.chrome.driver", "Macintosh HD\u2069 ▸ \u2068Users\u2069 ▸ \u2068rahul\u2069 ▸ \u2068Desktop\u2069 ▸ \u2068testing\u2069.chromedriver");
                driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

            driver.get(prop.getProperty("url"));
        }
    }

