package com.programmierenJava02.uebung7.a2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
	
	
	
	public static void main(String[] args) {
		Queue<Integer> randints = new LinkedList<Integer>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			randints.offer(random.nextInt(51));
		}
		Integer i;
		while((i = randints.poll()) != null)
			System.out.println(i);
		
		
		System.out.println("\n\n");
		
		
		for (Integer integer : randints) {
			System.out.println(integer);
		}
	}

}
