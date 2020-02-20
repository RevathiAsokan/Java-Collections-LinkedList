// To shuffle the elements in a linked list

import java.util.LinkedList;
import java.util.Collections;

class linlist16
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		games.add("Cricket");
		games.add("Hockey");
		games.add("Football");
		games.add("Tennis");
		
		System.out.println("Before shuffle: "+games);
		Collections.shuffle(games);
		System.out.println("After shuffle: "+games);
	}
}