class Main
{
  public static void main(String[] arg)
  {
	try
	{
	  // there are 2 exceptions
	  System.out.println(Integer.parseInt("hakan")); // when the first exception is thrown, the program control transfers to the catch
	  int number = 1/0;
      System.out.println(number);
	 
	}
	catch(ArithmeticException exception)
	{
	  System.out.println("Arithmetic Problem:"+exception.getMessage());
	}
	catch(NumberFormatException exception)
	{
	  System.out.println("Number Format Problem:"+exception.getMessage());
	}	
	finally
	{
	  System.out.println("Done");
	}
  }
}