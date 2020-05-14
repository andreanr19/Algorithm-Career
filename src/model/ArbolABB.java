package model;

public class ArbolABB {

	private NodoABB root;

	public ArbolABB() {
		root = null;
	}

	/**
	 * ADD RECURSIVE
	 * 
	 * @param content
	 */
	public void addNodeABBR(long content) {
		NodoABB n = new NodoABB(content);

		if (root == null)
			root = n;
		else
			root.addR(n);

	}

	/**
	 * SEARCH RECURSIVE
	 */
	public boolean searchNodeABBR(long content) {
		return root == null ? false : root.searchR(content);
	}

	/**
	 * DELETE RECURSIVE
	 */

	public void deleteNodeABBR(long content) {
		root = root.deleteR(content);
	}

	public NodoABB getRoot() {
		return root;
	}

	public void setRoot(NodoABB root) {
		this.root = root;
	}

	/**
	 * add iterative
	 * 
	 * @param content
	 */
	public void addNodoABBIterative(long content) {

		NodoABB theNew = new NodoABB(content);

		if (root == null) {
			root = theNew;
		} else {
			NodoABB aux = root;
			NodoABB father;
			while (true) {
				father = aux;

				if (content < aux.getContent()) {
					aux = aux.getLeft();
					if (aux == null) {
						father.setLeft(theNew);

						return;
					}
				} else {
					aux = aux.getRight();
					if (aux == null) {
						father.setRight(theNew);
						return;
					}
				}
			}
		}
	}

	// Método para saber cuando el árbol está vacio
	public boolean itsEmpty() {
		return root == null;

	}

	/**
	 * InOrden
	 */

	public void inOrden(NodoABB r) {

		if (r != null) {
			inOrden(r.getLeft());
			System.out.print(r.getContent() + ", ");
			inOrden(r.getRight());
		}
	}

	/**
	 * PreOrden
	 */
	public void preOrden(NodoABB r) {

		if (r != null) {
			System.out.print(r.getContent() + ", ");
			preOrden(r.getLeft());
			preOrden(r.getRight());
		}
	}

	/**
	 * PostOrden
	 */
	public void postOrden(NodoABB r) {

		if (r != null) {
			postOrden(r.getLeft());
			postOrden(r.getRight());
			System.out.print(r.getContent() + ", ");
		}
	}

	/**
	 * SEARCH ITERATIVE
	 */
	public boolean searchIterative(long content) {

		if (root == null) {
			return false;
		} else {
			NodoABB aux = root;

			while (aux.getContent() != content) {
				if (content < aux.getContent()) {
					aux = aux.getLeft();
				} else {
					aux = aux.getRight();
				}
				if (aux == null) {
					return false;
				}
			}
			return true;
		}
	}

	/**
	 * DELETE ITERATIVE
	 */
	public void deleteIterative(long number) {

		if (itsEmpty()) {
			return;
		} else {
			NodoABB aux = root;
			NodoABB father = root;
			boolean itsLeft = true;
			while (aux.getContent() != number) {
				father = root;
				if (number < aux.getContent()) {
					itsLeft = true;
					aux = aux.getLeft();
				} else {
					itsLeft = false;
					aux = aux.getRight();
				}
				if (aux == null) {
					return;
				}
			} // fin del while
			if (aux.getLeft() == null && aux.getRight() == null) { // el nodo es hoja
				if (aux == root) {
					root = null;
				} else if (itsLeft) {
					father.setLeft(null);

				} else {
					father.setRight(null);
				}
			} else if (aux.getRight() == null) {
				if (aux == root) {
					root = aux.getLeft();
				} else if (itsLeft) {
					father.setLeft(aux.getLeft());

				} else {
					father.setRight(aux.getLeft());
				}
			} else if (aux.getLeft() == null) {
				if (aux == root) {
					root = aux.getRight();
				} else if (itsLeft) {
					father.setLeft(aux.getRight());

				} else {
					//
					father.setRight(aux.getRight());
				}
			} else {
				NodoABB replacement = getReplacementNode(aux);
				if (aux == root) {
					root = replacement;
				} else if (itsLeft) {
					father.setLeft(replacement);

				} else {
					father.setRight(replacement);
				}
				replacement.setLeft(aux.getLeft());
			}
		}

	}

	/**
	 * Method that obtains the replacement node
	 */

	public NodoABB getReplacementNode(NodoABB nodoRe) {
		NodoABB replaceFather = nodoRe;
		NodoABB replace = nodoRe;
		NodoABB aux = nodoRe.getRight();

		while (aux != null) {
			replaceFather = replace;
			replace = aux;
			aux = aux.getLeft();
		}
		if (replace != nodoRe.getRight()) {
			replaceFather.setLeft(replace.getRight());
			replace.setRight(nodoRe.getRight());
		}
//		System.out.println("The node replace it's " + replace.getContent());
		return replace;
	}

}
