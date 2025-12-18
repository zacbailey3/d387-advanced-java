package edu.wgu.d387_sample_code.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class WelcomeTask implements Runnable {

    private final Locale locale;

    public WelcomeTask(Locale locale) {
        this.locale = locale;
    }

    @Override
    public void run() {
        ResourceBundle bundle =
                ResourceBundle.getBundle("welcome", locale);

        System.out.println(
                bundle.getString("welcome")
                        + " | Thread: "
                        + Thread.currentThread().getName()
        );

    }
}
