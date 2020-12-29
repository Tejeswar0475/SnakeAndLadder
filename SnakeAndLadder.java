package com.javaprogram.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {

	private static int startPosition=0;
	private static int currentPosition;

  	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder");
		Random random=new Random();
                int dieResult=random.nextInt(6)+1;
		int checkForAOption=random.nextInt(3)+1;
		switch(checkForAOption)
                {
                	case 1:  System.out.println("The player choose no play so current position "+currentPosition);
                                 break;
                        case 2:  ladder(dieResult);
                                 break;
                        default: snake(dieResult);
                }

	}

	private static void ladder(int dieResult) {
                System.out.println("laddderMethod before - currentPosition:"+currentPosition);
                currentPosition = currentPosition + dieResult;
        	System.out.println("ladderMethod after - currentPosition:"+currentPosition);
	}

        private static void snake(int dieResult) {
                System.out.println("SnakeMethod - currentPosition:"+currentPosition);
                currentPosition = currentPosition - dieResult;
		System.out.println("SnakeMethod after-currentPosition:"+currentPosition);
        }
}
