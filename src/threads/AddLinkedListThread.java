package threads;

import model.Career;
import ui.CareerGUI;

public class AddLinkedListThread extends Thread {

	private Career career;
	private CareerGUI careergui;
	private TimeThreadLinkedList timethreadll;
	private boolean active;
	private ThreadAnimation ta;

	public AddLinkedListThread(Career career, CareerGUI careergui, TimeThreadLinkedList timethreadll) {
		this.career = career;
		this.careergui = careergui;
		this.timethreadll = timethreadll;
		active = true;
	}

	public AddLinkedListThread(Career career, CareerGUI careergui, TimeThreadLinkedList timethreadll,
			ThreadAnimation ta) {
		this.career = career;
		this.careergui = careergui;
		this.timethreadll = timethreadll;
		active = true;
		this.ta = ta;
	}

	@Override
	public void run() {
		timethreadll.start();

		if (career.getWay() == 1) {
			ta.start();
			career.addIterativeLE();
			ta.stopCircleAnimation();
		} else if (career.getWay() == 2) {
			ta.start();
			career.addRecursiveLE();
			ta.stopCircleAnimation();

		}
		timethreadll.deactivate();
	}

}
