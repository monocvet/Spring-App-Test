package ru.maxima;

interface Radio {
    String getCurrentSong();
}


class RadioMaximum implements Radio {
    private String song1;
    private String song2;
    private String song3;

    public RadioMaximum(String song1, String song3, String song2) {
        this.song1 = song1;
        this.song3 = song3;
        this.song2 = song2;
    }

    @Override
    public String getCurrentSong() {
        return song1 + " , " + song2 + " , " + song3;
    }
}

class RadioEnergy implements Radio {
    private String song1;
    private String song2;
    private String song3;

    public RadioEnergy(String song1, String song3, String song2) {
        this.song1 = song1;
        this.song3 = song3;
        this.song2 = song2;
    }

    @Override
    public String getCurrentSong() {
        return song1 + " , " + song2 + " , " + song3;
    }
}

class RadioEuropaPlus implements Radio {
    private String song1;
    private String song2;
    private String song3;

    public RadioEuropaPlus(String song1, String song3, String song2) {
        this.song1 = song1;
        this.song3 = song3;
        this.song2 = song2;
    }

    @Override
    public String getCurrentSong() {
        return song1 + " , " + song2 + " , " + song3;
    }
}

public class RadioPlayer {
    private Radio radio;

    public RadioPlayer(Radio radio) {
        this.radio = radio;
    }

    public void playRadio() {
        System.out.println(radio.getCurrentSong());
    }
}
