package introtocs.practise;

import java.util.Scanner;

public class SayHello
{
    public static void main(String[] args)
    {

	Scanner input = new Scanner(System.in);

	String name = getUserInput("Enter your name: ", input);
	int age = getIntInput("How old are you? ", input);
	String religion = getUserInput("What's your religion", input);

	if (age >= 18)
	{
	    if (age > 50)
	    {
		System.out.println("You are a senior citizen!");
	    } else
	    {
		System.out.println("You are a minor adult.");
	    }
	} else
	{
	    System.out.println("You are a young citizen.");
	}

    }

    public static String SayHi()
    {
	return "Hi";
    }

    public static void countDown(int n)
    {

	if (n == 0)
	{
	    System.out.println("Blastoff!");
	} else
	{
	    System.out.println(n);
	    countDown(n - 1);
	}
    }

    public static void countUp(int n)
    {

	if (n == 0)
	{
	    System.out.println("Blastoff!");
	} else
	{
	    countUp(n - 1);
	    System.out.println(n);
	}
    }

    public static String makeRightMovement(int steps)
    {
	int counter = 0;
	String moveRight = "";
	while (counter < steps)
	{
	    moveRight = moveRight + ">";
	    counter++;
	}
	return moveRight;
    }

    public static String getUserInput(String promptMessage, Scanner input)
    {
	while (true)
	{
	    try
	    {
		System.out.print(promptMessage);
		String getInput = input.nextLine();
		return getInput.trim();
	    } catch (Exception e)
	    {
		System.out.print(promptMessage);
	    }
	}
    }
    
    public static int getIntInput(String promptMessage, Scanner input)
    {
	while (true)
	{
	    try
	    {
		System.out.print(promptMessage);
		String getInput = input.nextLine();
		return Integer.parseInt(getInput);
	    } catch (Exception e)
	    {
		System.out.println("**Invalid entry.");
	    }
	}
    }
}
