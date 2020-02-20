// to insert some elements at the specified position into a linked list

import java.util.LinkedList;

public class linlist9
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		games.add("Cricket");
		games.add("Hockey");
		games.add("Football");
		
		LinkedList<String> newgames = new LinkedList<String>();
		newgames.add("Swimming");
		newgames.add("Tennis");
		
		System.out.println("Before add : "+games);	
		games.addAll(1,newgames);
		System.out.println("After add : "+games);	
	}
}