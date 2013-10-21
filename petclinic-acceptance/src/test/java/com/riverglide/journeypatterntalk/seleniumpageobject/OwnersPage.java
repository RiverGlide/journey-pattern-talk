package com.riverglide.journeypatterntalk.seleniumpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OwnersPage {

    private static final int EXTRA_ROW = 1;
    private WebElement owners;

    public int numberOfOwners() {
        return owners.findElements(By.tagName("tr")).size() - EXTRA_ROW;
    }
}
