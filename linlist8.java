// to insert the specified element at the end of a linked list

import java.util.LinkedList;

public class linlist8
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		
		games.add("Cricket");
		games.add("Hockey");
		games.add("Football");
		
		System.out.println("Before add : "+games);	// during failure
		games.offerLast("Tennis");					// add() throws an exception
		System.out.println("After add : "+games);	// offer() returns false
	}
}