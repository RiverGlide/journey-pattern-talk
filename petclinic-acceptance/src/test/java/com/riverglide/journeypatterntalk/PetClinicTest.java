package com.riverglide.journeypatterntalk;

import com.riverglide.journeypatterntalk.seleniumpageobject.HomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PetClinicTest {

    private WebDriver driver;
    private final static String baseUrl = "http://localhost:8888/petclinic/";

    @Before
    public void set_up() throws Exception {
        driver = new PhantomJSDriver(desiredCapabilities());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void should_have_a_place_to_start() throws Exception {
        driver.get(baseUrl);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        assertThat(homePage.getWelcomeMessage(), is("Welcome"));
    }

    @After
    public void tear_down() throws Exception {
        driver.quit();
    }

    private DesiredCapabilities desiredCapabilities() {
        DesiredCapabilities dCaps = new DesiredCapabilities();
        dCaps.setJavascriptEnabled(true);
        dCaps.setCapability("takesScreenshot", false);
        return dCaps;
    }
}