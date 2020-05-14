package threads;

import model.Career;
import ui.CareerGUI;

public class DeleteABBThread extends Thread {

	private Career career;
	private CareerGUI careergui;
	private TimeThreadABB ttabb;

	public DeleteABBThread(Career career, CareerGUI careergui, TimeThreadABB ttabb) {
		this.career = career;
		this.careergui = careergui;
		this.ttabb = ttabb;
	}

	@Override
	public void run() {

		if (career.getWay() == 1) {
			ttabb.start();
			career.deleteIterativeABB();
			ttabb.deactivate();
		} else if (career.getWay() == 2) {
			ttabb.start();
			career.deleteRecursiveABB();
			ttabb.deactivate();
		}

	}

}
