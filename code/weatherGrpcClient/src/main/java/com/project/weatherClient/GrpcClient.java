package com.project.weatherClient;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import com.netflix.discovery.shared.Applications;
import com.project.weather.grpc.*;
import io.grpc.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.net.ssl.SSLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@EnableDiscoveryClient
@EnableEurekaClient
public class GrpcClient {

    @Autowired
    private EurekaClient client;
    private WeatherServiceGrpc.WeatherServiceBlockingStub stub;

@PostConstruct
    public void init()
    {
        final InstanceInfo instanceInfo = client.getNextServerFromEureka("WEATHER-DATA-SERVICE", false);
        final ManagedChannel channel = ManagedChannelBuilder.forAddress(instanceInfo.getIPAddr(), instanceInfo.getPort())
                .usePlaintext()
                .build();
        stub = WeatherServiceGrpc.newBlockingStub(channel);
    }

    public WeatherData getWeatherData(String cityName) throws SSLException {

        City city= City.newBuilder().setCityName(cityName).build();
        WeatherData wd=stub.sendCity(city);
        return wd;


    }

    public List<City> getCityWithTemp( Float temperature)
    {
        List<City> cities = new ArrayList<City>();
        Temperature temp= Temperature.newBuilder().setTempValue(temperature).build();
        Iterator<City> listCity= stub.sendTemperature(temp);
        while (listCity.hasNext())
        {
            cities.add(listCity.next());
        }
        return cities;
    }

    public List<City> getCityWithPress( Float pressure)
    {
        List<City> cities = new ArrayList<City>();
        Pressure press= Pressure.newBuilder().setPressValue(pressure).build();
        Iterator<City> listCity= stub.sendPressure(press);
        while (listCity.hasNext())
        {
            cities.add(listCity.next());
        }
        return cities;

    }
}
