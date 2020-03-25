package com.project.weather.Document;

import com.project.weather.grpc.Pressure;
import com.project.weather.grpc.Temperature;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class WeatherInfo {

    @Id
    String id;
    String cityName;
    Float temperature;
    Float pressure;

    public WeatherInfo(String id, String cityName, Float temperature, Float pressure) {
        this.id = id;
        this.cityName = cityName;
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public WeatherInfo(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }
}
