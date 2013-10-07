package com.riverglide.journeypatterntalk;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PetClinicTest {

    private WebDriver driver;
    private final static String baseUrl = "http://localhost:8888/petclinic/";

    @Before
    public void setUp() throws Exception {

        DesiredCapabilities dCaps = new DesiredCapabilities();
        dCaps.setJavascriptEnabled(true);
        dCaps.setCapability("takesScreenshot", false);

        driver = new PhantomJSDriver(dCaps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void should_have_a_correct_title() throws Exception {
        driver.get(baseUrl);

        assertThat(driver.getTitle(), is("PetClinic :: a Spring Framework demonstration"));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}