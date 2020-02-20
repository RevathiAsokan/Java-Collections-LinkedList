// to iterate through all elements in a linked list

import java.util.LinkedList;

public class linlist2
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		
		games.add("Cricket");
		games.add("Hockey");
		games.add("Football");
		
		System.out.println("List of games: ");

		for(String ele : games)
			System.out.println(ele);
	}
}