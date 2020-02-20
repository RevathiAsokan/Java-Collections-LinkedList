// To remove and return the first element of a linked list

import java.util.LinkedList;

class linlist19
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		games.add("Cricket");
		games.add("Hockey");
		
		System.out.println("Before pop: "+games);
		System.out.println("Removed element: "+games.pop());
		System.out.println("After pop: "+games);
	}
}