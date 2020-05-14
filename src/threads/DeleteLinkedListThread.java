package threads;

import model.Career;
import ui.CareerGUI;

public class DeleteLinkedListThread extends Thread {

	private Career career;
	private CareerGUI careergui;
	private TimeThreadLinkedList ttll;

	public DeleteLinkedListThread(Career career, CareerGUI careergui, TimeThreadLinkedList ttll) {
		this.career = career;
		this.careergui = careergui;
		this.ttll = ttll;
	}

	@Override
	public void run() {

		if (career.getWay() == 1) {
			ttll.start();
			career.deleteIterativeLE();
			ttll.deactivate();
		} else if (career.getWay() == 2) {
			ttll.start();
			career.deleteRecursiveLE();
			ttll.deactivate();
		}

	}
}
