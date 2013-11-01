package com.riverglide.journeypatterntalk.hermonScreens;

import net.masterthought.hermon.annotations.Alias;
import net.masterthought.hermon.annotations.LocateBy;
import net.masterthought.hermon.annotations.Url;
import net.masterthought.hermon.elements.ScreenElement;
import net.masterthought.hermon.screens.WebScreen;
import org.openqa.selenium.support.FindBy;

@Url("http://localhost:9966/petclinic/")
public class HomeScreen extends WebScreen{

    @Alias("Welcome Message")
    @LocateBy(css="h2")
    public ScreenElement welcomeMessage;

}
