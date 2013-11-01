package com.riverglide.journeypatterntalk.hermonScreens.actions;

import net.masterthought.hermon.elements.ScreenElement;

public class Count {

    public static Integer all(ScreenElement screenElement){
        return Convert.toWebElementList(screenElement).size();
    }
}
