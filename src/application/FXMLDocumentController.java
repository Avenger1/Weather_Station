package application;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FXMLDocumentController {
	
    @FXML 
    private javafx.scene.control.Button exit;
    @FXML
	private void exit_program(ActionEvent e) throws Exception{
		exit.setOnAction(actionEvent -> Platform.exit());
	}
   
    private WeatherData dataAccessor ;
	
	
	
	@SuppressWarnings("unchecked")
	@FXML
	private void HandleButtonActionToWykresy(ActionEvent e) throws Exception{
        dataAccessor = new WeatherData("com.mysql.jdbc.Driver","jdbc:mysql://91.205.75.118:3306/bartez_meteo?zeroDateTimeBehavior=convertToNull","bartez_meteo","meteo"); 

        TableView<Weather> personTable = new TableView<>();
        TableColumn<Weather, String> tempMinCol = new TableColumn<>("Temperatura minimalna");
        tempMinCol.setCellValueFactory(new PropertyValueFactory<>("tempMin"));
        TableColumn<Weather, String> tempMaksCol = new TableColumn<>("Temperatura maksymalna");
        tempMaksCol.setCellValueFactory(new PropertyValueFactory<>("tempMaks"));
        TableColumn<Weather, String> dataPomiaruCol = new TableColumn<>("Data pomiaru");
        dataPomiaruCol.setCellValueFactory(new PropertyValueFactory<>("dataPomiaru"));
        TableColumn<Weather, String> wilgotnoscCol = new TableColumn<>("Wilgotnosc");
        wilgotnoscCol.setCellValueFactory(new PropertyValueFactory<>("wilgotnosc"));

        personTable.getColumns().addAll(tempMinCol, tempMaksCol, wilgotnoscCol, dataPomiaruCol);

        personTable.getItems().addAll(dataAccessor.getPersonList());

        BorderPane root = new BorderPane();
        Stage stage = new Stage();
        stage.setTitle("Historia");
        root.setCenter(personTable);
        Scene scene = new Scene(root, 550, 400);
        stage.setScene(scene);
        stage.show();
		
	}
}

