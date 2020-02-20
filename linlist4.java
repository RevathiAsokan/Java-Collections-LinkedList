// to iterate a linked list in reverse order

import java.util.LinkedList;
import java.util.Iterator;


public class linlist4
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		
		games.add("Cricket");
		games.add("Hockey");
		games.add("Football");
		
		Iterator<String> i = games.descendingIterator();
		System.out.println("List of games: ");

		while(i.hasNext())
			System.out.println(i.next());
	}
}