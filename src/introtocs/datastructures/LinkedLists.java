package introtocs.datastructures;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {

    public static void main(String[] args) {
	// Working with LinkedList
	// Create Scanner object to obtain input from prompt.
	Scanner input = new Scanner(System.in);
	LinkedList<String> names = new LinkedList<String>();

	System.out.print("Enter name or Z to quit: ");
	String name = input.nextLine();
	
	int counter = 0;
	while (!name.equalsIgnoreCase("z")) {
	    names.add(name);
	    counter += 1;

	    System.out.print("Enter name or Z to quit: ");
	    name = input.nextLine();
	}
	
	ListIterator<String> iter = names.listIterator();
	
	if (counter == 0) {
	    System.out.println("No names entered.");
	} else {
	    for (String user: names) {
		System.out.println(user);
	    }
	}
    }
}
