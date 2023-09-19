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
import spending.*;


public class SpendingGraphController implements Initializable{
	
	//標題
	@FXML private Label title;
	
	//換scene
	@FXML private Button switchToSpendingScene;
	@FXML private Button switchToIncomeGraphScene;
	
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
	@FXML private Label wholeYearSpendingDistribution;
	@FXML public PieChart pieChartT;
	
	
	//圓餅圖
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<PieChart.Data> pieChartDataT =
                FXCollections.observableArrayList(
                new PieChart.Data("Food", Food.getTotalOfEachCategory()),
                new PieChart.Data("Clothes", Clothes.getTotalOfEachCategory()),
                new PieChart.Data("Drinks", Drinks.getTotalOfEachCategory()),
                new PieChart.Data("DailySupplies", DailySupplies.getTotalOfEachCategory()),
                new PieChart.Data("HairAndCosmetic", HairAndCosmetic.getTotalOfEachCategory()),
                new PieChart.Data("Gathering", Gathering.getTotalOfEachCategory()),
                new PieChart.Data("Studying", Studying.getTotalOfEachCategory()),
                new PieChart.Data("Hobbies", Hobbies.getTotalOfEachCategory()),
                new PieChart.Data("Traffic", Traffic.getTotalOfEachCategory()),
                new PieChart.Data("Health", Health.getTotalOfEachCategory()),
                new PieChart.Data("Else", Else.getTotalOfEachCategory()));
		
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
	public void switchToIncomeGraphScene(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("IncomeGraph.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToSpendingScene(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Spending.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	//換月份圖表
	public void switchToJanSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("S1.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToFebSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("S2.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToMarSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("S3.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToAprSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("S4.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToMaySpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("S5.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToJunSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("S6.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToJulSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("S7.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToAugSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("S8.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToSepSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("S9.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToOctSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("S10.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToNovSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("S11.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToDecSpending(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("S12.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}
