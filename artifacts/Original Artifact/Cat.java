public class Cat extends Pet
{
    private static int catSpaceNumber;

    public Cat()
    {
        catSpaceNumber = -1;
    }

    public Cat(int spaceNum)
    {
        catSpaceNumber = spaceNum;
    }

    public static int getCatSpaceNumber()
    {
        return catSpaceNumber;
    }

    public static void setCatSpaceNumber(int catSpace)
    {
        catSpaceNumber = catSpace;
    }
}