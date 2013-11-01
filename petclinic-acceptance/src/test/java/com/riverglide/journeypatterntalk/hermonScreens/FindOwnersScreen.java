package com.riverglide.journeypatterntalk.hermonScreens;

import net.masterthought.hermon.annotations.Alias;
import net.masterthought.hermon.annotations.LocateBy;
import net.masterthought.hermon.annotations.Url;
import net.masterthought.hermon.elements.ScreenElement;
import net.masterthought.hermon.screens.WebScreen;

@Url("http://localhost:9966/petclinic/owners/find.html")
public class FindOwnersScreen extends WebScreen{

    @Alias("Search Button")
    @LocateBy(css="#search-owner-form button")
    public ScreenElement searchButton;

}
