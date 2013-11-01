package com.riverglide.journeypatterntalk.hermonScreens;

import net.masterthought.hermon.annotations.Alias;
import net.masterthought.hermon.annotations.LocateBy;
import net.masterthought.hermon.elements.ScreenElement;
import net.masterthought.hermon.screens.WebScreen;

public class OwnersScreen extends WebScreen{

    @Alias("All owners")
    @LocateBy(css="#owners tbody")
    public ScreenElement owners;

}
