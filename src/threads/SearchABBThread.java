package threads;

import model.Career;
import ui.CareerGUI;

public class SearchABBThread extends Thread {

	private Career career;
	private CareerGUI careergui;
	private TimeThreadABB ttabb;

	public SearchABBThread(Career career, CareerGUI careergui, TimeThreadABB ttabb) {
		this.career = career;
		this.careergui = careergui;
		this.ttabb = ttabb;
	}

	@Override
	public void run() {

		if (career.getWay() == 1) {
			ttabb.start();
			career.searchIterativeABB();
			ttabb.deactivate();
		} else if (career.getWay() == 2) {

			ttabb.start();
			career.searchRecursiveABB();
			ttabb.deactivate();
		}

	}
}
