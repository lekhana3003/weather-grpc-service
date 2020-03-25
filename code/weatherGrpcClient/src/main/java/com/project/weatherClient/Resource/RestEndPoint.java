package com.project.weatherClient.Resource;


import com.netflix.discovery.EurekaClient;
import com.project.weather.grpc.City;
import com.project.weather.grpc.WeatherData;
import com.project.weatherClient.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.net.ssl.SSLException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RestEndPoint {
    @Autowired
    GrpcClient gc;


    @Autowired
    private EurekaClient client;

        @GetMapping("/getWeatherData/{city}")
    public String getWeatherData(@PathVariable String city) throws SSLException {

            WeatherData wd=gc.getWeatherData(city);
        return wd.toString();
    }
    @GetMapping("getCityWithTemp/{temp}")
    public String getCityWithTemp(@PathVariable Float temp)
    {

       List<City> cities=gc.getCityWithTemp(temp);
        return cities.toString();
    }
    @GetMapping("getCityWithPress/{press}")
    public String getCityWithPress(@PathVariable Float press)
    {
        ArrayList<City> cities= (ArrayList<City>) gc.getCityWithPress(press);
        return cities.toString();
    }
}
