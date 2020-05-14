package threads;

import javafx.application.Platform;
import ui.CareerGUI;

public class ThreadAnimation extends Thread {

	private CareerGUI careergui;
	private boolean active;

	public ThreadAnimation(CareerGUI careergui) {
		this.careergui = careergui;
		active = true;
	}

	@Override
	public void run() {

		while (active) {
			Platform.runLater(new Thread() {

				@Override
				public void run() {
					careergui.circleAnimation();
				}
			});
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void stopCircleAnimation() {
		active = false;
	}

}
