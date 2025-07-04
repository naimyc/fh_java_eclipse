package edu.data_structures;

public class StringNode {
	private String payload;
	private StringNode next;
		
		public StringNode(String payload, StringNode next) {
			super();
			this.payload = payload;
			this.next = next;
		}
		public String getPayload() {
			return payload;
		}
		public void setPayload(String payload) {
			this.payload = payload;
		}
		public StringNode getNext() {
			return next;
		}
		public void setNext(StringNode s) {
			this.next = s;
		}
}
