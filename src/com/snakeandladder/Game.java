package com.snakeandladder;

import java.util.Random;

public class Game {
    public static void main(String[] args) {
        System.out.println("welcome to Snake & Ladder");
        int player1 = 0;
        System.out.println("initial position of player1 is " + player1);
        // use Random for dice roll
        Random dice = new Random();
        player1 = dice.nextInt(6)+1;
        System.out.println("play " + player1);
    }
}
