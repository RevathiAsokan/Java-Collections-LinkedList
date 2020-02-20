// To compare two linked list

import java.util.LinkedList;


class linlist24
{
	public static void main(String args[])
	{
		LinkedList<String> games1 = new LinkedList<String>();
		games1.add("Cricket");
		games1.add("Hockey");
		games1.add("Football");
		
		LinkedList<String> games2 = new LinkedList<String>();
		games2.add("Tennis");
		games2.add("Hockey");
		games2.add("Throwball");
		
		LinkedList<String> res = new LinkedList<String>();
		
		for(String ele : games1)
			res.add(games2.contains(ele)? "Yes" : "No");
		
		System.out.println("Comparison result : "+res);
	}
}