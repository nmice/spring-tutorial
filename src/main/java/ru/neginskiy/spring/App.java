package ru.neginskiy.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private Client client;

    private ConsoleEventLogger eventLogger;

    public void logEvent(String msg) {
        String message = msg.replaceAll(
                client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");

/*        app.client = new Client("1", "John Smith");
        app.eventLogger = new ConsoleEventLogger();*/
        app.logEvent("Some event for user 1");
        app.logEvent("Some event for user 2");
    }
}
