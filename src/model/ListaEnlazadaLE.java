package model;

public class ListaEnlazadaLE {

	/**
	 * Es el primer nodo de la lista
	 */
	private NodoLE nodo1;

	public ListaEnlazadaLE() {
		nodo1 = null;
	}

	public NodoLE getNodo1() {
		return nodo1;
	}

	public void setNodo1(NodoLE nodo1) {
		this.nodo1 = nodo1;
	}

	// ADD RECURSIVE
	public void addLERecursive(long content) {

		NodoLE n = new NodoLE(content);
		if (nodo1 == null) {
			nodo1 = n;
		} else {
			nodo1.addR(n);
		}

	}

//	// cuando se llame en la carrera lo meto dentro de un while para que me elimine
//	// la cantidad de elementos correspondientes
//	public void deleteLE() {
//
//		if (nodo1 == null) {
//			return;
//		} else {
//			nodo1.deleteR();
//		}
//	}

//	/**
//	 * DELETE RECURSIVE
//	 * 
//	 * @param number
//	 * @return
//	 */
//	public void deleteLER(long number, NodoLE actual) {
//		if (nodo1 == null) {
//			return;
//		} else {
//			nodo1.deleteRcorrect(number, nodo1);
//
//		}
//	}

	public void deleteLER(long number, NodoLE actual) {
		if (nodo1 == null) {
			return;
		} else if (nodo1.getContent() == number) {
			if (nodo1.getNext() != null) {
				nodo1 = nodo1.getNext();
				nodo1.setBefore(null);
			} else {
				nodo1 = null;
			}
		} else {
			nodo1.getNext().deleteRcorrect(number, nodo1.getNext());
		}
	}

	// SEARCH RECURSIVE
	public boolean searchLER(long number) {

		boolean itsHere = false;
		if (nodo1 == null) {
			return itsHere;
		} else {
			itsHere = nodo1.searchR2(number);
		}
		return itsHere;
	}

	// ADD ITERATIVE
	public void addLEIterative(long content) {
		NodoLE n = new NodoLE(content);
		if (nodo1 == null) {
			nodo1 = n;
		} else {

			NodoLE actual = nodo1;
			while (actual.getNext() != null) {
				actual = actual.getNext();
			}
			actual.setNext(n);
			n.setBefore(actual);
		}
	}

//	// DELETE ITERATIVE
//	public void deleteLEIterative() {
//
//		if (nodo1 == null) {
//			return;
//		} else {
//			NodoLE actual = nodo1;
//			while (actual.getNext() != null) {
//				actual = actual.getNext();
//			}
//			actual.getBefore().setNext(null);
//		}
//	}

//	public void eliminarNodo(int valor){
//	    Nodo actual = new Nodo();
//	    Nodo atras = new Nodo();
//	    actual = primero;
//	    atras = null;
//	    while(actual != null){
//	        if (actual.valor == valor){
//	            if(actual == primero){
//	                primero = primero.siguiente;
//	                primero.anterior = null;
//	            }else if(actual == ultimo){
//	     atras = actual.anterior;
//	     atras.siguiente = null;
//	     ultimo = atras;
//	                }
//	            
//	            }
//	            atras = actual;
//	            actual = actual.siguiente;
//	        }
//	    }
	/**
	 * mostrar lista
	 */

	public String show() {
		String s = "<=>";
		if (nodo1 != null) {
			for (NodoLE p = nodo1; p != null; p = p.getNext()) {

				s += "[" + p.getContent() + "]" + "<=>";
			}
		} else {
			s = "empty LE";
		}

		return s;
	}

	/**
	 * DELETE ITERATIVE CORRECT
	 * 
	 * @param number
	 * @return
	 */

	public void deleteLEI(long number) {

		NodoLE p = nodo1;
		boolean encontrado = false;
		while (p != null && encontrado == false) {
			encontrado = (p.getContent() == number);

			if (!encontrado) {
				p = p.getNext();
			}
		}
		if (encontrado) {
			if (p == nodo1)
				nodo1 = p.getNext();
			else {
				p.getBefore().setNext(p.getNext());
				if (p.getNext() != null) {
					p.getNext().setBefore(p.getBefore());
				}
				p = null;
			}
		}
	}

	// SEARCH ITERATIVE
	public boolean searchLEIterative(long number) {

		for (NodoLE n = nodo1; n != null; n = n.getNext()) {
			if (n.getContent() == number)
				return true;

		}
		return false;

	}
}
