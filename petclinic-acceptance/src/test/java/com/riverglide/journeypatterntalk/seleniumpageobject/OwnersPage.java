package com.riverglide.journeypatterntalk.seleniumpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OwnersPage {

    @FindBy(css="#owners tbody")
    private WebElement owners;

    public int numberOfOwners() {
        return owners.findElements(By.tagName("tr")).size();
    }
}