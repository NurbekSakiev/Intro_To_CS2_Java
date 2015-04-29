import java.util.*;
import java.io.*;
class Token
{
  public static void main(String[] args)
  {
	try
	{
		// Name of the input file is records.txt.
        File file = new File("records.txt");// This file should be in the same direct with Main.java file.
		Scanner fileReader = new Scanner(file);
		int largest = fileReader.nextInt();
		int number;
		while(fileReader.hasNext()) {
                number = fileReader.nextInt();
 
                if(number > largest) {
                    largest = number;
                }
 
                System.out.println(number);
            }
 
            fileReader.close();
 
            System.out.println("The biggest number in the file is: " + largest);
		
	}
	catch (Exception exp)
	{
		System.out.println("Exception:" + exp.getMessage());
	}
  }
}
