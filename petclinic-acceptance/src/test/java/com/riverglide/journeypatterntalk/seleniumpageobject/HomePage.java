package com.riverglide.journeypatterntalk.seleniumpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(css="h2")
    private WebElement welcomeMessage;
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }
}
