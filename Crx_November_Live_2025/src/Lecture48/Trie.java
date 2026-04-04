package Lecture48;

import java.util.HashMap;

public class Trie {

	public class Node {
		Character val;
		boolean isEnd = false;
		HashMap<Character, Node> child = new HashMap<>();
	}

	private Node root;

	public Trie() {
		this.root = new Node();
		root.val = '*';

	}

	public void insert(String word) {
		Node curr = this.root;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				Node nn = new Node();
				nn.val = ch;
				curr.child.put(ch, nn);
				curr = nn;
			}
		}
		curr.isEnd = true;

	}

	public boolean search(String word) {
		Node curr = this.root;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return false;
			}
		}
		return curr.isEnd;
	}

	public boolean startsWith(String prefix) {
		Node curr = this.root;

		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return false;
			}
		}
		return true;
	}
}
