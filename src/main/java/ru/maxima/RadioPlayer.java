package ru.maxima;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Radio {
    String getCurrentSong();
}

@Component
class RadioMaximum implements Radio {
    private List<String> listOfSongs = new ArrayList<>();

    @Override
    public String getCurrentSong() {
        listOfSongs = Arrays.asList("Red Hot Chili Peppers - Californication",
                "Aerosmith - Dude (Looks Like A Lady)",
                "Bon Jovi - It's My Life");
        return listOfSongs.toString();
    }
}

@Component
class RadioEnergy implements Radio {
    private List<String> listOfSongs = new ArrayList<>();

    @Override
    public String getCurrentSong() {
        listOfSongs = Arrays.asList("Avicii - Levels",
                "The future X - This kind of love",
                "Aurora - Cure for me");
        return listOfSongs.toString();
    }
}@Component
class RadioJazz implements Radio {
    private List<String> listOfSongs = new ArrayList<>();

    @Override
    public String getCurrentSong() {
        listOfSongs = Arrays.asList("Cannonball Adderley — Autumn Leaves",
                "Julius Rodriguez — Elegy (For Cam)",
                "Richard Elliot — Authentic Life");
        return listOfSongs.toString();
    }
}

@Component
class RadioEuropaPlus implements Radio {
    private List<String> listOfSongs = new ArrayList<>();


    @Override
    public String getCurrentSong() {
        listOfSongs = Arrays.asList("Eric Prydz - Call On Me",
                "Underwater - Mackenzie Arromba",
                "Barbara Streisand - Duck Sauce");
        return listOfSongs.toString();
    }
}

@Getter
@Component
public class RadioPlayer {
    private Radio radio1;
    private Radio radio2;
    private Radio radio3;
    private Radio radio4;

    @Autowired
    public RadioPlayer(@Qualifier("radioMaximum") Radio radio1,
                       @Qualifier("radioEnergy") Radio radio2,
                       @Qualifier("radioEuropaPlus") Radio radio3,
                       @Qualifier("radioJazz") Radio radio4) {
        this.radio1 = radio1;
        this.radio2 = radio2;
        this.radio3 = radio3;
        this.radio4 = radio4;
    }


    public void playRadio() {
        System.out.println(radio1.getCurrentSong());
        System.out.println(radio2.getCurrentSong());
        System.out.println(radio3.getCurrentSong());
        System.out.println(radio4.getCurrentSong());
    }
}
