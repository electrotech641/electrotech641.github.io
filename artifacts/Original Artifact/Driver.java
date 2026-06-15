import java.util.Scanner;


public class Driver
{

    public static void main(String[] args)
    {
        Pet newPet;
        String petName, answer;
        int petAge, daysStay, dogSpaces, catSpaces;
        int petWeight = -1;
        Boolean returningPet = false;
        Boolean isDog = false;
        Boolean isGrooming = false;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter your pet's name: ");
        petName = scnr.nextLine();

        System.out.println("Is " + petName + " a dog or a cat? Enter dog or cat: ");
        answer = scnr.nextLine();

        while (!answer.equals("dog") && !answer.equals("cat"))
        {
            System.out.println("Please enter dog or cat\n\nIs " + petName + " a dog or a cat? Enter dog or cat: ");
            answer = scnr.nextLine();
        }

        if(answer.equals("dog"))
        {
            isDog = true;

            System.out.println("Enter your pet's weight using only whole numbers: ");

            //INTEGER validation
            while(!scnr.hasNextInt())
            {
                System.out.println("Please enter a whole number: ");
                scnr.next();
            }
            petAge = scnr.nextInt();
            System.out.println("You entered " + petAge);

            System.out.println("Would you like us to groom " + petName + "? Enter yes or no: ");
            answer = scnr.next();

            while(!answer.equals("yes") && !answer.equals("no"))
            {
                System.out.println("Please enter 'yes' or 'no'.\n\nWould you like us to groom " + petName + "? Enter yes or no: ");
                answer = scnr.next();
            }

            if(answer.equals("yes"))
            {
                isGrooming = true;
            }
            else
                isGrooming = false;
        }
        else
            isDog = false;


        System.out.println("Has " + petName + " stayed with us before? Enter yes or no: ");
        answer = scnr.next();

        while (!answer.equals("yes") && !answer.equals("no"))
        {
            System.out.println("Please enter yes or no\n\nHas " + petName + " stayed with us before? Enter yes or no: ");
            answer = scnr.next();
        }

        if(answer.equals("yes"))
        {
            //get node and update information
        }
        else
        {
            System.out.println("Enter your pet's age: ");
            while(!scnr.hasNextInt())
            {
                System.out.println("Please enter a whole number: ");
                scnr.next();
            }
            petAge = scnr.nextInt();
            System.out.println("You entered " + petAge);
            System.out.println("How many days will " + petName + " be staying with us? ");
            daysStay = scnr.nextInt();

            //GET WHICH DOG SPACES ARE AVAILABLE

            if (isDog)
            {
                newPet = new Dog(petName, petAge, daysStay, 1, petWeight, isGrooming);
            }
            else
                newPet = new Cat(1);

        }

    }
}
