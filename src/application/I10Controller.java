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

public class I10Controller implements Initializable {
	
	//¼ÐÃD
	@FXML private Label title;
	
	//´«scene
	@FXML private Button switchToIncomeScene;
	@FXML private Button switchToIncomeGraphScene;
		
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	//¶ê»æ¹Ï
	@FXML public PieChart pieChart10;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<PieChart.Data> pieChartData10 =
                FXCollections.observableArrayList(
                		 new PieChart.Data("Wage", Wage.moneyWage10),
                         new PieChart.Data("Allowance", Allowance.moneyAllowance10),
                         new PieChart.Data("Investment", Investment.moneyInvest10),
                         new PieChart.Data("Gambling", Gambling.moneyGambling10));
		
		pieChartData10.forEach(data ->
				data.nameProperty().bind(
						Bindings.concat(
								data.getName() , " spends : " ,data.pieValueProperty()
						)
						
				)
				
		);
		
        pieChart10.getData().addAll(pieChartData10);
	}
	
	//´«Scene
	public void switchToIncomeScene(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Income.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToIncomeGraphScene(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("IncomeGraph.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
