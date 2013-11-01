package com.riverglide.journeypatterntalk.hermonScreens.actions;


import com.riverglide.journeypatterntalk.hermonScreens.webdriver.Driver;

public class Navigate {

    public static void to(String url){
        Driver.getDriver().get(url);
    }
}
