package se.berkan.dice;

import java.util.Random;

public class Player {
    Random random = new Random();
    String name;
    int points;

    Player(String name) {
        this.name = name;
        this.points = 0;

    }
    int Playersturn(){
        int Dice = random.nextInt(6) + 1;
        points += Dice;
        return Dice;

    }
    void restpoints(){
        points = 0;
    }
}

