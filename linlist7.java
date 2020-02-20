// to insert the specified element at the front of a linked

import java.util.LinkedList;

public class linlist7
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		
		games.add("Cricket");
		games.add("Hockey");
		games.add("Football");
		
		System.out.println("Before add : "+games);	// during failure
		games.offerFirst("Tennis");					// add() throws an exception
		System.out.println("After add : "+games);	// offer() returns false
	}
}