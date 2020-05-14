package threads;

import model.Career;
import ui.CareerGUI;

public class SearchArraylistThread extends Thread {
	private Career career;
	private CareerGUI careergui;
	private TimeThreadArraylist timethread;

	public SearchArraylistThread(Career career, CareerGUI careergui, TimeThreadArraylist tta) {
		this.career = career;
		this.careergui = careergui;
		this.timethread = tta;
	}

	@Override
	public void run() {

		if (career.getWay() == 1) {

			timethread.start();
			career.searchIterativeArraylist();
			timethread.deactivate();
		} else if (career.getWay() == 2) {

			timethread.start();
			career.searchRecursiveArraylist();
			timethread.deactivate();
		}

	}
}
