package com.javaprogram.snakeandladder;

import java.util.Random;


public class SnakeLadder {

	private static int currentPosition=0;
	static int counter=0;
  	static int previousPosition=0;


	private static int currentPosition2=0;
	static int counter2=0;
    	static int previousPosition2=0;


  	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder");
		SnakeLadder player1=new SnakeLadder();
		SnakeLadder player2=new SnakeLadder();
		Random random=new Random();
	    	int dieResultOfPlayer1=random.nextInt(6)+1;
	    	int dieResultOfPlayer2=random.nextInt(6)+1;

	    	int checkForAOptionForPlayer1=random.nextInt(3)+1;
	    	int checkForAOptionForPlayer2=random.nextInt(3)+1;

		while (currentPosition != 100 && currentPosition2 != 100)
		{
				switch(checkForAOptionForPlayer1)
               			{
                		case 1:		System.out.println("The player1 choose no play so current position "+currentPosition);
                					break;

                        	case 2:		System.out.println("The player2 1 got ladder so  current position "+currentPosition);
                        			player1.ladder(dieResultOfPlayer1);
                        			player1.ladder(random.nextInt(6)+1);
                        			break;
                        	default:	System.out.println("Player 1 got snake so current position "+currentPosition);
						player1.snake(dieResultOfPlayer1);

				}
                switch(checkForAOptionForPlayer2)
                {
                        case 1:  	System.out.println("The player2 choose no play so current position "+currentPosition2);
                                	break;

                        case 2:		System.out.println("The player2 got ladder so current position "+currentPosition2);
                                    	player2.ladderPlayer2(dieResultOfPlayer2);
                                    	player2.ladderPlayer2(random.nextInt(6)+1);
                                    	break;

                        default:	System.out.println("The player2 got snake so current position "+currentPosition2);
                                	player2.snakePlayer2(dieResultOfPlayer2);
                }

               if(counter == 100)
               {
             	   System.out.println("Player1 is the winner");
             	   return ;
               }

               if(counter2 == 100)
               {
            	   System.out.println("Player2 is the winner");
            	   return ;
               }

	}
  	}


private void ladder(int dieResult) {
		// TODO Auto-generated method stub
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
        	 System.out.println("ladderMethod after - currentPosition:"+currentPosition+"Count is:"+counter);
                 System.out.println("*** ladder Completed Player1 is winner *****");
                 return;

         }
         System.out.println("ladderMethod after - currentPosition:"+currentPosition+"Count is:"+counter);

	}

	private void snake(int dieResult) {
		// TODO Auto-generated method stub
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

	private void ladderPlayer2(int dieResultOfPlayer2) {
		// TODO Auto-generated method stub

	System.out.println("laddderMethod before - currentPosition:"+currentPosition2);
        previousPosition2=currentPosition2;
        System.out.println("Previous"+previousPosition2);
        currentPosition2 = currentPosition2 + dieResultOfPlayer2;

        if(currentPosition2 != previousPosition2)
        {
        	counter2++;
        }
        if (currentPosition2 > 100)
        {
                currentPosition2 = currentPosition2 - dieResultOfPlayer2;
        }
        if(currentPosition2 == 100)
        {
        	System.out.println("ladderMethod after - currentPosition:"+currentPosition2+"Count is:"+counter2);
        	System.out.println("*** ladder Completed Player 2 is winner *****");
        	return ;
        }
        System.out.println("ladderMethod after - currentPosition:"+currentPosition2+"Count is:"+counter2);

	}

	private void snakePlayer2(int dieResultOfPlayer2) {
		// TODO Auto-generated method stub

	System.out.println("SnakeMethod - currentPosition:"+currentPosition2);
        previousPosition2=currentPosition2;
         System.out.println("Previous"+previousPosition2);
         currentPosition2 = currentPosition2 + dieResultOfPlayer2;
         if(currentPosition2 != previousPosition2)
         {
         	counter2++;
         }
        currentPosition2 = currentPosition2 - dieResultOfPlayer2;
         if(currentPosition2 <= 0)
         {
                 currentPosition2=0;
         }
	System.out.println("snakeMethod:Current Position is "+currentPosition2+"Count is:"+counter2);

	}
}
