package DiceGame;

import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {

    Random random= new Random();
    
    int randomValue = random.nextInt(7);
    int randomValue2 = random.nextInt(7);

    System.out.println("What is your name?");

    Scanner scan = new Scanner(System.in);
    String userName = scan.nextLine();

    System.out.println("Hello,"+userName+"!");

    System.out.println("Rolling the dice...");

    System.out.println("Die 1: "+randomValue);
    System.out.println("Die 2: "+randomValue2);
    
    int totalRandomValue = randomValue + randomValue2;

    System.out.println("Total value: "+totalRandomValue);

    scan.close();

    }
}