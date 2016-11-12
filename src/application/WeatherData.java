package application;

import java.sql.* ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.Statement ;
import java.sql.ResultSet ;

import java.util.List ;
import java.util.ArrayList ;

public class WeatherData {

    private Connection connection ;

    public WeatherData(String driverClassName, String dbURL, String user, String password) throws SQLException, ClassNotFoundException {
        Class.forName(driverClassName);
        connection = DriverManager.getConnection(dbURL, user, password);
    }

    public void shutdown() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    public List<Weather> getPersonList() throws SQLException {
        try (
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from meteo");
        ){
            List<Weather> personList = new ArrayList<>();
            while (rs.next()) {
                String tempMin = rs.getString("temp_wew_db");
                String tempMaks = rs.getString("temp_zew_db");
                String dataPomiaru = rs.getString("data");
                String wilgotnosc = rs.getString("wilgotnosc");
                Weather person = new Weather(tempMin, tempMaks, dataPomiaru, wilgotnosc);
                personList.add(person);
            }
            return personList ;
        } 
    }
}