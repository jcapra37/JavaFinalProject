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
int players=1;
int play_loop=1;
System.out.println("Greetings! Welcome to our game of Clickety Clack.");
while(play_loop==1)
{
System.out.println("How many players do you have?\nAt least 2 players are needed and you may have up to 4 players.");
players=keyboard.nextInt();
if(players==2)
{
	players=2;
int player1; int player2;
	play_loop=2;
}
else if(players==3)
{
	players=3;
int player1; int player2; int player3;
play_loop=2;
}
else if(players==4)
{
	players=4;
int player1; int player2; int player3; int player4;
play_loop=2;
}
else{System.out.println("Error! Please enter a value between 2 and 4.");}
}
Rules theRules=new Rules();
theRules.daRules();
final int COL=players;
final int ROW=5;
int num;
int[][] dice_Storage = new int[ROW][COL];
//Player plays = new Player();
Dice_Clickety rollyPolly = new Dice_Clickety();
//plays.setName(player1);
rollyPolly.roll1();
System.out.println(rollyPolly.Dice_Roll());

}
catch(Exception e){System.out.println("An unexpected error has occured. Please restart the program.");}

}
}



