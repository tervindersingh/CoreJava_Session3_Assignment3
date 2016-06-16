public class RandomNumber
{
public static void main(String args[])
{
	RandomNumber RN=new RandomNumber(10);
	for (int i=0;i<25;i++)
	{
		System.out.println(RN.nextInt());
	}
}
private int max;
private int last;
public RandomNumber(int n)
{
	max=n;
	last=(int)(System.currentTimeMillis()%max);
}
public int nextInt()
{
	last=(last*32719+3)% 32768;
	return last%max;
}		
}