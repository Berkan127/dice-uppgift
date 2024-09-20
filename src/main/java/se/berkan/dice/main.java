package se.berkan.dice;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class main {

    public static void main(String[] args) {
        Timer timer = new Timer();
        Scanner scanner = new Scanner(System.in);



        System.out.println("What's Player 1's name?");
        Player player1 = new Player(scanner.nextLine());

        System.out.println("What's Player 2's name?");
        Player player2 = new Player(scanner.nextLine());

        TimerTask gameTask = new TimerTask() {
            int round = 1;

            public void run() {


                System.out.println("Round" + round + ":");

                int val1 = player1.Playersturn();
                System.out.println(player1.name + " rolled a " + val1);
                int val2 = player2.Playersturn();
                System.out.println(player2.name + " rolled a " + val2);

                if (round == 4) {
                    if(player1.points == player2.points) {
                        System.out.println("It's a tie!");
                    } else if (player1.points > player2.points) {
                        System.out.println(player1.name + " wins with " + player1.points + " points");
                        System.out.println(player2.name + " loses with " + player2.points + " points");

                    }else {
                        System.out.println(player2.name + " wins with " + player2.points + " points");
                        System.out.println(player1.name + " loses with " + player1.points + " points");
                    }

                    System.exit(0);
                }

                round++;


            }
        };

        timer.scheduleAtFixedRate(gameTask, 0, 10000);

    }
}