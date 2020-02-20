// To remove first and last element in a linked list

import java.util.LinkedList;

public class linlist13
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		games.add("Cricket");
		games.add("Hockey");
		games.add("Football");
		games.add("Tennis");
		
		System.out.println("Before remove: "+games);
		games.removeFirst();
		games.removeLast();
		
		System.out.println("After remove: "+games);
	}
}