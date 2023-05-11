/**
 * Model of the demo Broadway shows data set
 * @author cody.henrichsen
 *
 */
public class Broadway
{

	private int startYear;
	private String showName;
	private String theatre;
	private String type;
	private int attendance;
	private int capacity;
	private int grossEarnings;
	private int performances;
	
	/**
	 * Creates a Broadway data point
	 * @param startYear Starting year
	 * @param showName Name of the show
	 * @param theatre Which theatre
	 * @param type What kind of show
	 * @param attendance How many people
	 * @param capacity The capacity
	 * @param grossEarnings Earnings
	 * @param performances Count of performances
	 */
	public Broadway(int startYear, String showName, String theatre, String type, int attendance, int capacity, int grossEarnings, int performances)
	{
		
		this.startYear = startYear;
		this.showName = showName;
		this.theatre = theatre;
		this.type = type;
		this.attendance = attendance;
		this.capacity = capacity;
		this.grossEarnings = grossEarnings;
		this.performances = performances;
	}

	/**
	 * @return the startYear
	 */
	public int getStartYear()
	{
		return startYear;
	}

	/**
	 * @return the showName
	 */
	public String getShowName()
	{
		return showName;
	}

	/**
	 * @return the theatre
	 */
	public String getTheatre()
	{
		return theatre;
	}

	/**
	 * @return the type
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * @return the attendance
	 */
	public int getAttendance()
	{
		return attendance;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity()
	{
		return capacity;
	}

	/**
	 * @return the grossEarnings
	 */
	public int getGrossEarnings()
	{
		return grossEarnings;
	}
	
	/**
	 * @return the performances
	 */
	public int getPerformances()
	{
		return performances;
	}


	public String toString()
	{
		String description = "These are the Broadway stats for: ";
		description += showName + ", in " + startYear + "\n";
		description += "At the: " + theatre + " theatre, with ";
		description += performances + " performances!\n";
		
		return description;
	}
}
