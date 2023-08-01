package com.gabguimaraes.learnspringframework.game2;

public interface Game {
    void play();
}

class ResidentEvil implements Game {

    @Override
    public void play() {
        System.out.println("Playing Resident Evil");
    }
}

class MarioBros implements Game {

    @Override
    public void play() {
        System.out.println("Playing Mario Bros");
    }
}

class NeedForSpeed implements Game {

    @Override
    public void play() {
        System.out.println("Playing Need for Speed");
    }
}