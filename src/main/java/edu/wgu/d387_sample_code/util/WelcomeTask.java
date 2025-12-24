package edu.wgu.d387_sample_code.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class WelcomeTask implements Runnable {

    private final Locale locale;
    private String message;

    public WelcomeTask(Locale locale) {
        this.locale = locale;
    }

    @Override
    public void run() {
        ResourceBundle bundle = ResourceBundle.getBundle("welcome", locale);
        message = bundle.getString("welcome");
    }

    public String getMessage() {
        return message;
    }
}
