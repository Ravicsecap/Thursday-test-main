





public class OverLoadingMain 
{
  public static void main(int a)
  {
	  System.out.println(a);
  }
}
class game extends OverLoadingMain
{
	public static void main(int a) 
	{
		 System.out.println("Overmainclass:-"+a);
	}


  
	public static void main(String[] args) 
	{
		game str=new game();
		main(5);
	}

}

