package com.javaprogram.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {

	private static int startPosition=0;
  	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder");
		Random random=new Random();
                int dieResult=random.nextInt(6)+1;
		System.out.println("DieResult:"+dieResult);


}
}
