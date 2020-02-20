// to insert elements into the linkedlist at the first and last position

import java.util.LinkedList;

public class linlist6
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		
		games.add("Cricket");
		games.add("Hockey");
		games.add("Football");
		
		System.out.println("Before add : "+games);
		games.addFirst("Tennis");
		games.addLast("Badminton");
		System.out.println("After add : "+games);
	}
}