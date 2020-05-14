package threads;

import model.Career;
import ui.CareerGUI;

public class SearchLinkedListThread extends Thread {

	private Career career;
	private CareerGUI careergui;
	private TimeThreadLinkedList ttll;

	public SearchLinkedListThread(Career career, CareerGUI careergui, TimeThreadLinkedList ttll) {
		this.career = career;
		this.careergui = careergui;
		this.ttll = ttll;
	}

	@Override
	public void run() {

		if (career.getWay() == 1) {
			ttll.start();
			career.searchIterativeLE();
			ttll.deactivate();
		} else if (career.getWay() == 2) {

			ttll.start();
			career.searchRecursiveLE();
			ttll.deactivate();
		}

	}
}
