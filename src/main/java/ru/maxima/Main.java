package ru.maxima;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "applicationcontext.xml"
                );
        RadioPlayer radioPlayer = context.getBean("radioPlayer", RadioPlayer.class);
        radioPlayer.playRadio();

    }
}
