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
import spending.Clothes;
import spending.DailySupplies;
import spending.Drinks;
import spending.Else;
import spending.Food;
import spending.Gathering;
import spending.HairAndCosmetic;
import spending.Health;
import spending.Hobbies;
import spending.Studying;
import spending.Traffic;

public class S5Controller implements Initializable {
	
	//���D
	@FXML private Label title;
	
	//��scene
	@FXML private Button switchToSpendingScene;
	@FXML private Button switchToSpendingGraphScene;
		
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	//����
	@FXML public PieChart pieChart5;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<PieChart.Data> pieChartData5 =
                FXCollections.observableArrayList(
                new PieChart.Data("Food", Food.moneyFood5),
                new PieChart.Data("Clothes", Clothes.moneyClothes5),
                new PieChart.Data("Drinks", Drinks.moneyDrinks5),
                new PieChart.Data("DailySupplies", DailySupplies.moneyDaily5),
                new PieChart.Data("HairAndCosmetic", HairAndCosmetic.moneyHair5),
                new PieChart.Data("Gathering", Gathering.moneyGathering5),
                new PieChart.Data("Studying", Studying.moneyStudying5),
                new PieChart.Data("Hobbies", Hobbies.moneyHobbies5),
                new PieChart.Data("Traffic", Traffic.moneyTraffic5),
                new PieChart.Data("Health", Health.moneyHealth5),
                new PieChart.Data("Else", Else.moneyElse5));
		
		pieChartData5.forEach(data ->
				data.nameProperty().bind(
						Bindings.concat(
								data.getName() , " spends : " ,data.pieValueProperty()
						)
						
				)
				
		);
		
        pieChart5.getData().addAll(pieChartData5);
	}
	
	//��Scene
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
