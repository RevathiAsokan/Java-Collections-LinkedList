// To check if a particular element exists in a linked list

import java.util.LinkedList;

class linlist22
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		games.add("Cricket");
		games.add("Hockey");
		games.add("Football");
		
		System.out.println("All games: "+games);
		
		if(games.contains("Hockey"))
			System.out.println("Game found");
		else
			System.out.println("Game not found");
	}
}