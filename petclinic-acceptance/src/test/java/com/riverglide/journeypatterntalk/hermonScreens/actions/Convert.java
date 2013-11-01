package com.riverglide.journeypatterntalk.hermonScreens.actions;

import com.riverglide.journeypatterntalk.hermonScreens.webdriver.Driver;
import net.masterthought.hermon.elements.ScreenElement;
import net.masterthought.hermon.locators.WebDriverLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class Convert {

    public static WebElement toWebElement(ScreenElement screenElement){
        return Driver.getDriver().findElement(getBy(screenElement));
    }

    public static List<WebElement> toWebElementList(ScreenElement screenElement) {
        return Driver.getDriver().findElements(getBy(screenElement));
    }

    private static By getBy(ScreenElement screenElement) {
        return ((WebDriverLocator)screenElement.getLocator()).value();
    }
}
