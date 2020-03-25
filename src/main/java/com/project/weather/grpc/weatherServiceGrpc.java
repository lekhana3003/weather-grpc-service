package com.project.weather.grpc;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import io.grpc.stub.*;
/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.27.2)",
    comments = "Source: weatherCommunication.proto")
public final class weatherServiceGrpc {

  private weatherServiceGrpc() {}

  public static final String SERVICE_NAME = "weatherService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<city,
      weatherData> getSendCityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendCity",
      requestType = city.class,
      responseType = weatherData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<city,
      weatherData> getSendCityMethod() {
    io.grpc.MethodDescriptor<city, weatherData> getSendCityMethod;
    if ((getSendCityMethod = weatherServiceGrpc.getSendCityMethod) == null) {
      synchronized (weatherServiceGrpc.class) {
        if ((getSendCityMethod = weatherServiceGrpc.getSendCityMethod) == null) {
          weatherServiceGrpc.getSendCityMethod = getSendCityMethod =
              io.grpc.MethodDescriptor.<city, weatherData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendCity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  city.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  weatherData.getDefaultInstance()))
              .setSchemaDescriptor(new weatherServiceMethodDescriptorSupplier("sendCity"))
              .build();
        }
      }
    }
    return getSendCityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static weatherServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<weatherServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<weatherServiceStub>() {
        @java.lang.Override
        public weatherServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new weatherServiceStub(channel, callOptions);
        }
      };
    return weatherServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static weatherServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<weatherServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<weatherServiceBlockingStub>() {
        @java.lang.Override
        public weatherServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new weatherServiceBlockingStub(channel, callOptions);
        }
      };
    return weatherServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static weatherServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<weatherServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<weatherServiceFutureStub>() {
        @java.lang.Override
        public weatherServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new weatherServiceFutureStub(channel, callOptions);
        }
      };
    return weatherServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class weatherServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendCity(city request,
        io.grpc.stub.StreamObserver<weatherData> responseObserver) {
      asyncUnimplementedUnaryCall(getSendCityMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendCityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                city,
                weatherData>(
                  this, METHODID_SEND_CITY)))
          .build();
    }
  }

  /**
   */
  public static final class weatherServiceStub extends io.grpc.stub.AbstractAsyncStub<weatherServiceStub> {
    private weatherServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected weatherServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new weatherServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendCity(city request,
        io.grpc.stub.StreamObserver<weatherData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendCityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class weatherServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<weatherServiceBlockingStub> {
    private weatherServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected weatherServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new weatherServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public weatherData sendCity(city request) {
      return blockingUnaryCall(
          getChannel(), getSendCityMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class weatherServiceFutureStub extends io.grpc.stub.AbstractFutureStub<weatherServiceFutureStub> {
    private weatherServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected weatherServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new weatherServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<weatherData> sendCity(
        city request) {
      return futureUnaryCall(
          getChannel().newCall(getSendCityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_CITY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final weatherServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(weatherServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_CITY:
          serviceImpl.sendCity((city) request,
              (io.grpc.stub.StreamObserver<weatherData>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class weatherServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    weatherServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return WeatherCommunication.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("weatherService");
    }
  }

  private static final class weatherServiceFileDescriptorSupplier
      extends weatherServiceBaseDescriptorSupplier {
    weatherServiceFileDescriptorSupplier() {}
  }

  private static final class weatherServiceMethodDescriptorSupplier
      extends weatherServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    weatherServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (weatherServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new weatherServiceFileDescriptorSupplier())
              .addMethod(getSendCityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
