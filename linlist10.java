// to get the first and last element in a linked list

import java.util.LinkedList;

public class linlist10
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		games.add("Cricket");
		games.add("Hockey");
		games.add("Football");
		games.add("Hockey");
		games.add("Tennis");
		
		System.out.println("List of games : "+games);
		System.out.println("First element : "+games.getFirst());
		System.out.println("Last element : "+games.getLast());
	}
}