package com.mesaj.app.conf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mesaj.app")
public class DriverConfig {
    @Bean
    public WebDriver webDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
