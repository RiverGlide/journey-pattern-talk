package com.riverglide.journeypatterntalk.hermonScreens.actions;

import net.masterthought.hermon.elements.ScreenElement;

public class Read {

    public static String the(ScreenElement screenElement){
        return Find.the(screenElement).getText();
    }
}
