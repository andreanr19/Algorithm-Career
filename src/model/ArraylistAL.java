package model;

import java.util.ArrayList;

public class ArraylistAL {

	private ArrayList<NodoArraylist> nodes;

	public ArraylistAL() {
		nodes = new ArrayList<NodoArraylist>();
	}

	public ArrayList<NodoArraylist> getNodes() {
		return nodes;
	}

	public void setNodes(ArrayList<NodoArraylist> nodes) {
		this.nodes = nodes;
	}

	/**
	 * ADD
	 */

	public void addNode(long content) {
		NodoArraylist n = new NodoArraylist(content);
		nodes.add(n);
	}

	/**
	 * SEARCH ITERATIVE
	 */

	public boolean searchIterativeAL(long content) {
		long element = -1;
		boolean found = false;
		for (int i = 0; i < nodes.size() && element == -1; i++) {

			if (nodes.get(i).getContent() == content) {
				found = true;
				element = nodes.get(i).getContent();
			}
		}
		return found;
	}

	/**
	 * SEARCH RECURSIVE
	 */

	public boolean searchRecursiveAL(long content, int index) {

		boolean found = false;
		if (index >= nodes.size()) {
			found = false;
		} else if (nodes.get(index).getContent() == content) {
			found = true;
		} else {
			return searchRecursiveAL(content, index + 1);
		}
		return found;

	}

	/**
	 * DELETE RECURSIVE
	 */

	public void deleteRecursive(long content, int index) {
		if (index >= nodes.size()) {
			return;
		} else if (nodes.get(index).getContent() == content) {
			nodes.remove(index);
		} else {
			deleteRecursive(content, index + 1);
		}
	}

	/**
	 * DELETE SECUENCIAL
	 */
	public void deleteIterative(long content) {

		boolean deleted = false;
		for (int i = 0; i < nodes.size() && !deleted; i++) {
			if (nodes.get(i).getContent() == content) {
				nodes.remove(i);
				deleted = true;
			}
		}
	}
}
