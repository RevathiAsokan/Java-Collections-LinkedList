// To test an linked list is empty or not

import java.util.LinkedList;


class linlist25
{
	public static void main(String args[])
	{
		LinkedList<String> games1 = new LinkedList<String>();
		games1.add("Cricket");
		games1.add("Hockey");
		games1.add("Football");
		
		LinkedList<String> games2 = new LinkedList<String>();
		System.out.println("Is games1 empty : "+games1.isEmpty());
		System.out.println("Is games2 empty : "+games2.isEmpty());
	}
}