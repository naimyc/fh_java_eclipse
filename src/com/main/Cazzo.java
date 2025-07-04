package com.main;

/**
 * 
 */
public class Cazzo {
	private int n, m, k;
	private String s;
	
	/**
	 * @param n
	 * @param m
	 * @param k
	 * @param s
	 */
	public Cazzo(int n, int m, int k, String s) {
		this.n = n;
		this.m = m;
		this.k = k;
		this.s = s;
	}
	/**
	 * @param n
	 * @param m
	 * @param k
	 * @param s
	 */
	public Cazzo(Cazzo c){
		this.n = c.getN();
		this.m = c.getM();
		this.k = c.getK();
		this.s = c.getS();
	}
	public int getN() {
		return n;
	}
	public int getM() {
		return m;
	}
	public int getK() {
		return k;
	}
	public String getS() {
		return s;
	}
	public void setN(int n) {
		this.n = n;
	}
	public void setM(int m) {
		this.m = m;
	}
	public void setK(int k) {
		this.k = k;
	}
	public void setS(String s) {
		this.s = s;
	}
	
	
	
	
}
