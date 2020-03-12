package com.epam.collections;

import java.util.LinkedList;

public class Customlist {
	static LinkedList<String> customlist=new LinkedList<String>();
	public void toInsert(String e)
	{
		customlist.add(e);
		System.out.println("An Element Is Added In List\n");
	}
	public void toDelete(String e)
	{
	   if(customlist.contains(e))
	   {
		   customlist.remove(e);
		   System.out.println(e+" Is Deleted From The List\n");
		}
		else 
			System.out.println(e+" Is Not Found In The List To Delete\n");
	}
	public void toGetElementByIndex(int index)
	{
		if(index-1>=0&&index-1<customlist.size())
		{
			System.out.println("Element At Index "+index+" Is:"+customlist.get(index-1));
			System.out.println();
		}
		else 
			System.out.println("Index Out Of Range\n");
	}
	public void sizeOfList()
	{
		System.out.println(customlist.size()+"\n");
	}
	public void displayingElementsOfList()
	{
		for(String it:customlist)
			 System.out.println(it);
		 System.out.println();
	}
}