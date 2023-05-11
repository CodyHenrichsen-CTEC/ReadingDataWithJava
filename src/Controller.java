import java.util.ArrayList;

/**
 * The analysis and interaction class
 * @author cody.henrichsen
 *
 */
public class Controller
{

	/**
	 * Demonstrates loading a dataset from a CSV file and displaying some contents.
	 */
	public void demoDataLoad()
	{
		ArrayList<Broadway> demoData = DataReader.readData("Broadway Demo.csv");
		
		System.out.println("There are " + demoData.size() + " entries in the file!");
		
		for (int index = 0; index < 5; index++)
		{
			int randomIndex = (int) (Math.random() * demoData.size());
			
			Broadway current = demoData.get(randomIndex);
			System.out.println("Row: " + randomIndex + "\n" + current.toString());
		}
	}
}
