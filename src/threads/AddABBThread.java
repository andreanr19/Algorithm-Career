package threads;

import model.Career;
import ui.CareerGUI;

public class AddABBThread extends Thread {
	private Career career;
	private CareerGUI careergui;
	private TimeThreadABB timethread;

	public AddABBThread(Career career, CareerGUI careergui, TimeThreadABB timethread) {
		this.career = career;
		this.careergui = careergui;
		this.timethread = timethread;
	}

	@Override
	public void run() {

		if (career.getWay() == 1) {
			timethread.start();

			career.addIterativeABB();

			timethread.deactivate();
		} else if (career.getWay() == 2) {

			timethread.start();
			career.addRecursiveABB();
			timethread.deactivate();
		}
	}

	public TimeThreadABB getTimeThread() {
		return timethread;
	}
}
