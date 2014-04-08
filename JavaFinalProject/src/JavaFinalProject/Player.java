package JavaFinalProject;
import java.util.Scanner;
public class Player {
	Boolean look_6=false;
	Boolean look_5=false;
	Boolean look_4=false;
	int[] playerdie=new int[4];
	private int playernumber;
	int score;
	int rolls;
	int rerolls;
	void setName( int order_number )
	{
		playernumber = order_number;
	}
	int getscore()
	{
		System.out.println( "You have "+score+" points");
	}
	
	if(look_6=true)
	{
		playerdie[0]=6;
	
		if(look_5=true)
		{
			playerdie[1]=5;
			if(look_4=true)
			{
				playerdie[2]=4;
				score = playerdie[3]+playerdie[4];
				System.out.println( "You have "+score+" points");
				if(rolls<3)
				{
					rerolls=3-rolls;
					System.out.println("You have "+rerolls+" left");
					System.out.println("Would you like to reroll?");
					System.out.println("y/n");
					Scanner keys=new Scanner(System.in);
					String reroll;
					reroll=keys.nextLine();
					if(reroll.equalsIgnoreCase("y")) //play game
					{
//						reroll playerdie[3]+playerdie[4];
					}
					else if(reroll.equalsIgnoreCase("n")) //explain rules
					{
						System.out.print("Your score for this round is set.");
					}
					else //error
					{
						System.out.println("Error! please enter a correct response! [Y/N]");
					}
				}
					
			}
			
		}
	}
	}

}
