package ru.maxima;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "applicationcontext.xml"
                );
        Radio radio = context.getBean("idOfRadioMaximum", RadioMaximum.class);
        RadioPlayer player = new RadioPlayer(radio);
        player.playRadio();

        radio = context.getBean("idOfRadioEnergy", RadioEnergy.class);
        player = new RadioPlayer(radio);
        player.playRadio();

        radio = context.getBean("idOfRadioEuropaPlus", RadioEuropaPlus.class);
        player = new RadioPlayer(radio);
        player.playRadio();
    }
}
