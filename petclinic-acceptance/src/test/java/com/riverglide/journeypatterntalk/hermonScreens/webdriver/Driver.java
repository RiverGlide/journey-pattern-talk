package com.riverglide.journeypatterntalk.hermonScreens.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;


    public static void stop() {
        if(driver != null) driver.quit();
    }

    public static void start() {
        driver = new PhantomJSDriver(desiredCapabilities());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    public static WebDriver getDriver(){
        return Driver.driver;
    }

    private static DesiredCapabilities desiredCapabilities() {
        DesiredCapabilities dCaps = new DesiredCapabilities();
        dCaps.setJavascriptEnabled(true);
        dCaps.setCapability("takesScreenshot", false);
        return dCaps;
    }
}
