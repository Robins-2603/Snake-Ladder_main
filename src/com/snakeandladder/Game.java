package com.snakeandladder;

import java.util.Random;

public class Game {
    public static final int Win_point = 100;
    public static final int To_start = 1;

    public static void main(String[] args) {
        System.out.println("welcome to Snake & Ladder");
        int player1 = 0;
        // creating Array for ladder
        int[] ladder = {3,11,60,46,17};
        // creating Array for snake
        int[] snake = {99,70,52,25,95}
        System.out.println("initial position of player1 is " + player1);
        // use Random for dice roll
        Random dice = new Random();
        player1 = dice.nextInt(6)+1;
        System.out.println("play " + player1);
        //condition for no play, ladder and snake
        switch (player1){
            case To_start:
                System.out.println("Start your game play "+player1);
                break;
            default:
                System.out.println("oops! you need 1 to start your game"); //no play
        }
    }
}
