package introtocs.datastructures;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ListIterator;

public class Queues {

    public static void main(String[] args) {
	// Working with Queues, FIFO (First In First Out).
	Queue<String> persons = new LinkedList<String>();
	
	persons.add("person 1");
	persons.add("person 2");
	persons.add("person 3");
	persons.add("person 4");
	persons.add("person 5");
	
	persons.iterator();
	System.out.println(persons.remove());
	

    }

}
