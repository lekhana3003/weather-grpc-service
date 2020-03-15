package com.project.weather.resource;

import io.grpc.ManagedChannel;
import com.project.weather.grpc.*;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

public class WeatherServiceClient {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(WeatherServiceClient.class);
    private weatherServiceGrpc.weatherServiceBlockingStub weatherServiceBlockingStubObj;

    @PostConstruct
    public void init(){
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 6565).usePlaintext().build();

        weatherServiceBlockingStubObj=weatherServiceGrpc.newBlockingStub(managedChannel);
    }
    public void getData(){

        city cityObj=city.newBuilder().setCityName("Bangalore").build();
        LOGGER.info("client sending {}", cityObj);

        weatherData wd=weatherServiceBlockingStubObj.sendCity(cityObj);
        LOGGER.info("client received {}", wd);
       System.out.println(wd.getTemperature());
    }
}
