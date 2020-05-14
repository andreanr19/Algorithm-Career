package threads;

import model.Career;
import ui.CareerGUI;

public class AddArraylistThread extends Thread {

	private Career career;
	private CareerGUI careergui;
	private TimeThreadArraylist timeThread;
	private ThreadAnimation ta;

	public AddArraylistThread(Career career, CareerGUI careergui, TimeThreadArraylist timeThread) {
		this.career = career;
		this.careergui = careergui;
		this.timeThread = timeThread;
	}

	@Override
	public void run() {

		if (career.getWay() == 1) {

			timeThread.start();

			career.addArraylist();
			timeThread.deactivate();
		} else if (career.getWay() == 2) {

			timeThread.start();
			career.addArraylist();
			timeThread.deactivate();

		}

//		Platform.runLater(new Thread() {
//			@Override
//			public void run() {
//				careergui.circleAnimation();
//			}
//		});
//	}
	}
}
