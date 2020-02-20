// To remove all elements from a linked list

import java.util.LinkedList;

public class linlist14
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		games.add("Cricket");
		games.add("Hockey");
		games.add("Football");
		games.add("Tennis");
		
		System.out.println("Before remove: "+games);
		games.clear();

		System.out.println("After remove: "+games);
	}
}