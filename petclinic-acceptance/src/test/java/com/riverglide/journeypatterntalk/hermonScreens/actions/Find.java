package com.riverglide.journeypatterntalk.hermonScreens.actions;

import com.google.common.base.Function;
import com.riverglide.journeypatterntalk.hermonScreens.webdriver.Driver;
import net.masterthought.hermon.elements.ScreenElement;
import net.masterthought.hermon.locators.WebDriverLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class Find {

    public static WebElement the(ScreenElement screenElement){
        return fluentWait(Driver.getDriver()).until(elementIsFound(getBy(screenElement)));
    }

    public static List<WebElement> all(ScreenElement screenElement) {
        return fluentWait(Driver.getDriver()).until(elementsAreFound(getBy(screenElement)));
    }

    private static By getBy(ScreenElement screenElement) {
        return ((WebDriverLocator)screenElement.getLocator()).value();
    }

    static Function<WebDriver, WebElement> elementIsFound(final By locator) throws NoSuchElementException {
        return new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        };
    }

    static Function<WebDriver, List<WebElement>> elementsAreFound(final By locator) throws NoSuchElementException {
        return new Function<WebDriver, List<WebElement>>() {
            public List<WebElement> apply(WebDriver driver) {
                return driver.findElements(locator);
            }
        };
    }

    public static FluentWait<WebDriver> fluentWait(WebDriver driver){
        return  new FluentWait<WebDriver>(driver)
                .withTimeout(5, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
    }
}
