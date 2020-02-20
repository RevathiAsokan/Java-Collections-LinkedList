// To convert a linked list to array list

import java.util.LinkedList;
import java.util.ArrayList;

class linlist23
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		games.add("Cricket");
		games.add("Hockey");
		games.add("Football");
		
		ArrayList<String> agames = new ArrayList<String>(games);
		System.out.println("List of games: "+agames);
	}
}