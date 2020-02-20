// To retrieve but does not remove, the last element of a linked list

import java.util.LinkedList;

class linlist21
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		games.add("Cricket");
		games.add("Hockey");
		
		System.out.println("Before pop: "+games);
		System.out.println("Last element retrieved: "+games.peekLast());
	}
}