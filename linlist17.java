// To join two linked lists

import java.util.LinkedList;

class linlist17
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		games.add("Cricket");
		games.add("Hockey");
		
		LinkedList<String> newgames = new LinkedList<String>();
		newgames.add("Football");
		newgames.add("Tennis");
		
		LinkedList<String> allgames = new LinkedList<String>();
		allgames.addAll(games);
		allgames.addAll(newgames);
		System.out.println("All games: "+allgames);
	}
}