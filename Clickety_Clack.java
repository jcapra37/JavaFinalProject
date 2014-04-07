//JavaFinalProject
//================
//
//Final Project for Java (Chelsea, Josh, Mark)

import java.util.Scanner;
import java.util.Random;

public class Clickety_Clack
{
public static void main(String[] main)
{
	try
																	{
	Scanner keyboard=new Scanner(System.in);
	int players;
	System.out.println("Greetings! Welcome to our game of Clickety Clack.");
	System.out.println("How many players do you have? [At least 2 players are needed.]");
	players=keyboard.nextInt();
	int ruleLoop=1;
	while(ruleLoop==1)
		{
	Scanner keys=new Scanner(System.in);
	String famRules;
	System.out.println("Are you familiar with the rules? [Y/N]");
	famRules=keys.nextLine();
	if(famRules.equalsIgnoreCase("y")) //playgame
	{
		System.out.println("Great! Then let's get started.");
		ruleLoop++;
	}
	else if(famRules.equalsIgnoreCase("n")) //explain rules
	{
		System.out.print("Not a problem, the rules are simple!\nThere are five dice in this game.\nThe object of the game is to roll a six first, then a five, and then a four.");
		System.out.println("\nAfterwards you aim to roll the highest number with the two remaining dice.\nThis number represents your score, which is compared to the other player(s).");
	}
	else //error
	{
		System.out.println("Error! please enter a correct response! [Y/N]");
	}
		}
	final int COL=players;
	final int ROW=5;
	int num;
	int[][] dice_Storage=new int[ROW][COL];
	Dice_Clickety rollyPolly= new Dice_Clickety();
	rollyPolly.roll1();
	System.out.println(rollyPolly.Dice_Roll());
																	}
																	catch(Exception e){System.out.println("An unexpected error has occured. Please restart the program.");}

}
}

