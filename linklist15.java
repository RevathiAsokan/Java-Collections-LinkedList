// To swap two elements in an linked list

import java.util.LinkedList;
import java.util.Collections;

class linklist15
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		games.add("Cricket");
		games.add("Hockey");
		games.add("Football");
		games.add("Tennis");
		
		System.out.println("Before swap: "+games);
		Collections.swap(games,0,1);
		System.out.println("After swap: "+games);
	}
}