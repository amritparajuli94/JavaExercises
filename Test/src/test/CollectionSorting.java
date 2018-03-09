package test;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSorting {
	public static void main(String[] args) {
		// Create a list of strings
		ArrayList<String> list = new ArrayList<String>();
		list.add("Amrit");
		list.add("Charlie");
		list.add("Peter");
		list.add("Prab");
		list.add("Tom");

		Collections.sort(list);
		// Collections.sort(al, Collections.reverseOrder());

		System.out.println("List after the use of :\n" + list);
	}
}