package model;

import java.util.Random;

public class Career {

	private ArbolABB arbolabb;
	private ArraylistAL arraylistal;
	private ListaEnlazadaLE listaEnlazada;

	private long number;
	private int way;

	public Career(long number, int way) {
		this.number = number;
		this.way = way;
		this.arbolabb = new ArbolABB();
		this.arraylistal = new ArraylistAL();
		this.listaEnlazada = new ListaEnlazadaLE();

	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public int getWay() {
		return way;
	}

	public void setWay(int way) {
		this.way = way;
	}

	public ArbolABB getArbolabb() {
		return arbolabb;
	}

	public void setArbolabb(ArbolABB arbolabb) {
		this.arbolabb = arbolabb;
	}

	public ArraylistAL getArraylistal() {
		return arraylistal;
	}

	public void setArraylistal(ArraylistAL arraylistal) {
		this.arraylistal = arraylistal;
	}

	public ListaEnlazadaLE getListaEnlazada() {
		return listaEnlazada;
	}

	public void setListaEnlazada(ListaEnlazadaLE listaEnlazada) {
		this.listaEnlazada = listaEnlazada;
	}

	public long generateNumbers(long seed) {

		Random r = new Random(seed);
		return r.nextLong();
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN ADD THEM TO THE ABB
	 * ITERATIVELY
	 */
	public void addIterativeABB() {

		for (int i = 0; i < number; i++) {
			long numberToAdd = generateNumbers(i);
			arbolabb.addNodoABBIterative(numberToAdd);
		}
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN ADD THEM TO THE ABB
	 * RECURSIVELY
	 */
	public void addRecursiveABB() {

		for (int i = 0; i < number; i++) {
			long numberToAdd = generateNumbers(i);
			arbolabb.addNodeABBR(numberToAdd);
		}
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN ADD THEM TO THE LINKED
	 * LIST ITERATIVELY
	 */
	public void addIterativeLE() {

		for (int i = 0; i < number; i++) {
			long numberToAdd = generateNumbers(i);
			listaEnlazada.addLEIterative(numberToAdd);
		}
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN ADD THEM TO THE LINKED
	 * LIST RECURSIVELY
	 */
	public void addRecursiveLE() {

		for (int i = 0; i < number; i++) {
			long numberToAdd = generateNumbers(i);
			listaEnlazada.addLERecursive(numberToAdd);
		}
	}

	public long tiempofinal;
	public long tiempoinicial;

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN ADD THEM TO THE
	 * ARRAYLIST ITERATIVELY
	 */
	public void addArraylist() {

		for (int i = 0; i < number; i++) {
			long numberToAdd = generateNumbers(i);
			arraylistal.addNode(numberToAdd);
		}

	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN ADD THEM TO THE DATA
	 * ESTRUCTURES RECURSIVELY
	 */
	public void addRecursive() {

		for (int i = 0; i < number; i++) {
			long numberToAdd = generateNumbers(i);
			arbolabb.addNodeABBR(numberToAdd);
			arraylistal.addNode(numberToAdd);
			listaEnlazada.addLERecursive(numberToAdd);
		}
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN ADD THEM TO THE DATA
	 * ESTRUCTURES ITERATIVELY
	 */
	public void addIteratively() {

		for (int i = 0; i < number; i++) {
			long numberToAdd = generateNumbers(i);
			arbolabb.addNodoABBIterative(numberToAdd);
			arraylistal.addNode(numberToAdd);
			listaEnlazada.addLEIterative(numberToAdd);
		}
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN DELETE THEM FROM THE
	 * DATA ESTRUCTURES ITERATIVELY
	 */

	public void deleteIterative() {

		for (int i = 0; i < number; i++) {
			long numberToDelete = generateNumbers(i);
			arbolabb.deleteIterative(numberToDelete);
			arraylistal.deleteIterative(numberToDelete);
			listaEnlazada.deleteLEI(numberToDelete);
		}
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN DELETE THEM FROM THE
	 * DATA ESTRUCTURES RECURSIVELY
	 */

	public void deleteRecursive() {

		for (int i = 0; i < number; i++) {
			long numberToDelete = generateNumbers(i);
			arbolabb.deleteNodeABBR(numberToDelete);
			arraylistal.deleteRecursive(numberToDelete, i);
			listaEnlazada.deleteLER(numberToDelete, listaEnlazada.getNodo1());
		}
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN DELETE THEM FROM THE
	 * ARRAYLIST RECURSIVELY
	 */
	public void deleteRecursiveArraylist() {

		for (int i = 0; i < number; i++) {
			long numberToDelete = generateNumbers(i);
			arraylistal.deleteRecursive(numberToDelete, i);
		}
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN DELETE THEM FROM THE
	 * LINKED LIST RECURSIVELY
	 */
	public void deleteRecursiveLE() {

		if (listaEnlazada.getNodo1() != null) {
			for (int i = 0; i < number; i++) {
				long numberToDelete = generateNumbers(i);
				listaEnlazada.deleteLER(numberToDelete, listaEnlazada.getNodo1());
			}
		} else {
			return;
		}
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN DELETE THEM FROM THE
	 * ABB RECURSIVELY
	 */
	public void deleteRecursiveABB() {

		if (arbolabb.getRoot() != null) {
			for (int i = 0; i < number; i++) {
				long numberToDelete = generateNumbers(i);
				arbolabb.deleteNodeABBR(numberToDelete);
			}
		} else {
			return;
		}
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN DELETE THEM FROM THE
	 * ARRAYLIST ITERATIVELY
	 */
	public void deleteIterativeArraylist() {

		for (int i = 0; i < number; i++) {
			long numberToDelete = generateNumbers(i);
			arraylistal.deleteIterative(numberToDelete);
		}
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN DELETE THEM FROM THE
	 * LINKED LIST ITERATIVELY
	 */
	public void deleteIterativeLE() {

		if (listaEnlazada.getNodo1() != null) {
			for (int i = 0; i < number; i++) {
				long numberToDelete = generateNumbers(i);
				listaEnlazada.deleteLEI(numberToDelete);
			}
		} else {
			return;
		}
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN DELETE THEM FROM THE
	 * ABB ITERATIVELY
	 */
	public void deleteIterativeABB() {

		if (arbolabb.getRoot() != null) {
			for (int i = 0; i < number; i++) {
				long numberToDelete = generateNumbers(i);
				arbolabb.deleteIterative(numberToDelete);
			}
		} else {
			return;
		}
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN SEARCH FOR THEM IN THE
	 * DATA ESTRUCTURE RECURSIVELY
	 * 
	 */

	public void searchRecursive() {
		for (int i = 0; i < number; i++) {
			long numberToSearch = generateNumbers(i);
			arbolabb.searchNodeABBR(numberToSearch);
			arraylistal.searchRecursiveAL(numberToSearch, i);
			listaEnlazada.searchLER(numberToSearch);
		}
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN SEARCH FOR THEM IN THE
	 * DATA ESTRUCTURE ITERATIVELY
	 * 
	 */

	public void searchIterative() {
		for (int i = 0; i < number; i++) {
			long numberToSearch = generateNumbers(i);
			arbolabb.searchIterative(numberToSearch);
			arraylistal.searchIterativeAL(numberToSearch);
			listaEnlazada.searchLEIterative(numberToSearch);
		}
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN SEARCH FOR THEM IN THE
	 * ARRAYLIST RECURSIVELY
	 * 
	 */

	public void searchRecursiveArraylist() {
		if (arraylistal.getNodes().get(0) != null) {
			for (int i = 0; i < number; i++) {
				long numberToSearch = generateNumbers(i);
				arraylistal.searchRecursiveAL(numberToSearch, i);
//				System.out.println("SE BUSCÓ Y DIO " + arraylistal.searchRecursiveAL(numberToSearch, i));

			}
		} else {
			return;
		}
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN SEARCH FOR THEM IN THE
	 * LINKED LIST RECURSIVELY
	 * 
	 */

	public void searchRecursiveLE() {
		if (listaEnlazada.getNodo1() != null) {
			for (int i = 0; i < number; i++) {
				long numberToSearch = generateNumbers(i);
				listaEnlazada.searchLER(numberToSearch);
//				System.out.println("SE BUSCÓ Y DIO " + listaEnlazada.searchLER(numberToSearch));

			}
		} else {
			return;
		}
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN SEARCH FOR THEM IN THE
	 * ABB RECURSIVELY
	 * 
	 */

	public void searchRecursiveABB() {
		if (arbolabb.getRoot() != null) {
			for (int i = 0; i < number; i++) {
				long numberToSearch = generateNumbers(i);
				arbolabb.searchNodeABBR(numberToSearch);
//				System.out.println("SE BUSCÓ Y DIO " + arbolabb.searchNodeABBR(numberToSearch));

			}
		} else {
			return;
		}
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN SEARCH FOR THEM IN THE
	 * ARRAYLIST ITERATIVELY
	 * 
	 */

	public void searchIterativeArraylist() {
		if (arraylistal.getNodes().get(0) != null) {
			for (int i = 0; i < number; i++) {
				long numberToSearch = generateNumbers(i);
				arraylistal.searchIterativeAL(numberToSearch);
//				System.out.println("SE BUSCÓ Y DIO " + arraylistal.searchIterativeAL(numberToSearch));

			}
		} else {
			return;
		}
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN SEARCH FOR THEM IN THE
	 * LINKED LIST ITERATIVELY
	 * 
	 */

	public void searchIterativeLE() {
		if (listaEnlazada.getNodo1() != null) {
			for (int i = 0; i < number; i++) {
				long numberToSearch = generateNumbers(i);
				listaEnlazada.searchLEIterative(numberToSearch);
//				System.out.println("SE BUSCÓ Y DIO " + listaEnlazada.searchLEIterative(numberToSearch));

			}
		} else {
			return;
		}
	}

	/**
	 * GENERATE AN AMOUNT OF NUMBERS BY USER'S INPUT AND THEN SEARCH FOR THEM IN THE
	 * ABB ITERATIVELY
	 * 
	 */

	public void searchIterativeABB() {
		if (arbolabb.getRoot() != null) {
			for (int i = 0; i < number; i++) {
				long numberToSearch = generateNumbers(i);
				arbolabb.searchIterative(numberToSearch);
//				System.out.println("SE BUSCÓ Y DIO " + arbolabb.searchIterative(numberToSearch));

			}
		} else {
			return;
		}
	}

}
