package threads;

import model.Career;
import ui.CareerGUI;

public class AddLinkedListThread extends Thread {

	private Career career;
	private CareerGUI careergui;
	private TimeThreadLinkedList timethreadll;

	public AddLinkedListThread(Career career, CareerGUI careergui, TimeThreadLinkedList timethreadll) {
		this.career = career;
		this.careergui = careergui;
		this.timethreadll = timethreadll;
	}

	@Override
	public void run() {
		timethreadll.start();

		if (career.getWay() == 1) {
			career.addIterativeLE();
		} else if (career.getWay() == 2) {
			career.addRecursiveLE();
		}
		timethreadll.deactivate();
	}

}
