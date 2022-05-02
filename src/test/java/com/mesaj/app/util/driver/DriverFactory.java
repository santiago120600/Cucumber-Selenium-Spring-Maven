package com.mesaj.app.util.driver;

import com.mesaj.app.enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

    public static WebDriver get(Browser browser){
        if (Browser.chrome == browser){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }else if (Browser.firefox == browser){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else if (Browser.ie == browser){
            WebDriverManager.iedriver().setup();
            return new InternetExplorerDriver();
        }else{
            throw new IllegalArgumentException("Driver not found for browser: "+browser);
        }
    }
}
