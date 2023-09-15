package com.mesaj.app.tasks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.cucumber.java.Scenario;

@Component
public class TakeScreenshot {
    @Autowired
    private WebDriver driver;
    
    public void captureAndAttachScreenshot(Scenario scenario) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] src = ts.getScreenshotAs(OutputType.BYTES);
        scenario.embed(src, "image/png", "screenshot");
    }
}
