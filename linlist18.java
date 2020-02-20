// To clone an linked list to another 

import java.util.LinkedList;

class linlist18
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		games.add("Cricket");
		games.add("Hockey");
		
		LinkedList<String> allgames = (LinkedList)games.clone();
		System.out.println("All games: "+allgames);
	}
}