package Lecture38;

import java.util.ArrayList;

public class Heap {

	private ArrayList<Integer> h;

	public Heap() {
		h = new ArrayList<>();
	}

	// O(logN)
	public void add(int item) {
		h.add(item);
		upheapify(h.size() - 1);
	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (h.get(pi) > h.get(ci)) {
			swap(ci, pi);
			upheapify(pi);
		}
	}

	// O(Log N)
	public int remove() {
		int temp = h.get(0);
		swap(0, h.size() - 1);
		h.remove(h.size() - 1);
		downheapify(0);
		return temp;
	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int c1 = 2 * pi + 1;
		int c2 = 2 * pi + 2;
		int min = pi;

		if (c1 < h.size() && h.get(min) > h.get(c1)) {
			min = c1;
		}
		if (c2 < h.size() && h.get(min) > h.get(c2)) {
			min = c2;
		}

		if (pi != min) {
			swap(pi, min);
			downheapify(min);
		}
	}
	// O(1)
	public int get() {
		return h.get(0);
	}
	
	public void display() {
		System.out.println(h);
	}

	private void swap(int ci, int pi) {

		// TODO Auto-generated method stub
		int tempp = h.get(pi);
		int tempc = h.get(ci);

		h.set(ci, tempp);
		h.set(pi, tempc);

	}

}
