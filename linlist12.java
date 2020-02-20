// To remove a specified element from a linked list.

import java.util.LinkedList;

public class linlist12
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		games.add("Cricket");
		games.add("Hockey");
		games.add("Football");
		games.add("Hockey");
		games.add("Tennis");
		
		System.out.println("Before remove: "+games);
		games.remove(1);
		System.out.println("After remove: "+games);
	}
}