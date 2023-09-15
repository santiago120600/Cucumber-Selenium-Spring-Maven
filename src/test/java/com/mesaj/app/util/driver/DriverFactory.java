package com.mesaj.app.util.driver;

import com.mesaj.app.enums.Browser;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;

import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
public class DriverFactory {
	// public static String hubAddress = "http://192.168.1.74:4444/wd/hub";

    public static WebDriver get(Browser browser, String hubAddress){
        MutableCapabilities cap;
        if (Browser.chrome == browser){
            cap = new ChromeOptions();
        }else if (Browser.firefox == browser){
           cap = new FirefoxOptions();
        }else if (Browser.ie == browser){
            cap = new InternetExplorerOptions();
        }else{
            throw new IllegalArgumentException("Driver not found for browser: "+browser);
        }
        try {
            WebDriver driver = new RemoteWebDriver(new URL(hubAddress), cap);
            return driver;
        }catch(MalformedURLException ex){
            throw new IllegalArgumentException(ex);
        }
    }
}
