package io.grpc.keystore;

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

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.32.1)",
    comments = "Source: KeyStore.proto")
public final class KeyStoreGrpc {

  private KeyStoreGrpc() {}

  public static final String SERVICE_NAME = "keystore.KeyStore";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.keystore.PutRequest,
      io.grpc.keystore.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "put",
      requestType = io.grpc.keystore.PutRequest.class,
      responseType = io.grpc.keystore.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.keystore.PutRequest,
      io.grpc.keystore.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<io.grpc.keystore.PutRequest, io.grpc.keystore.PutResponse> getPutMethod;
    if ((getPutMethod = KeyStoreGrpc.getPutMethod) == null) {
      synchronized (KeyStoreGrpc.class) {
        if ((getPutMethod = KeyStoreGrpc.getPutMethod) == null) {
          KeyStoreGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<io.grpc.keystore.PutRequest, io.grpc.keystore.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.keystore.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.keystore.PutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyStoreMethodDescriptorSupplier("put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.keystore.GetRequest,
      io.grpc.keystore.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = io.grpc.keystore.GetRequest.class,
      responseType = io.grpc.keystore.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.keystore.GetRequest,
      io.grpc.keystore.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<io.grpc.keystore.GetRequest, io.grpc.keystore.GetResponse> getGetMethod;
    if ((getGetMethod = KeyStoreGrpc.getGetMethod) == null) {
      synchronized (KeyStoreGrpc.class) {
        if ((getGetMethod = KeyStoreGrpc.getGetMethod) == null) {
          KeyStoreGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<io.grpc.keystore.GetRequest, io.grpc.keystore.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.keystore.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.keystore.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyStoreMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.keystore.GetAllRequest,
      io.grpc.keystore.KeyResponse> getGetAllKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllKeys",
      requestType = io.grpc.keystore.GetAllRequest.class,
      responseType = io.grpc.keystore.KeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.keystore.GetAllRequest,
      io.grpc.keystore.KeyResponse> getGetAllKeysMethod() {
    io.grpc.MethodDescriptor<io.grpc.keystore.GetAllRequest, io.grpc.keystore.KeyResponse> getGetAllKeysMethod;
    if ((getGetAllKeysMethod = KeyStoreGrpc.getGetAllKeysMethod) == null) {
      synchronized (KeyStoreGrpc.class) {
        if ((getGetAllKeysMethod = KeyStoreGrpc.getGetAllKeysMethod) == null) {
          KeyStoreGrpc.getGetAllKeysMethod = getGetAllKeysMethod =
              io.grpc.MethodDescriptor.<io.grpc.keystore.GetAllRequest, io.grpc.keystore.KeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.keystore.GetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.keystore.KeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyStoreMethodDescriptorSupplier("getAllKeys"))
              .build();
        }
      }
    }
    return getGetAllKeysMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeyStoreStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyStoreStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyStoreStub>() {
        @java.lang.Override
        public KeyStoreStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyStoreStub(channel, callOptions);
        }
      };
    return KeyStoreStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeyStoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyStoreBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyStoreBlockingStub>() {
        @java.lang.Override
        public KeyStoreBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyStoreBlockingStub(channel, callOptions);
        }
      };
    return KeyStoreBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeyStoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyStoreFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyStoreFutureStub>() {
        @java.lang.Override
        public KeyStoreFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyStoreFutureStub(channel, callOptions);
        }
      };
    return KeyStoreFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeyStoreImplBase implements io.grpc.BindableService {

    /**
     */
    public void put(io.grpc.keystore.PutRequest request,
        io.grpc.stub.StreamObserver<io.grpc.keystore.PutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     */
    public void get(io.grpc.keystore.GetRequest request,
        io.grpc.stub.StreamObserver<io.grpc.keystore.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void getAllKeys(io.grpc.keystore.GetAllRequest request,
        io.grpc.stub.StreamObserver<io.grpc.keystore.KeyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllKeysMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.keystore.PutRequest,
                io.grpc.keystore.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.keystore.GetRequest,
                io.grpc.keystore.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getGetAllKeysMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                io.grpc.keystore.GetAllRequest,
                io.grpc.keystore.KeyResponse>(
                  this, METHODID_GET_ALL_KEYS)))
          .build();
    }
  }

  /**
   */
  public static final class KeyStoreStub extends io.grpc.stub.AbstractAsyncStub<KeyStoreStub> {
    private KeyStoreStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyStoreStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyStoreStub(channel, callOptions);
    }

    /**
     */
    public void put(io.grpc.keystore.PutRequest request,
        io.grpc.stub.StreamObserver<io.grpc.keystore.PutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(io.grpc.keystore.GetRequest request,
        io.grpc.stub.StreamObserver<io.grpc.keystore.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllKeys(io.grpc.keystore.GetAllRequest request,
        io.grpc.stub.StreamObserver<io.grpc.keystore.KeyResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllKeysMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeyStoreBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeyStoreBlockingStub> {
    private KeyStoreBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyStoreBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyStoreBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.keystore.PutResponse put(io.grpc.keystore.PutRequest request) {
      return blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.keystore.GetResponse get(io.grpc.keystore.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<io.grpc.keystore.KeyResponse> getAllKeys(
        io.grpc.keystore.GetAllRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllKeysMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeyStoreFutureStub extends io.grpc.stub.AbstractFutureStub<KeyStoreFutureStub> {
    private KeyStoreFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyStoreFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyStoreFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.keystore.PutResponse> put(
        io.grpc.keystore.PutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.keystore.GetResponse> get(
        io.grpc.keystore.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_GET_ALL_KEYS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeyStoreImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeyStoreImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT:
          serviceImpl.put((io.grpc.keystore.PutRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.keystore.PutResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((io.grpc.keystore.GetRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.keystore.GetResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_KEYS:
          serviceImpl.getAllKeys((io.grpc.keystore.GetAllRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.keystore.KeyResponse>) responseObserver);
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

  private static abstract class KeyStoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeyStoreBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.keystore.KeyStoreProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeyStore");
    }
  }

  private static final class KeyStoreFileDescriptorSupplier
      extends KeyStoreBaseDescriptorSupplier {
    KeyStoreFileDescriptorSupplier() {}
  }

  private static final class KeyStoreMethodDescriptorSupplier
      extends KeyStoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeyStoreMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeyStoreGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeyStoreFileDescriptorSupplier())
              .addMethod(getPutMethod())
              .addMethod(getGetMethod())
              .addMethod(getGetAllKeysMethod())
              .build();
        }
      }
    }
    return result;
  }
}
