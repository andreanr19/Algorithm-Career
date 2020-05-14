package model;

public class NodoABB {

	private long content;

	private NodoABB left;
	private NodoABB right;

	public NodoABB(long content) {
		this.content = content;
		left = null;
		right = null;
	}

	public long getContent() {
		return content;
	}

	public void setContent(long content) {
		this.content = content;
	}

	public NodoABB getLeft() {
		return left;
	}

	public void setLeft(NodoABB left) {
		this.left = left;
	}

	public NodoABB getRight() {
		return right;
	}

	public void setRight(NodoABB right) {
		this.right = right;
	}

	public boolean isSheet() {

		return left == null && right == null;
	}

	public NodoABB getSmaller() {
		return (left == null) ? this : left.getSmaller();
	}

	public NodoABB getBigger() {
		return (right == null) ? this : right.getBigger();
	}

	/**
	 * ADD RECURSIVE
	 */
	public void addR(NodoABB n) {
		if (this.getContent() > n.getContent()) {
			// debe agregar el nuevo nodo por el subarbol izquierdo
			if (left == null)
				left = n;
			else
				left.addR(n);
		} else {
			// debe agregar el nuevo nodo por el subarbol derecho
			if (right == null)
				right = n;
			else
				right.addR(n);
		}
	}

	/**
	 * SEARCH RECURSIVE
	 */
	public boolean searchR(long number) {
		if (getContent() == number)
			return true;
		else if (getContent() > number)
			return (left == null) ? false : left.searchR(number);
		else
			return (right == null) ? false : right.searchR(number);
	}

	/**
	 * DELETE RECURSIVE
	 */

	public NodoABB deleteR(long number) {

		if (isSheet())
			return null;
		if (content == number) {
			if (left == null)
				return right;
			if (right == null)
				return left;
			NodoABB aux = right.getSmaller();
			right = right.deleteR(aux.getContent());

			aux.left = left;
			aux.right = right;
			return aux;

		} else if (content > number)
			left = left.deleteR(number);
		else
			right = right.deleteR(number);
		return this;
	}

}
