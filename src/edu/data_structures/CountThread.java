package edu.data_structures;
public class CountThread extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 11; i++) {
			System.out.println(Thread.currentThread().getName() + "-> " + i);
		}
		// TODO Auto-generated method stub
		super.run();
	}
	public static void main(String[] args) {
		CountThread ct1 = new CountThread();
		CountThread ct2 = new CountThread();
		
		ct1.start();		
		ct2.start();
	}

}
