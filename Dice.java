package DiceGame;

import java.util.Random;

public class Dice {
    public static void main(String args) {

    Random random= new Random();
    
    int randomValue = random.nextInt(7);
    int randomValue2 = random.nextInt(7);

    System.out.println("Rolling the dice...\n");

    System.out.println("Die 1: "+randomValue+"\n");
    System.out.println("Die 2:"+randomValue2+"\n");

    }
}