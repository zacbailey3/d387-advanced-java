package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.util.WelcomeTask;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public List<String> getWelcomeMessages() throws InterruptedException {

        WelcomeTask englishTask = new WelcomeTask(Locale.US);
        WelcomeTask frenchTask = new WelcomeTask(Locale.CANADA_FRENCH);

        Thread englishThread = new Thread(englishTask);
        Thread frenchThread = new Thread(frenchTask);

        englishThread.start();
        frenchThread.start();

        englishThread.join();
        frenchThread.join();

        List<String> messages = new ArrayList<>();
        messages.add(englishTask.getMessage());
        messages.add(frenchTask.getMessage());

        return messages;
    }
}
