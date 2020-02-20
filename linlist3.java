// to iterate through all elements in a linked list at a specified position

import java.util.LinkedList;
import java.util.ListIterator;


public class linlist3
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		
		games.add("Cricket");
		games.add("Hockey");
		games.add("Football");
		
		ListIterator<String> i = games.listIterator(1);
		System.out.println("List of games: ");

		while(i.hasNext())
			System.out.println(i.next());
	}
}