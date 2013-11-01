package com.riverglide.journeypatterntalk.hermonScreens.actions;

import net.masterthought.hermon.elements.ScreenElement;

public class Click {

    public static void on(ScreenElement screenElement){
        Convert.toWebElement(screenElement).click();
    }
}
