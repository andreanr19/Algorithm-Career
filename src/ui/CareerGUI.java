package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import model.Career;
import threads.AddABBThread;
import threads.AddArraylistThread;
import threads.AddLinkedListThread;
import threads.DeleteABBThread;
import threads.DeleteArraylistThread;
import threads.DeleteLinkedListThread;
import threads.SearchABBThread;
import threads.SearchArraylistThread;
import threads.SearchLinkedListThread;
import threads.TimeKeeper;
import threads.TimeThreadABB;
import threads.TimeThreadArraylist;
import threads.TimeThreadLinkedList;

public class CareerGUI {

	private Career career;

	public CareerGUI() {

	}

	@FXML
	private TextField numberTxtField;

	@FXML
	private RadioButton addRdoBtn;

	@FXML
	private ToggleGroup algorithm;

	@FXML
	private RadioButton searchRdoBtn;

	@FXML
	private RadioButton deleteRdoBtn;

	@FXML
	private ToggleGroup mode;

	@FXML
	private Button runBtn;

//	@FXML
//	private TextField timeKeeperTxtField;

	@FXML
	private TextField arrayListTxtFld;

	@FXML
	private TextField abbTxtFld;

	@FXML
	private TextField linkedListTxtFld;
	@FXML
	private RadioButton iterativeRdoBtn;
	@FXML
	private RadioButton recursiveRdoBtn;

	@FXML
	private Label timerABB;
	@FXML
	private Label timerArraylist;

	@FXML
	private Label timerLinkedList;

	@FXML
	private TextField arrayListRtxtfld;

	@FXML
	private Label timerarraylistaddRlbl;
	@FXML
	private Label timerLEaddRlbl;

	@FXML
	private Label timerABBaddR;

	@FXML
	private Label timerArraylistSearchI;

	@FXML
	private Label timerSearchLEI;

	@FXML
	private Label timerSearchABBI;

	@FXML
	private Label searchABBR;

	@FXML
	private Label searchArraylistR;

	@FXML
	private Label searchLER;

	@FXML
	private Label deleteABBI;

	@FXML
	private Label deleteArraylistI;

	@FXML
	private Label deleteLEI;

	@FXML
	private Label deleteArraylistR;

	@FXML

	private Label deleteLER;

	@FXML
	private Label deleteABBR;

//	@FXML
//	private Label timeKeeperLlb;

	int secondsabb;
	int milisecondsabb;
	int minutesabb;

	int secondsArraylist;
	int milisecondsArraylist;
	int minutesArraylist;

	int secondsLinkedList;
	int milisecondsLinkedList;
	int minutesLinkedList;

	int secondsTK;
	int milisecondsTK;
	int minutesTK;

	public void timeKeeper() {
		milisecondsTK++;

		String txtmilisecondstk = "";
		String txtSecondstk = "";
		String txtMinutestk = "";

		if (milisecondsTK > 59) {
			milisecondsTK = 0;
			secondsTK++;
		}
		if (secondsTK > 59) {
			secondsTK = 0;
			minutesTK++;
		}

		if (milisecondsTK < 10) {
			txtmilisecondstk = "0" + milisecondsTK;
		} else {
			txtmilisecondstk = milisecondsTK + "";
		}

		if (secondsTK < 10) {
			txtSecondstk = "0" + secondsTK;
		} else {
			txtSecondstk = secondsTK + "";
		}

		if (minutesTK < 10) {
			txtMinutestk = "0" + minutesTK;
		} else {
			txtMinutestk = minutesTK + "";

		}

//		timeKeeperLlb.setText(txtMinutestk + ":" + txtSecondstk + ":" + txtmilisecondstk);
//		timeKeeperTxtField.setText(txtMinutestk + ":" + txtSecondstk + ":" + txtmilisecondstk);
	}

	public void restart() {
		secondsArraylist = 0;
		milisecondsArraylist = 0;
		minutesArraylist = 0;

		secondsLinkedList = 0;
		milisecondsLinkedList = 0;
		minutesLinkedList = 0;

		secondsabb = 0;
		milisecondsabb = 0;
		minutesabb = 0;

	}

	////////////////////////////////////////////////////////////

	public void timerLinkedListRecursive() {
		milisecondsLinkedList++;

		String txtMilisecondsLinkedList = "";
		String txtSecondsLinkedList = "";
		String txtMinutesLinkedList = "";

		if (milisecondsLinkedList > 59) {
			milisecondsLinkedList = 0;
			secondsLinkedList++;
		}
		if (secondsLinkedList > 59) {
			secondsLinkedList = 0;
			minutesLinkedList++;
		}

		if (milisecondsLinkedList < 10) {
			txtMilisecondsLinkedList = "0" + milisecondsLinkedList;
		} else {
			txtMilisecondsLinkedList = milisecondsLinkedList + "";
		}

		if (secondsLinkedList < 10) {
			txtSecondsLinkedList = "0" + secondsLinkedList;
		} else {
			txtSecondsLinkedList = secondsLinkedList + "";
		}

		if (minutesLinkedList < 10) {
			txtMinutesLinkedList = "0" + minutesLinkedList;
		} else {
			txtMinutesLinkedList = minutesLinkedList + "";

		}

		timerLEaddRlbl.setText(txtMinutesLinkedList + ":" + txtSecondsLinkedList + ":" + txtMilisecondsLinkedList);
	}

	public void timerLinkedList() {
		milisecondsLinkedList++;

		String txtMilisecondsLinkedList = "";
		String txtSecondsLinkedList = "";
		String txtMinutesLinkedList = "";

		if (milisecondsLinkedList > 59) {
			milisecondsLinkedList = 0;
			secondsLinkedList++;
		}
		if (secondsLinkedList > 59) {
			secondsLinkedList = 0;
			minutesLinkedList++;
		}

		if (milisecondsLinkedList < 10) {
			txtMilisecondsLinkedList = "0" + milisecondsLinkedList;
		} else {
			txtMilisecondsLinkedList = milisecondsLinkedList + "";
		}

		if (secondsLinkedList < 10) {
			txtSecondsLinkedList = "0" + secondsLinkedList;
		} else {
			txtSecondsLinkedList = secondsLinkedList + "";
		}

		if (minutesLinkedList < 10) {
			txtMinutesLinkedList = "0" + minutesLinkedList;
		} else {
			txtMinutesLinkedList = minutesLinkedList + "";

		}

		timerLinkedList.setText(txtMinutesLinkedList + ":" + txtSecondsLinkedList + ":" + txtMilisecondsLinkedList);
	}

	public void timerSearchLEI() {
		milisecondsLinkedList++;

		String txtMilisecondsLinkedList = "";
		String txtSecondsLinkedList = "";
		String txtMinutesLinkedList = "";

		if (milisecondsLinkedList > 59) {
			milisecondsLinkedList = 0;
			secondsLinkedList++;
		}
		if (secondsLinkedList > 59) {
			secondsLinkedList = 0;
			minutesLinkedList++;
		}

		if (milisecondsLinkedList < 10) {
			txtMilisecondsLinkedList = "0" + milisecondsLinkedList;
		} else {
			txtMilisecondsLinkedList = milisecondsLinkedList + "";
		}

		if (secondsLinkedList < 10) {
			txtSecondsLinkedList = "0" + secondsLinkedList;
		} else {
			txtSecondsLinkedList = secondsLinkedList + "";
		}

		if (minutesLinkedList < 10) {
			txtMinutesLinkedList = "0" + minutesLinkedList;
		} else {
			txtMinutesLinkedList = minutesLinkedList + "";

		}

		timerSearchLEI.setText(txtMinutesLinkedList + ":" + txtSecondsLinkedList + ":" + txtMilisecondsLinkedList);

	}

	public void timerSearchLER() {
		milisecondsLinkedList++;

		String txtMilisecondsLinkedList = "";
		String txtSecondsLinkedList = "";
		String txtMinutesLinkedList = "";

		if (milisecondsLinkedList > 59) {
			milisecondsLinkedList = 0;
			secondsLinkedList++;
		}
		if (secondsLinkedList > 59) {
			secondsLinkedList = 0;
			minutesLinkedList++;
		}

		if (milisecondsLinkedList < 10) {
			txtMilisecondsLinkedList = "0" + milisecondsLinkedList;
		} else {
			txtMilisecondsLinkedList = milisecondsLinkedList + "";
		}

		if (secondsLinkedList < 10) {
			txtSecondsLinkedList = "0" + secondsLinkedList;
		} else {
			txtSecondsLinkedList = secondsLinkedList + "";
		}

		if (minutesLinkedList < 10) {
			txtMinutesLinkedList = "0" + minutesLinkedList;
		} else {
			txtMinutesLinkedList = minutesLinkedList + "";

		}

		searchLER.setText(txtMinutesLinkedList + ":" + txtSecondsLinkedList + ":" + txtMilisecondsLinkedList);
	}

	public void timerDeleteLEI() {
		milisecondsLinkedList++;

		String txtMilisecondsLinkedList = "";
		String txtSecondsLinkedList = "";
		String txtMinutesLinkedList = "";

		if (milisecondsLinkedList > 59) {
			milisecondsLinkedList = 0;
			secondsLinkedList++;
		}
		if (secondsLinkedList > 59) {
			secondsLinkedList = 0;
			minutesLinkedList++;
		}

		if (milisecondsLinkedList < 10) {
			txtMilisecondsLinkedList = "0" + milisecondsLinkedList;
		} else {
			txtMilisecondsLinkedList = milisecondsLinkedList + "";
		}

		if (secondsLinkedList < 10) {
			txtSecondsLinkedList = "0" + secondsLinkedList;
		} else {
			txtSecondsLinkedList = secondsLinkedList + "";
		}

		if (minutesLinkedList < 10) {
			txtMinutesLinkedList = "0" + minutesLinkedList;
		} else {
			txtMinutesLinkedList = minutesLinkedList + "";

		}

		deleteLEI.setText(txtMinutesLinkedList + ":" + txtSecondsLinkedList + ":" + txtMilisecondsLinkedList);
	}

	public void timerDeleteLER() {
		milisecondsLinkedList++;

		String txtMilisecondsLinkedList = "";
		String txtSecondsLinkedList = "";
		String txtMinutesLinkedList = "";

		if (milisecondsLinkedList > 59) {
			milisecondsLinkedList = 0;
			secondsLinkedList++;
		}
		if (secondsLinkedList > 59) {
			secondsLinkedList = 0;
			minutesLinkedList++;
		}

		if (milisecondsLinkedList < 10) {
			txtMilisecondsLinkedList = "0" + milisecondsLinkedList;
		} else {
			txtMilisecondsLinkedList = milisecondsLinkedList + "";
		}

		if (secondsLinkedList < 10) {
			txtSecondsLinkedList = "0" + secondsLinkedList;
		} else {
			txtSecondsLinkedList = secondsLinkedList + "";
		}

		if (minutesLinkedList < 10) {
			txtMinutesLinkedList = "0" + minutesLinkedList;
		} else {
			txtMinutesLinkedList = minutesLinkedList + "";

		}

		deleteLER.setText(txtMinutesLinkedList + ":" + txtSecondsLinkedList + ":" + txtMilisecondsLinkedList);
	}
	////////////////////////////////////////////////////////////

	public void timerAbbRecursive() {
		milisecondsabb++;

		String txtMilisecondsABB = "";
		String txtSecondsABB = "";
		String txtMinutesABB = "";

		if (milisecondsabb > 59) {
			milisecondsabb = 0;
			secondsabb++;
		}
		if (secondsabb > 59) {
			secondsabb = 0;
			minutesabb++;
		}

		if (milisecondsabb < 10) {
			txtMilisecondsABB = "0" + milisecondsabb;
		} else {
			txtMilisecondsABB = milisecondsabb + "";
		}

		if (secondsabb < 10) {
			txtSecondsABB = "0" + secondsabb;
		} else {
			txtSecondsABB = secondsabb + "";
		}

		if (minutesabb < 10) {
			txtMinutesABB = "0" + minutesabb;
		} else {
			txtMinutesABB = minutesabb + "";

		}

		timerABBaddR.setText(txtMinutesABB + ":" + txtSecondsABB + ":" + txtMilisecondsABB);
	}

	public void timerAbb() {
		milisecondsabb++;

		String txtMilisecondsABB = "";
		String txtSecondsABB = "";
		String txtMinutesABB = "";

		if (milisecondsabb > 59) {
			milisecondsabb = 0;
			secondsabb++;
		}
		if (secondsabb > 59) {
			secondsabb = 0;
			minutesabb++;
		}

		if (milisecondsabb < 10) {
			txtMilisecondsABB = "0" + milisecondsabb;
		} else {
			txtMilisecondsABB = milisecondsabb + "";
		}

		if (secondsabb < 10) {
			txtSecondsABB = "0" + secondsabb;
		} else {
			txtSecondsABB = secondsabb + "";
		}

		if (minutesabb < 10) {
			txtMinutesABB = "0" + minutesabb;
		} else {
			txtMinutesABB = minutesabb + "";

		}

		timerABB.setText(txtMinutesABB + ":" + txtSecondsABB + ":" + txtMilisecondsABB);
	}

	public void timerABBSEARCHI() {

		milisecondsabb++;

		String txtMilisecondsABB = "";
		String txtSecondsABB = "";
		String txtMinutesABB = "";

		if (milisecondsabb > 59) {
			milisecondsabb = 0;
			secondsabb++;
		}
		if (secondsabb > 59) {
			secondsabb = 0;
			minutesabb++;
		}

		if (milisecondsabb < 10) {
			txtMilisecondsABB = "0" + milisecondsabb;
		} else {
			txtMilisecondsABB = milisecondsabb + "";
		}

		if (secondsabb < 10) {
			txtSecondsABB = "0" + secondsabb;
		} else {
			txtSecondsABB = secondsabb + "";
		}

		if (minutesabb < 10) {
			txtMinutesABB = "0" + minutesabb;
		} else {
			txtMinutesABB = minutesabb + "";

		}

		timerSearchABBI.setText(txtMinutesABB + ":" + txtSecondsABB + ":" + txtMilisecondsABB);
	}

	public void timerABBSEARCHR() {
		milisecondsabb++;

		String txtMilisecondsABB = "";
		String txtSecondsABB = "";
		String txtMinutesABB = "";

		if (milisecondsabb > 59) {
			milisecondsabb = 0;
			secondsabb++;
		}
		if (secondsabb > 59) {
			secondsabb = 0;
			minutesabb++;
		}

		if (milisecondsabb < 10) {
			txtMilisecondsABB = "0" + milisecondsabb;
		} else {
			txtMilisecondsABB = milisecondsabb + "";
		}

		if (secondsabb < 10) {
			txtSecondsABB = "0" + secondsabb;
		} else {
			txtSecondsABB = secondsabb + "";
		}

		if (minutesabb < 10) {
			txtMinutesABB = "0" + minutesabb;
		} else {
			txtMinutesABB = minutesabb + "";

		}

		searchABBR.setText(txtMinutesABB + ":" + txtSecondsABB + ":" + txtMilisecondsABB);
	}

	public void timerDeleteABBI() {
		milisecondsabb++;

		String txtMilisecondsABB = "";
		String txtSecondsABB = "";
		String txtMinutesABB = "";

		if (milisecondsabb > 59) {
			milisecondsabb = 0;
			secondsabb++;
		}
		if (secondsabb > 59) {
			secondsabb = 0;
			minutesabb++;
		}

		if (milisecondsabb < 10) {
			txtMilisecondsABB = "0" + milisecondsabb;
		} else {
			txtMilisecondsABB = milisecondsabb + "";
		}

		if (secondsabb < 10) {
			txtSecondsABB = "0" + secondsabb;
		} else {
			txtSecondsABB = secondsabb + "";
		}

		if (minutesabb < 10) {
			txtMinutesABB = "0" + minutesabb;
		} else {
			txtMinutesABB = minutesabb + "";

		}

		deleteABBI.setText(txtMinutesABB + ":" + txtSecondsABB + ":" + txtMilisecondsABB);
	}

	public void timerDeleteABBR() {
		milisecondsabb++;

		String txtMilisecondsABB = "";
		String txtSecondsABB = "";
		String txtMinutesABB = "";

		if (milisecondsabb > 59) {
			milisecondsabb = 0;
			secondsabb++;
		}
		if (secondsabb > 59) {
			secondsabb = 0;
			minutesabb++;
		}

		if (milisecondsabb < 10) {
			txtMilisecondsABB = "0" + milisecondsabb;
		} else {
			txtMilisecondsABB = milisecondsabb + "";
		}

		if (secondsabb < 10) {
			txtSecondsABB = "0" + secondsabb;
		} else {
			txtSecondsABB = secondsabb + "";
		}

		if (minutesabb < 10) {
			txtMinutesABB = "0" + minutesabb;
		} else {
			txtMinutesABB = minutesabb + "";

		}

		deleteABBR.setText(txtMinutesABB + ":" + txtSecondsABB + ":" + txtMilisecondsABB);
	}

	////////////////////////////////////////////////////////////
	public void timerArraylist() {
		milisecondsArraylist++;

		String txtMilisecondsArraylist = "";
		String txtSecondsArraylist = "";
		String txtMinutesArraylist = "";

		if (milisecondsArraylist > 59) {
			milisecondsArraylist = 0;
			secondsArraylist++;
		}
		if (secondsArraylist > 59) {
			secondsArraylist = 0;
			minutesArraylist++;
		}

		if (milisecondsArraylist < 10) {
			txtMilisecondsArraylist = "0" + milisecondsArraylist;
		} else {
			txtMilisecondsArraylist = milisecondsArraylist + "";
		}

		if (secondsArraylist < 10) {
			txtSecondsArraylist = "0" + secondsArraylist;
		} else {
			txtSecondsArraylist = secondsArraylist + "";
		}

		if (minutesArraylist < 10) {
			txtMinutesArraylist = "0" + minutesArraylist;
		} else {
			txtMinutesArraylist = minutesArraylist + "";

		}

		timerArraylist.setText(txtMinutesArraylist + ":" + txtSecondsArraylist + ":" + txtMilisecondsArraylist);
	}

	public void timerArraylistAddRecursive() {
		milisecondsArraylist++;

		String txtMilisecondsArraylist = "";
		String txtSecondsArraylist = "";
		String txtMinutesArraylist = "";

		if (milisecondsArraylist > 59) {
			milisecondsArraylist = 0;
			secondsArraylist++;
		}
		if (secondsArraylist > 59) {
			secondsArraylist = 0;
			minutesArraylist++;
		}

		if (milisecondsArraylist < 10) {
			txtMilisecondsArraylist = "0" + milisecondsArraylist;
		} else {
			txtMilisecondsArraylist = milisecondsArraylist + "";
		}

		if (secondsArraylist < 10) {
			txtSecondsArraylist = "0" + secondsArraylist;
		} else {
			txtSecondsArraylist = secondsArraylist + "";
		}

		if (minutesArraylist < 10) {
			txtMinutesArraylist = "0" + minutesArraylist;
		} else {
			txtMinutesArraylist = minutesArraylist + "";

		}

		timerarraylistaddRlbl.setText(txtMinutesArraylist + ":" + txtSecondsArraylist + ":" + txtMilisecondsArraylist);
	}

	public void timerArraylistSearchIterative() {

		milisecondsArraylist++;

		String txtMilisecondsArraylist = "";
		String txtSecondsArraylist = "";
		String txtMinutesArraylist = "";

		if (milisecondsArraylist > 59) {
			milisecondsArraylist = 0;
			secondsArraylist++;
		}
		if (secondsArraylist > 59) {
			secondsArraylist = 0;
			minutesArraylist++;
		}

		if (milisecondsArraylist < 10) {
			txtMilisecondsArraylist = "0" + milisecondsArraylist;
		} else {
			txtMilisecondsArraylist = milisecondsArraylist + "";
		}

		if (secondsArraylist < 10) {
			txtSecondsArraylist = "0" + secondsArraylist;
		} else {
			txtSecondsArraylist = secondsArraylist + "";
		}

		if (minutesArraylist < 10) {
			txtMinutesArraylist = "0" + minutesArraylist;
		} else {
			txtMinutesArraylist = minutesArraylist + "";

		}

		timerArraylistSearchI.setText(txtMinutesArraylist + ":" + txtSecondsArraylist + ":" + txtMilisecondsArraylist);
	}

	public void timerArraylistSearchRecursive() {
		milisecondsArraylist++;

		String txtMilisecondsArraylist = "";
		String txtSecondsArraylist = "";
		String txtMinutesArraylist = "";

		if (milisecondsArraylist > 59) {
			milisecondsArraylist = 0;
			secondsArraylist++;
		}
		if (secondsArraylist > 59) {
			secondsArraylist = 0;
			minutesArraylist++;
		}

		if (milisecondsArraylist < 10) {
			txtMilisecondsArraylist = "0" + milisecondsArraylist;
		} else {
			txtMilisecondsArraylist = milisecondsArraylist + "";
		}

		if (secondsArraylist < 10) {
			txtSecondsArraylist = "0" + secondsArraylist;
		} else {
			txtSecondsArraylist = secondsArraylist + "";
		}

		if (minutesArraylist < 10) {
			txtMinutesArraylist = "0" + minutesArraylist;
		} else {
			txtMinutesArraylist = minutesArraylist + "";

		}

		searchArraylistR.setText(txtMinutesArraylist + ":" + txtSecondsArraylist + ":" + txtMilisecondsArraylist);
	}

	public void deleteArraylistI() {
		milisecondsArraylist++;

		String txtMilisecondsArraylist = "";
		String txtSecondsArraylist = "";
		String txtMinutesArraylist = "";

		if (milisecondsArraylist > 59) {
			milisecondsArraylist = 0;
			secondsArraylist++;
		}
		if (secondsArraylist > 59) {
			secondsArraylist = 0;
			minutesArraylist++;
		}

		if (milisecondsArraylist < 10) {
			txtMilisecondsArraylist = "0" + milisecondsArraylist;
		} else {
			txtMilisecondsArraylist = milisecondsArraylist + "";
		}

		if (secondsArraylist < 10) {
			txtSecondsArraylist = "0" + secondsArraylist;
		} else {
			txtSecondsArraylist = secondsArraylist + "";
		}

		if (minutesArraylist < 10) {
			txtMinutesArraylist = "0" + minutesArraylist;
		} else {
			txtMinutesArraylist = minutesArraylist + "";

		}

		deleteArraylistI.setText(txtMinutesArraylist + ":" + txtSecondsArraylist + ":" + txtMilisecondsArraylist);
	}

	public void deleteArraylistR() {

		milisecondsArraylist++;

		String txtMilisecondsArraylist = "";
		String txtSecondsArraylist = "";
		String txtMinutesArraylist = "";

		if (milisecondsArraylist > 59) {
			milisecondsArraylist = 0;
			secondsArraylist++;
		}
		if (secondsArraylist > 59) {
			secondsArraylist = 0;
			minutesArraylist++;
		}

		if (milisecondsArraylist < 10) {
			txtMilisecondsArraylist = "0" + milisecondsArraylist;
		} else {
			txtMilisecondsArraylist = milisecondsArraylist + "";
		}

		if (secondsArraylist < 10) {
			txtSecondsArraylist = "0" + secondsArraylist;
		} else {
			txtSecondsArraylist = secondsArraylist + "";
		}

		if (minutesArraylist < 10) {
			txtMinutesArraylist = "0" + minutesArraylist;
		} else {
			txtMinutesArraylist = minutesArraylist + "";

		}

		deleteArraylistR.setText(txtMinutesArraylist + ":" + txtSecondsArraylist + ":" + txtMilisecondsArraylist);
	}
	////////////////////////////////////////////////////////////

	public void restartClock() {
		timerArraylist.setText("");
	}

	@FXML
	void run(ActionEvent event) {

		try {
			TimeKeeper tk = new TimeKeeper(this);

			tk.start();
			long number = Long.parseLong(numberTxtField.getText());
			if (addRdoBtn.isSelected()) {

				if (iterativeRdoBtn.isSelected()) {
					restart();

					career = new Career(number, 1);
					TimeThreadArraylist ttarraylist = new TimeThreadArraylist(this, 1);
					AddArraylistThread aat = new AddArraylistThread(career, this, ttarraylist);

					TimeThreadLinkedList ttll = new TimeThreadLinkedList(this, 1);
					AddLinkedListThread allt = new AddLinkedListThread(career, this, ttll);

					TimeThreadABB tt = new TimeThreadABB(this, 1);
					AddABBThread aabbt = new AddABBThread(career, this, tt);

					aabbt.start();
					allt.start();
					aat.start();
				} else if (recursiveRdoBtn.isSelected()) {
					restart();
					career = new Career(number, 2);
					TimeThreadArraylist ttarraylist = new TimeThreadArraylist(this, 2);
					AddArraylistThread aat = new AddArraylistThread(career, this, ttarraylist);

					TimeThreadLinkedList ttll = new TimeThreadLinkedList(this, 2);
					AddLinkedListThread allt = new AddLinkedListThread(career, this, ttll);

					TimeThreadABB ttabb = new TimeThreadABB(this, 2);
					AddABBThread aabbt = new AddABBThread(career, this, ttabb);

					aat.start();
					allt.start();
					aabbt.start();
				}
			} else if (searchRdoBtn.isSelected()) {

				if (iterativeRdoBtn.isSelected()) {
					restart();

					career = new Career(number, 1);
					career.addIteratively();
					TimeThreadArraylist tta = new TimeThreadArraylist(this, 3);
					SearchArraylistThread sat = new SearchArraylistThread(career, this, tta);

					TimeThreadLinkedList ttll = new TimeThreadLinkedList(this, 3);
					SearchLinkedListThread slt = new SearchLinkedListThread(career, this, ttll);

					TimeThreadABB ttabb = new TimeThreadABB(this, 3);
					SearchABBThread sabbt = new SearchABBThread(career, this, ttabb);

					sabbt.start();
					sat.start();
					slt.start();
				} else if (recursiveRdoBtn.isSelected()) {
					restart();

					career = new Career(number, 2);
					career.addIteratively();

					TimeThreadArraylist tta = new TimeThreadArraylist(this, 4);
					SearchArraylistThread sat = new SearchArraylistThread(career, this, tta);

					TimeThreadLinkedList ttll = new TimeThreadLinkedList(this, 4);
					SearchLinkedListThread slt = new SearchLinkedListThread(career, this, ttll);

					TimeThreadABB ttabb = new TimeThreadABB(this, 4);
					SearchABBThread sabbt = new SearchABBThread(career, this, ttabb);

					sabbt.start();
					sat.start();
					slt.start();
				}
			} else if (deleteRdoBtn.isSelected()) {
				if (iterativeRdoBtn.isSelected()) {
					restart();

					career = new Career(number, 1);
					career.addIteratively();

					TimeThreadArraylist tta = new TimeThreadArraylist(this, 5);
					DeleteArraylistThread dat = new DeleteArraylistThread(career, this, tta);

					TimeThreadLinkedList ttll = new TimeThreadLinkedList(this, 5);
					DeleteLinkedListThread dlt = new DeleteLinkedListThread(career, this, ttll);

					TimeThreadABB ttabb = new TimeThreadABB(this, 5);
					DeleteABBThread dabbt = new DeleteABBThread(career, this, ttabb);
					dat.start();
					dlt.start();
					dabbt.start();

				} else if (recursiveRdoBtn.isSelected()) {
					restart();

					career = new Career(number, 2);
					career.addIteratively();
					TimeThreadArraylist tta = new TimeThreadArraylist(this, 6);
					DeleteArraylistThread dat = new DeleteArraylistThread(career, this, tta);

					TimeThreadLinkedList ttll = new TimeThreadLinkedList(this, 6);
					DeleteLinkedListThread dlt = new DeleteLinkedListThread(career, this, ttll);

					TimeThreadABB ttabb = new TimeThreadABB(this, 6);
					DeleteABBThread dabbt = new DeleteABBThread(career, this, ttabb);
					dat.start();
					dlt.start();
					dabbt.start();

				}
			}
		} catch (NumberFormatException nfe) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("You have to enter a number in the field");

			alert.showAndWait();
		} catch (StackOverflowError sof) {

		}
	}

//	public void updateGUI() {
////		timeKeeperTxtField.setText(career.getArraylistal().getNodes().get(9).getContent() + "");
//		timeKeeper();
//	}

}
