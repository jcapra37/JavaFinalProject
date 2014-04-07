import java.util.Random;
public class Dice_Clickety
{
    Random rand = new Random();
    int rollValue;
    int[]nums=new int[5];
    int nll=0;
    public int Dice_Roll()
    {
		for(int i=0;i<5;i++)
		{
			if(nums[i]==6)
			{
				System.out.print("You've rolled a ");
				return nums[i];
			}
		}
	  System.out.println("You failed to roll a 6.");
	  return nll;
    }
    public int[] roll1()
    {
		nums[0]=rand.nextInt(6)+1;
		nums[1]=rand.nextInt(6)+1;
		nums[2]=rand.nextInt(6)+1;
		nums[3]=rand.nextInt(6)+1;
		nums[4]=rand.nextInt(6)+1;
		return (nums);
	}
    public int getRoll()
    {
		return rollValue;
	}
}
