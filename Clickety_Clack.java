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
int play_loop=1;
System.out.println("Greetings! Welcome to our game of Clickety Clack.");
while(play_loop==1)
{
System.out.println("How many players do you have?\nAt least 2 players are needed and you may have up to 4 players.");
players=keyboard.nextInt();
if(players==2)
{
Player player1=new Player();
Player player2=new Player();
play_loop=2;
}
else if(players==3)
{
Player player1=new Player();
Player player2=new Player();
Player player3=new Player();
play_loop=2;
}
else if(players==4)
{
Player player1=new Player();
Player player2=new Player();
Player player3=new Player();
Player player4=new Player();
play_loop=2;
}
else{System.out.println("Error! Please enter a value between 2 and 4.");}
}
Rules theRules=new Rules();
theRules.daRules();
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
