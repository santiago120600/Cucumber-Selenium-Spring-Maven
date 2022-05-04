package com.mesaj.app.util.driver;

public class HelpFunctions {

    public static final void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
