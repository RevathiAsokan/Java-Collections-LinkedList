// To retrieve but does not remove, the first element of a linked list

import java.util.LinkedList;

class linlist20
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		games.add("Cricket");
		games.add("Hockey");
		
		System.out.println("Before pop: "+games);
		System.out.println("First element retrieved: "+games.peekFirst());
	}
}