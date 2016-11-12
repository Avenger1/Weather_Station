package application;

import javafx.beans.property.StringProperty ;
import javafx.beans.property.SimpleStringProperty ;

public class Weather {
    private final StringProperty tempMin = new SimpleStringProperty(this, "tempMin");
    public StringProperty tempMinProperty() {
        return tempMin ;
    }
    public final String gettempMin() {
        return tempMinProperty().get();
    }
    public final void settempMin(String tempMin) {
        tempMinProperty().set(tempMin);
    }

    private final StringProperty tempMaks = new SimpleStringProperty(this, "tempMaks");
    public StringProperty tempMaksProperty() {
        return tempMaks ;
    }
    public final String gettempMaks() {
        return tempMaksProperty().get();
    }
    public final void settempMaks(String tempMaks) {
        tempMaksProperty().set(tempMaks);
    }
    
    private final StringProperty wilgotnosc = new SimpleStringProperty(this, "wilgotnosc");
    public StringProperty wilgotnoscProperty() {
        return wilgotnosc ;
    }
    public final String getwilgotnosc() {
        return wilgotnoscProperty().get();
    }
    public final void setwilgotnosc(String wilgotnosc) {
        wilgotnoscProperty().set(wilgotnosc);
    }

    private final StringProperty dataPomiaru = new SimpleStringProperty(this, "dataPomiaru");
    public StringProperty dataPomiaruProperty() {
        return dataPomiaru ;
    }
    public final String getdataPomiaru() {
        return dataPomiaruProperty().get();
    }
    public final void setdataPomiaru(String dataPomiaru) {
        dataPomiaruProperty().set(dataPomiaru);
    }

    public Weather(String tempMin, String tempMaks, String dataPomiaru, String wilgotnosc) {
        settempMin(tempMin+"*C");
        settempMaks(tempMaks+"*C");
        setwilgotnosc(wilgotnosc+"%");
        setdataPomiaru(dataPomiaru);
    }
}
