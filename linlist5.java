// to insert the specified element at the specified position

import java.util.LinkedList;

public class linlist5
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		
		games.add("Cricket");
		games.add("Hockey");
		games.add("Football");
		
		System.out.println("Before add : "+games);
		games.add(1,"Tennis");
		System.out.println("After add : "+games);
	}
}