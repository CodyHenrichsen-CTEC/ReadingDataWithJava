

import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class designed for reading CSV files in Java.
 * @author cody.henrichsen
 *
 */
public class DataReader
{

	/**
	 * Creates an ArrayList<Broadway> from the CSV file specified.
	 * @param filename The CSV file
	 * @return An ArrayList<Broadway> based on the contents of the file.
	 */
	public static ArrayList<Broadway> readData(String filename)
	{
		ArrayList<Broadway> dataList = new ArrayList<Broadway>();
		
		File dataFile = new File(filename);
		
		try(Scanner fileScanner = new Scanner(dataFile))
		{
			ArrayList<String> lines = new ArrayList<String>();
			
			while (fileScanner.hasNextLine())
			{
				lines.add(fileScanner.nextLine());
			}
			
			for (int index = 1; index < lines.size(); index++)
			{
				String line = lines.get(index);
				
				String [] data = line.split(",");

				int year = Integer.parseInt(data[0]);
				String title = data[1];
				String theatre = data[2];
				String type = data[3];
				int attendance = Integer.parseInt(data[4]);
				int capacity = Integer.parseInt(data[5]);
				int earnings = Integer.parseInt(data[6]);
				int performances = Integer.parseInt(data[7]);
				
				Broadway model = new Broadway(year, title, theatre, type, attendance, capacity, earnings, performances);
				
				dataList.add(model);
			}
			
		}
		catch(FileNotFoundException error)
		{
			handleError(error);
		}
		
		return dataList;
	}
	
	/**
	 * Basic error handling method
	 * @param error The error sent in a catch block
	 */
	public static void handleError(Exception error)
	{
		System.out.println("The following error was caught:");
		System.out.println(error.getMessage());
	}
}
