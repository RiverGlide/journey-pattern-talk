package com.riverglide.journeypatterntalk.seleniumpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.CSS, using="h2")
    private WebElement welcomeMessage;

    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }
}
