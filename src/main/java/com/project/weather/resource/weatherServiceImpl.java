package com.project.weather.resource;

import com.project.weather.grpc.*;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class weatherServiceImpl extends weatherServiceGrpc.weatherServiceImplBase{
    private static final Logger LOGGER = LoggerFactory.getLogger(weatherServiceImpl.class);

    @Override
    public void sendCity(city request, StreamObserver<weatherData> responseObserver) {
        LOGGER.info("server received {}", request);
        weatherData wd= weatherData.newBuilder().setTemperature(12.0f).setPressure(336f).build();
        LOGGER.info("server responded {}", wd);
        responseObserver.onNext(wd);
        responseObserver.onCompleted();
    }
}
