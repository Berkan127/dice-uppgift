package se.berkan.dice;
// Paketdeklaration: Organiserar klassen Player i paketet se.berkan.dice

import java.util.Random;
// Importerar Random-klassen: Används för att generera slumpmässiga tal (tärningskast)

public class Player {
    // Klass Player: Representerar en spelare i spelet

    Random random = new Random();
    // Skapar ett Random-objekt: Används för att slumpa tärningskast

    String name;
    // Spelarens namn, lagras som en sträng

    int points;
    // Spelarens poäng, lagras som ett heltal

    Player(String name) {
        // Konstruktor: Sätter spelarens namn och startar poängen på 0
        this.name = name;
        this.points = 0;
    }

    int Playersturn() {
        // Metod för att hantera spelarens tur, där ett tärningskast görs
        int Dice = random.nextInt(6) + 1;
        // Slumpar ett tal mellan 1 och 6 (tärningskast)
        points += Dice;
        // Adderar tärningskastets värde till spelarens totala poäng
        return Dice;
        // Returnerar värdet på tärningskastet
    }

    void restpoints() {
        // Metod som återställer spelarens poäng till 0
        points = 0;
    }
}
