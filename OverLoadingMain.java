
public class OverLoadingMain {
  public static void main(int a)
  {
	  System.out.println(a);
  }
  public static void main(float b)
  {
	  System.out.println(b);
  }
	public static void main(String[] args) {
		OverLoadingMain s=new OverLoadingMain();
		main(5);
		main(8.5f);
	}

}