public class Rules;

public void daRules()
{
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
}
