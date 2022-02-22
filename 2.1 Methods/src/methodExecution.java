public class methodExecution {
	public int multipynumbers(int x,int y) 
	{
		int z=x*y;
		return z;
	}
public static void main(String[] args)
{
	methodExecution b=new methodExecution();
	int ans= b.multipynumbers(8,3);
	System.out.println("Multipilcation is :"+ans);
}
}