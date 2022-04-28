package com.mesaj.app.pageObjects;

import org.openqa.selenium.WebDriver;

public class BasePage {

    public void go(WebDriver driver, String url){
        driver.get(url);
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
