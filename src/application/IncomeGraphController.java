package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import income.*;


public class IncomeGraphController implements Initializable{
	
	//標題
	@FXML private Label title;
	
	//換scene
	@FXML private Button switchToIncomeScene;
	@FXML private Button switchToSpendingGraphScene;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	//月份
	@FXML private Button Jan;
	@FXML private Button Feb;
	@FXML private Button Mar;
	@FXML private Button Apr;
	@FXML private Button May;
	@FXML private Button Jun;
	@FXML private Button Jul;
	@FXML private Button Aug;
	@FXML private Button Sep;
	@FXML private Button Oct;
	@FXML private Button Nov;
	@FXML private Button Dec;
	
	//圓餅圖
	@FXML private Label wholeYearIncomeDistribution;
	@FXML public PieChart pieChartT;
	
	
	//圓餅圖
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<PieChart.Data> pieChartDataT =
                FXCollections.observableArrayList(
                new PieChart.Data("Wage", Wage.getTotalOfEachCategory()),
                new PieChart.Data("Allowance", Allowance.getTotalOfEachCategory()),
                new PieChart.Data("Investment", Investment.getTotalOfEachCategory()),
                new PieChart.Data("Gambling", Gambling.getTotalOfEachCategory())
                );
		
		pieChartDataT.forEach(data ->
				data.nameProperty().bind(
						Bindings.concat(
								data.getName() , " spends : " ,data.pieValueProperty()
						)
						
				)
				
		);
		
        pieChartT.getData().addAll(pieChartDataT);
	}
	
	//換Scene
	public void switchToSpendingGraphScene(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("SpendingGraph.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToIncomeScene(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Income.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	//換月份圖表
	public void switchToJanSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("I1.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToFebSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("I2.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToMarSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("I3.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToAprSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("I4.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToMaySpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("I5.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToJunSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("I6.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToJulSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("I7.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToAugSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("I8.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToSepSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("I9.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToOctSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("I10.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToNovSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("I11.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToDecSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("I12.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}
