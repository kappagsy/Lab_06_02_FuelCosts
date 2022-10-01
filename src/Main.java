import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int gasAmount = 0;
        int fuelEfficiency = 0;
        double gasPrice = 0;
        double hundredMilesPrice = 0;
        int howFar = 0;
        String trash = "";

        System.out.print("How many gallons of gas do you currently have in your vehicle? ");
        if (in.hasNextInt())
        {
         gasAmount = in.nextInt();
         in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is invalid input. Please try again.");
        }

        System.out.print("What is the fuel efficiency of your vehicle (in miles per gallon)? ");
        if (in.hasNextInt())
        {
            fuelEfficiency = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is invalid input. Please try again.");
        }

        System.out.print("What is the gas price per gallon? ");
        if (in.hasNextDouble())
        {
            gasPrice = in.nextDouble();
            in.nextLine();
            hundredMilesPrice = gasPrice * 100;
            howFar = fuelEfficiency * gasAmount;
            System.out.println("Based on the gas price you provided, the cost per 100 miles will be: " + hundredMilesPrice);
            System.out.println("With the amount of gas you have in your vehicle, " + gasAmount + " gallons, you can still drive " + howFar + " more miles." );
        }
        else
        {
            System.out.println("You have entered invalid input. Please try again.");
        }
    }
}