package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class WeatherDetails {
	
	
	private SimpleStringProperty temperatura;
	private SimpleStringProperty data;

    //Default constructor
    public WeatherDetails(String temperatura) {
        this.temperatura = new SimpleStringProperty(temperatura);
        //this.data = new SimpleStringProperty(data);
       
    }

    //Getters
    public String getTemperatura() {
        return temperatura.get();
    }

    public String getData() {
        return data.get();
    }

    

    //Setters
    public void setTemperatura(String value) {
        temperatura.set(value);
    }

    public void setData(String value) {
        data.set(value);
    }

   

    //Property values
    public StringProperty nameProperty() {
        return temperatura;
    }

    public StringProperty emailProperty() {
        return data;
    }

}
