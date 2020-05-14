package threads;

import javafx.application.Platform;
import ui.CareerGUI;

public class TimeThreadArraylist extends Thread {

	private CareerGUI careergui;
	private boolean active;

	private int way;

	public TimeThreadArraylist(CareerGUI careergui, int way) {
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
						careergui.timerArraylist();

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
						careergui.timerArraylistAddRecursive();
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
						careergui.timerArraylistSearchIterative();
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
						careergui.timerArraylistSearchRecursive();
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
						careergui.deleteArraylistI();
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
						careergui.deleteArraylistR();
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
