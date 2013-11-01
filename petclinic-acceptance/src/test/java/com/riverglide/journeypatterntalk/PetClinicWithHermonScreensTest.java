package com.riverglide.journeypatterntalk;

import com.riverglide.journeypatterntalk.hermonScreens.FindOwnersScreen;
import com.riverglide.journeypatterntalk.hermonScreens.HomeScreen;
import com.riverglide.journeypatterntalk.hermonScreens.OwnersScreen;
import com.riverglide.journeypatterntalk.hermonScreens.actions.*;
import com.riverglide.journeypatterntalk.hermonScreens.webdriver.Driver;
import net.masterthought.hermon.WebDriverScreens;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PetClinicWithHermonScreensTest {

    HomeScreen homeScreen;
    FindOwnersScreen findOwnersScreen;
    OwnersScreen ownersScreen;

    @Before
    public void set_up() throws Exception {
        Driver.start();
        homeScreen = WebDriverScreens.init(new HomeScreen());
        findOwnersScreen = WebDriverScreens.init(new FindOwnersScreen());
        ownersScreen = WebDriverScreens.init(new OwnersScreen());
    }

    @Test
    public void should_have_a_place_to_start() throws Exception {
        Navigate.to(homeScreen.getUrl());
        assertThat(Read.the(homeScreen.welcomeMessage), is("Welcome"));
    }

    @Test
    public void should_find_all_owners() throws Exception {
        Navigate.to(findOwnersScreen.getUrl());
        Click.on(findOwnersScreen.searchButton);
        assertThat(Count.all(ownersScreen.owners), is(1));
    }

    @After
    public void tear_down() throws Exception {
        Driver.stop();
    }

}