package com.riverglide.journeypatterntalk.hermonScreens.actions;

import net.masterthought.hermon.elements.ScreenElement;
import org.openqa.selenium.By;

public class Count {

    public static Integer all(ScreenElement screenElement){
        return Find.all(screenElement).size();
    }

    public static Integer allWithin(ScreenElement baseScreenElement, ScreenElement screenElements){
        return Find.allWithin(baseScreenElement, screenElements).size();
    }

    public static Integer allWithin(ScreenElement baseScreenElement, By by){
        return Find.allWithin(baseScreenElement, by).size();
    }
}
