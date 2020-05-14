package model;

public class NodoLE {

	private NodoLE next;

	private NodoLE before;

	private long content;

	public NodoLE(long content) {
		this.content = content;
	}

	public NodoLE getNext() {
		return next;
	}

	public void setNext(NodoLE next) {
		this.next = next;
	}

	public NodoLE getBefore() {
		return before;
	}

	public void setBefore(NodoLE before) {
		this.before = before;
	}

	public long getContent() {
		return content;
	}

	public void setContenido(long content) {
		this.content = content;
	}

	/**
	 * add recursivo
	 * 
	 * @param nodo
	 */
	public void addR(NodoLE nodo) {

		if (next == null) {
			next = nodo;
			next.before = this;
		} else {
			next.addR(nodo);
		}
	}

//	/**
//	 * eliminar recursivo
//	 */
//	public void deleteR() {
//		if (next == null) {
//
//			before.next = null;
//
//		} else {
//			next.deleteR();
//		}
//	}

//	/**
//	 * DELETE RECURSIVE
//	 */
//	public NodoLE deleteRR(long number, NodoLE actual) {
//
//		NodoLE theReturn = null;
//		if (content == number) {
//			theReturn = actual.next;
//			actual.next.setBefore(null);
//
//		} else {
//			if (actual.getNext() != null) {
//				deleteRR(number, actual.getNext());
//			} else {
//
//			}
//		}
//		return theReturn;
//
//	}

	/**
	 * DELETE RECURSIVE CORRECT
	 */
	public void deleteRcorrect(long number, NodoLE actual) {

		long comprobar = actual.getContent();
		if (actual.getContent() == number) {
			// si el anterior es null es porque es el primero
			if (actual.getBefore() == null) {
				actual.getNext().setBefore(null);
				actual = null;

			} else {

				actual.getBefore().setNext(actual.getNext());
				if (actual.getNext() != null) {
					actual.getNext().setBefore(actual.getBefore());
				}
				actual = null;

			}

		} else {

			if (actual.getNext() != null) {
				deleteRcorrect(number, actual.getNext());
			} else {
				return;
			}
		}
	}

	/**
	 * Buscar recursivo
	 */

	public boolean searchR2(long number) {
		if (content == number) {
			return true;
		} else {
			return (next == null) ? false : next.searchR2(number);
		}
	}

}
