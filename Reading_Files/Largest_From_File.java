import java.util.*;
import java.io.*;
class Largest_From_File
{
  public static void main(String[] args)
  {
	try
	{
        File file = new File("records.txt");
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
