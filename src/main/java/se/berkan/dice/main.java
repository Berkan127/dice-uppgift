package se.berkan.dice;
// Paketdeklaration: Grupperar klasser i ett paket för bättre organisering och undviker namnkonflikter.

import java.util.Scanner;
// Import: Gör det möjligt att använda Scanner-klassen för att läsa input från användaren.

class Main {  // Detta är huvudklassen där spelet körs

    public static void main(String[] args) {  // Huvudmetoden där programmet startar
        // Skapar ett Scanner-objekt för att ta emot input från spelarna
        Scanner scanner = new Scanner(System.in);

        // Frågar efter spelare 1:s namn och skapar ett Player-objekt för spelare 1
        System.out.println("What's Player 1's name?");
        Player player1 = new Player(scanner.nextLine());

        // Frågar efter spelare 2:s namn och skapar ett Player-objekt för spelare 2
        System.out.println("What's Player 2's name?");
        Player player2 = new Player(scanner.nextLine());

        // For-loop som kör spelet i 4 rundor,  Loopen körs så länge round är mindre än eller lika med 4. När round blir större än 4, slutar den.
        for (int round = 1; round <= 4; round++) {
         
            // Väntar på att spelaren ska trycka Enter för att starta nästa runda
            System.out.println("Press Enter to start round " + round + "...");
           
            scanner.nextLine();  // Läser Enter-trycket från spelaren

            // Visar aktuell runda
            System.out.println("Round " + round + ":");

            // Spelare 1:s tur - ett tärningskast och poäng registreras
            int val1 = player1.Playersturn();
            System.out.println(player1.name + " rolled a " + val1);

            // Spelare 2:s tur - ett tärningskast och poäng registreras
            int val2 = player2.Playersturn();
            System.out.println(player2.name + " rolled a " + val2);
        }

        // Efter 4 rundor, bestäms vinnaren genom att jämföra spelarnas poäng
      
        if (player1.points == player2.points) {
            // Om båda spelarna har lika många poäng blir det oavgjort
            System.out.println("It's a tie!");
        } else if (player1.points > player2.points) {
            // Om spelare 1 har fler poäng vinner spelare 1
            System.out.println(player1.name + " wins with " + player1.points + " points");
            System.out.println(player2.name + " loses with " + player2.points + " points");
        } else {
            // Om spelare 2 har fler poäng vinner spelare 2
            System.out.println(player2.name + " wins with " + player2.points + " points");
            System.out.println(player1.name + " loses with " + player1.points + " points");
        }

        // Stänger scanner-objektet för att frigöra resurser
        scanner.close();
    }
}
