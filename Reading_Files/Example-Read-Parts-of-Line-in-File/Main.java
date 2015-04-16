import java.util.Scanner;
import java.io.File;
class Main
{
  public static void main(String[] args)
  {
	try
	{
	    Scanner fileReader;
		// Name of the input file is records.txt.
        // This file should be in the same direct with Main.java file.
		String fileName = "records.txt";
		String line;
		File  inputFile = new File(fileName);
		fileReader      = new Scanner( inputFile ) ;
		while( fileReader.hasNext() )
		{
			line = fileReader.nextLine();
			/* Class Scanner object can be used as a simple text processor
			   which can parse primitive types and strings.
			   
			   A Scanner breaks its input into tokens using a delimiter pattern, 
			   which by default matches whitespace. The resulting tokens may 
			   then be converted into values of different types using the various
			   next methods (e.g., nextInt(), nextLong() ).
			*/
			Scanner tokens = new Scanner (line);
			tokens.useDelimiter(" "); // we are given that the delimiter in the file is space
			System.out.println ("First Record:");
			while (tokens.hasNext())
			{
				System.out.println (tokens.next());
			}
		}
	}
	catch (Exception exp)
	{
		System.out.println("Exception:" + exp.getMessage());
	}
  }
}
