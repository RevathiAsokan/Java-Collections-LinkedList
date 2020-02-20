// to display elements and their positions

import java.util.LinkedList;

public class linlist11
{
	public static void main(String args[])
	{
		LinkedList<String> games = new LinkedList<String>();
		games.add("Cricket");
		games.add("Hockey");
		games.add("Football");
		games.add("Hockey");
		games.add("Tennis");
		
		for(int i=0;i<games.size();i++)
			System.out.println("Game "+i+": "+games.get(i));
	}
}