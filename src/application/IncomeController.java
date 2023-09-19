package application;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import income.*;


public class IncomeController implements Initializable {
	
	//標題
	@FXML private Label title;
	
	//換scene
	@FXML private Button switchToSpendingScene;
	@FXML private Button switchToGraphScene;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	//日期
	@FXML private Label dateL;
	@FXML private Label date;
	@FXML private DatePicker myDatePicker;
	String myFormattedDate = new String();
	
	//選擇種類
	@FXML private Label categoryL;
	@FXML private ChoiceBox <String> incomeChoiceBox;
	private String[] categoryOfIncome = 
		{"Wage","Allowance","Investment","Gambling"};
	@FXML private Label category;
	
	//寫上金額
	@FXML private Label moneyL;
	@FXML private Label money;
	@FXML private Label NTD;
	
	//數字鍵盤
	@FXML private Button button1;
	@FXML private Button button2;
	@FXML private Button button3;
	@FXML private Button button4;
	@FXML private Button button5;
	@FXML private Button button6;
	@FXML private Button button7;
	@FXML private Button button8;
	@FXML private Button button9;
	@FXML private Button button0;
	@FXML private Button button00;
	@FXML private Button AC;
	@FXML private Button Back;
	@FXML private Button OK;
	private int stringLength = 0;
	String moneyString = new String();
	
	
	//紀錄收入Data
	@FXML private Button recordData;
	String categoryValue = new String();
	public static String categoryString = new String();
	
	String dateString = new String();
	public static int month = 0;
	public static int earn = 0;
	
	
	
	
	//換scene
	public void switchToSpendingScene(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Spending.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToGraphScene(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("IncomeGraph.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	//選日期
	public void getDate(ActionEvent event) {
		LocalDate myDate = myDatePicker.getValue();
		myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("MM-dd-2021"));
		date.setText(myFormattedDate);
	}
	
	//選種類
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		incomeChoiceBox.getItems().addAll(categoryOfIncome);
		incomeChoiceBox.setOnAction(this::getCategory);
	}
	
	public void getCategory(ActionEvent event) {
		categoryValue = (String) incomeChoiceBox.getValue();
		category.setText(categoryValue);
	}
	
	
	//寫上金額+數字鍵盤
	@FXML
	public void keyPressed(KeyEvent event) {
		System.out.println(event.getCode().getName());
		switch (event.getCode()) {
    	case A:
    		AC();
    		break;
    	case BACK_SPACE:
    		back();
    		break;
    	case ENTER:
    		OK();
    		break;
    	case DIGIT0:
    		press("0");
    		break;
    	case NUMPAD0:
    		press("0");
    		break;
    	case DIGIT1:
    		press("1");
    		break;
    	case NUMPAD1:
    		press("1");
    		break;	
    	case DIGIT2:
    		press("2");
    		break;
    	case NUMPAD2:
    		press("2");
    		break;	
    	case DIGIT3:
    		press("3");
    		break;
    	case NUMPAD3:
    		press("3");
    		break;	
    	case DIGIT4:
    		press("4");
    		break;
    	case NUMPAD4:
    		press("4");
    		break;	
    	case DIGIT5:
    		press("5");
    		break;
    	case NUMPAD5:
    		press("5");
    		break;	
    	case DIGIT6:
    		press("6");
    		break;
    	case NUMPAD6:
    		press("6");
    		break;	
    	case DIGIT7:
    		press("7");
    		break;
    	case NUMPAD7:
    		press("7");
    		break;	
    	case DIGIT8:
    		press("8");
    		break;
    	case NUMPAD8:
    		press("8");
    		break;	
    	case DIGIT9:
    		press("9");
    		break;
    	case NUMPAD9:
    		press("9");
    		break;	
    	default:
            break;
		}
	}
	
	public void num(ActionEvent e) {
		Button a = (Button)e.getSource();
		press(a.getText());
	}
	
	public void press(String input) {
		money.setText(money.getText()+input);
		stringLength++;
	}
	
	public void back() {
		if(stringLength >0) {
			money.setText(money.getText().substring(0, stringLength-1));
			stringLength--;	
		}
		else if(stringLength == 0) {
			money.setText("");
		}
	}
	
	public void AC() {
		stringLength = 0;
		money.setText("");
	}
	
	public void OK() {
		moneyString = money.getText(); //把金額存起來
	}
	
	public void method00() {
		int i = Integer.parseInt(money.getText());
		i = i*100;
		String k = String.valueOf(i);
		money.setText(k);
	}
	
	//存取所有資料
	public void pressToRecordTheData() {
		categoryString = categoryValue;//把種類存起來
		
		dateString = date.getText(); //把日期存起來
		month = Integer.parseInt((dateString).substring(0,2));
		
		moneyString = money.getText(); //把金額存起來
		
		earn = Integer.parseInt(moneyString);//把金額從String轉成int
		
		judgeCategory();
		
		finishRecord();
	}
	
	public void judgeCategory() {
		if(categoryString.equals("Wage")) 
			Wage.addTotalOfMonth();
		else if(categoryString.equals("Allowance")) 
			Allowance.addTotalOfMonth();
		else if(categoryString.equals("Investment")) 
			Investment.addTotalOfMonth();
		else if(categoryString.equals("Gambling")) 
			Gambling.addTotalOfMonth();
	}
	
	public void finishRecord() {
		date.setText("");
		category.setText("");
		money.setText("");
	}

}