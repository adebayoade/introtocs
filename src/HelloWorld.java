import java.util.*;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		String[] teams = {"Arsenal", "Chelsea", "Watford", "Leceister", "Everton"};
		List<String> teamsList = new ArrayList<String>();
		List<String> teamsList2 = new ArrayList<String>();
		
		for (String x : teams) {
			teamsList.add(x);
		}
		
		teamsList2.add("Chelsea");
		teamsList2.add("Bacelona");
		teamsList2.add("Real Madrid");
		teamsList2.add("Athletico Madrid");
		teamsList2.add("Arsenal");
		
		System.out.printf("List1 items: %s%n", teamsList.toString());
		System.out.printf("List2 items: %s%n", teamsList2.toString());
		
		System.out.println();
		//mergeList(teamsList, teamsList2);
		teamsList.addAll(teamsList2);
		
		System.out.printf("List1 items: %s%n", teamsList.toString());
		System.out.printf("List2 items: %s%n", teamsList2.toString());
	
	}
	
	public static void mergeList(List<String> li, List<String> l2) {
		ListIterator<String> iter = li.listIterator();
		
		while (iter.hasNext()) {
			if (l2.contains(iter.next())) {
				iter.remove();
			}
		}
		
		li.addAll(l2);
	}
}