// To replace an element in a linked list

import java.util.LinkedList;


class linlist26
{
	public static void main(String args[])
	{
		LinkedList<String> games1 = new LinkedList<String>();
		games1.add("Cricket");
		games1.add("Hockey");
		games1.add("Football");
		
		games1.set(2,"Tennis");
		System.out.println("List of games: "+games1);
	}
}