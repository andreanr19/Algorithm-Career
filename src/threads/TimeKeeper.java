package threads;

import javafx.application.Platform;
import ui.CareerGUI;

public class TimeKeeper extends Thread {

	private CareerGUI careergui;
	private boolean active;

	public TimeKeeper(CareerGUI careergui) {

		while (active) {
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					careergui.timeKeeper();
				}
			});
			try {
				sleep(14);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
