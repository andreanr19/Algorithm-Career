package threads;

import model.Career;
import ui.CareerGUI;

public class SearchLinkedListThread extends Thread {

	private Career career;
	private CareerGUI careergui;
	private TimeThreadLinkedList ttll;
	private ThreadAnimation ta;

	public SearchLinkedListThread(Career career, CareerGUI careergui, TimeThreadLinkedList ttll) {
		this.career = career;
		this.careergui = careergui;
		this.ttll = ttll;
	}

	public SearchLinkedListThread(Career career, CareerGUI careergui, TimeThreadLinkedList ttll, ThreadAnimation ta) {
		this.career = career;
		this.careergui = careergui;
		this.ttll = ttll;
		this.ta = ta;
	}

	@Override
	public void run() {

		if (career.getWay() == 1) {
			ttll.start();
			ta.start();
			career.searchIterativeLE();
			ttll.deactivate();
			ta.stopCircleAnimation();
		} else if (career.getWay() == 2) {
			ta.start();
			ttll.start();
			career.searchRecursiveLE();
			ttll.deactivate();
			ta.stopCircleAnimation();
		}

	}
}
