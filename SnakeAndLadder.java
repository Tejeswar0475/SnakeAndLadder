package com.javaprogram.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {

	private static int startPosition=0;
	private static int currentPosition;
	static int counter;
        static int previousPosition=0;

  	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder");
		while (currentPosition != 100 )
		{
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
	}

	private static void ladder(int dieResult) {
                System.out.println("laddderMethod before - currentPosition:"+currentPosition);
		previousPosition=currentPosition;
                System.out.println("Previous"+previousPosition);
                currentPosition = currentPosition + dieResult;

		if(currentPosition != previousPosition)
                {
                	counter++;
                }
		if (currentPosition > 100)
                {
                        currentPosition = currentPosition - dieResult;
                }
                if(currentPosition == 100)
                {
                        System.out.println("*** ladder Completed *****");
                }
        	System.out.println("ladderMethod after - currentPosition:"+currentPosition+"Count is:"+counter);
	}

        private static void snake(int dieResult) {
                System.out.println("SnakeMethod - currentPosition:"+currentPosition);
                previousPosition=currentPosition;
                System.out.println("Previous"+previousPosition);
                currentPosition = currentPosition + dieResult;
                if(currentPosition != previousPosition)
                {
                	counter++;
                }
		currentPosition = currentPosition - dieResult;
		if(currentPosition <= 0)
                {
                        currentPosition=0;
                }
		System.out.println("snakeMethod:Current Position is "+currentPosition+"Count is:"+counter);
	}
}
