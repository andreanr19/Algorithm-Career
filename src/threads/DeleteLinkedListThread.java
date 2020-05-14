package threads;

import model.Career;
import ui.CareerGUI;

public class DeleteLinkedListThread extends Thread {

	private Career career;
	private CareerGUI careergui;
	private TimeThreadLinkedList ttll;
	private ThreadAnimation ta;

	public DeleteLinkedListThread(Career career, CareerGUI careergui, TimeThreadLinkedList ttll) {
		this.career = career;
		this.careergui = careergui;
		this.ttll = ttll;
	}

	public DeleteLinkedListThread(Career career, CareerGUI careergui, TimeThreadLinkedList ttll, ThreadAnimation ta) {
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
			career.deleteIterativeLE();
			ttll.deactivate();
			ta.stopCircleAnimation();
		} else if (career.getWay() == 2) {
			ttll.start();
			ta.start();
			career.deleteRecursiveLE();
			ttll.deactivate();
			ta.stopCircleAnimation();
		}

	}
}
