
public class Dog extends Pet
{
	private static int dogSpaceNumber;
	private static double dogWeight;
	private static boolean grooming;

	
	//default constructor
	public Dog()
	{
		dogSpaceNumber = -1;
		dogWeight = 0.0;
		grooming = false;
	}
	
	//overload constructor for Dog()
	public Dog(String petName, int petAge, int daysStay, int spaceNum, double weight, boolean isGrooming)
	{
		super("dog", petName, petAge, daysStay);

		dogSpaceNumber = spaceNum;	//sets dog space to provided space
		dogWeight = weight;	//sets dog weight to specified weight
		grooming = isGrooming;	//set grooming flag
	}
	
	//gets dog space number
	public static int getDogSpaceNumber()
	{
		return dogSpaceNumber;	//returns int dog space number 
	}
	
	//sets dog space number
	public static void setDogSpaceNumber(int dogSpace)
	{
		dogSpaceNumber = dogSpace;	//sets dogSpaceNumber field to dogSpace parameter
	}
	
	//gets dogs weight
	public static double getDogWeight()
	{
		return dogWeight;	//returns a double of the dogs weight
	}
	
	//sets the dogs weight
	public static void setDogWeight(double weight)
	{
		dogWeight = weight;	//sets dogWeight field to the weight parameter
	}
	
	//returns true or false if the dog is grooming or not
	public static boolean getGrooming()
	{
		return grooming;	//returns boolean grooming
	}
	
	//sets the grooming flag to true or false
	public static void setGrooming(boolean isGrooming)
	{
		grooming = isGrooming;	//sets grooming field to isGrooming parameter
	}
	
	
}
