package edu.data_structures;
public class LinkedStringList {
	public static void main(String[] args) {
		LinkedStringList ls = new LinkedStringList();
		ls.addString("hello");
		ls.addString("hello");
		
		ls.contains("hello");
		
	}
	
	StringNode start, end;
	private int size = 0;
	
	public void addString(String s) {
		if(start == null) {
			start = new StringNode(s, null);
			end = start;
		}
		else {
			StringNode sn = new StringNode(s, null);
			end.setNext(sn);
			end = sn;	
		}
		size++;	
	}
	public int getSize() {
		return size;
	}
	public void contains(String el)
	{
		String curString = start.getPayload();
		
		while(start.getNext() != null)
		{
			curString = start.getPayload();
			if(curString.equals(el))
				System.out.println(el);
			
			start = start.getNext();
			
		}
		
	}
	
}
