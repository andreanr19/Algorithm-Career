package threads;

import javafx.application.Platform;
import ui.CareerGUI;

public class TimeThreadABB extends Thread {

	private CareerGUI careergui;
	private boolean active;
	private int way;

	public TimeThreadABB(CareerGUI careergui, int way) {
		this.careergui = careergui;
		active = true;
		this.way = way;
	}

	@Override
	public void run() {

		if (way == 1) {
			while (active) {
				Platform.runLater(new Runnable() {
					@Override
					public void run() {
						careergui.timerAbb();

					}
				});
				try {
					sleep(14);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} else if (way == 2) {
			while (active) {
				Platform.runLater(new Runnable() {
					@Override
					public void run() {
						careergui.timerAbbRecursive();

					}
				});
				try {
					sleep(14);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		} else if (way == 3) {
			while (active) {
				Platform.runLater(new Runnable() {
					@Override
					public void run() {
						careergui.timerABBSEARCHI();

					}
				});
				try {
					sleep(14);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} else if (way == 4) {
			while (active) {
				Platform.runLater(new Runnable() {
					@Override
					public void run() {
						careergui.timerABBSEARCHR();

					}
				});
				try {
					sleep(14);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} else if (way == 5) {
			while (active) {
				Platform.runLater(new Runnable() {
					@Override
					public void run() {
						careergui.timerDeleteABBI();

					}
				});
				try {
					sleep(14);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} else if (way == 6) {
			while (active) {
				Platform.runLater(new Runnable() {
					@Override
					public void run() {
						careergui.timerDeleteABBR();

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

	public void deactivate() {
		active = false;
	}
}
