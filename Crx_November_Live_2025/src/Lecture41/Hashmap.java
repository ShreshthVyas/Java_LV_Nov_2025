package Lecture41;

import java.util.ArrayList;

public class Hashmap <K,V>{
	private double thf = 2.0;
	private ArrayList<Node> bckt;
	public class Node{
		K key;
		V val;
		Node next;
	}
	private int size =0;
	public Hashmap() {
		this.bckt = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			bckt.add(null);
		}
	}
	
	public void put(K k, V v) {
		int idx= getIdx(k);//bckt idx
		Node curr = this.bckt.get(idx);// head present on that index
		// Find k 
		// Case 1: if key already present
		while(curr!=null) {
			if(curr.key.equals(k)) {// key already present
				curr.val = v;// replace the value
				return;
			}
			curr = curr.next;
		}
		// Case 2: key not present
		Node nn =  new Node();
		nn.key = k;
		nn.val = v;
		nn.next = this.bckt.get(idx);// head
		this.bckt.set(idx, nn);
		this.size++;
		double lf = this.size / this.bckt.size();
		if(lf> thf) {
			rehashing();
		}
	}
	
	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> newbckt = new ArrayList<>();
		for (int i = 0; i < 2* this.bckt.size(); i++) {
			newbckt.add(null);
		}
		ArrayList<Node> temp = this.bckt;
		this.bckt = newbckt;
		
		for (Node node : temp) {
			while(node!=null) {
				put(node.key, node.val);
				node =node.next;
			}
		}
		
	}

	public void remove(K k) {
		int idx= getIdx(k);//bckt idx
		Node curr = this.bckt.get(idx);
		Node prev = null;
		// check if key present
		while(curr!=null) {
			if(curr.key.equals(k)) {// key already present
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if(curr == null) {// key not found || empty
			return;
		}
		else if(prev == null) {// key found to be the head
			this.bckt.set(idx, curr.next);
			this.size--;
		}
		else {
			prev.next = curr.next;
			curr.next = null;
			this.size--;
		}
		
	}
	
	public boolean containsKey(K k) {
		int idx= getIdx(k);//bckt idx
		Node curr = this.bckt.get(idx);
		while(curr!=null) {
			if(curr.key.equals(k)) {// key already present
				return true;
			}
			curr = curr.next;
		}
		return false;
	}
	
	public V get(K k) {
		int idx= getIdx(k);//bckt idx
		Node curr = this.bckt.get(idx);
		while(curr!=null) {
			if(curr.key.equals(k)) {// key already present
				return curr.val;
			}
			curr = curr.next;
		}
		return null;
	}
	
	@Override
	public String toString() {
		String s = "{ ";
		
		for (Node node : bckt) {
			while(node!=null) {
				s+= node.key + "==>" + node.val+", ";
				node =node.next;
			}
		}
		s+= "}";
		return s;
	}

	private int getIdx(K k) {
		// TODO Auto-generated method stub
		int hc = k.hashCode() % this.bckt.size();
		return Math.abs(hc);
	}
}
