class Main
{
  public static void main(String[] arg)
  {
	try
	{
	  int number = 1/0;
      System.out.println(number);
	}
	catch(ArithmeticException exception)
	{
	  System.out.println("Problem:"+exception.getMessage());
	}
	finally
	{
	  System.out.println("Done");
	}
  }
}