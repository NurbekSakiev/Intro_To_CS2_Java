import java.util.Scanner;
import java.io.File;
class Main
{
  public static void main(String[] args)
  {
	try
	{
		// Name of the input file is records.txt.
        // This file should be in the same directory with Main.java file.
		String fileName = "records.txt";
		File  inputFile = new File(fileName);
		Scanner fileReader  = new Scanner( inputFile ) ;
		while( fileReader.hasNext() )
		{
			System.out.println( fileReader.nextLine() );
		}
	}
	/* The statement 
	   catch (Exception exp) 
	   can catch any exception in Java because the class Exception
	   is at the top of Java exception inheritance hierarchy.
	   We know that a child class is said to have "is a relation"
	   to its parent class. Therefore, any type of exception class
	   in Java "is an" Exception.
	 */
	catch (Exception exp)
	{
		System.out.println("Exception:" + exp.getMessage());
	}
  }
}
