package threads;

import model.Career;
import ui.CareerGUI;

public class DeleteArraylistThread extends Thread {

	private Career career;
	private CareerGUI careergui;
	private TimeThreadArraylist tta;

	public DeleteArraylistThread(Career career, CareerGUI careergui, TimeThreadArraylist tta) {
		this.career = career;
		this.careergui = careergui;
		this.tta = tta;
	}

	@Override
	public void run() {

		if (career.getWay() == 1) {
			tta.start();
			career.deleteIterativeArraylist();
			tta.deactivate();
		} else if (career.getWay() == 2) {
			tta.start();

			career.deleteRecursiveArraylist();
			tta.deactivate();

		}

	}
}
