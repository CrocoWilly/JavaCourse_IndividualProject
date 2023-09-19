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

public class S1Controller implements Initializable {
	
	//¼ÐÃD
	@FXML private Label title;
	
	//´«scene
	@FXML private Button switchToSpendingScene;
	@FXML private Button switchToSpendingGraphScene;
		
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	//¶ê»æ¹Ï
	@FXML public PieChart pieChart1;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<PieChart.Data> pieChartData1 =
                FXCollections.observableArrayList(
                new PieChart.Data("Food", Food.moneyFood1),
                new PieChart.Data("Clothes", Clothes.moneyClothes1),
                new PieChart.Data("Drinks", Drinks.moneyDrinks1),
                new PieChart.Data("DailySupplies", DailySupplies.moneyDaily1),
                new PieChart.Data("HairAndCosmetic", HairAndCosmetic.moneyHair1),
                new PieChart.Data("Gathering", Gathering.moneyGathering1),
                new PieChart.Data("Studying", Studying.moneyStudying1),
                new PieChart.Data("Hobbies", Hobbies.moneyHobbies1),
                new PieChart.Data("Traffic", Traffic.moneyTraffic1),
                new PieChart.Data("Health", Health.moneyHealth1),
                new PieChart.Data("Else", Else.moneyElse1));
		
		pieChartData1.forEach(data ->
				data.nameProperty().bind(
						Bindings.concat(
								data.getName() , " spends : " ,data.pieValueProperty()
						)
						
				)
				
		);
		
        pieChart1.getData().addAll(pieChartData1);
	}
	
	//´«Scene
	public void switchToSpendingScene(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Spending.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToSpendingGraphScene(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("SpendingGraph.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
