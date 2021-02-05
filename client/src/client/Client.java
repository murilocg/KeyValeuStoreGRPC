package client;

import java.util.concurrent.TimeUnit;

import client.exception.InvalidActionException;
import client.exception.MissingParamException;
import client.handler.Handler;
import client.handler.HandlerBuilder;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.keystore.KeyStoreGrpc;

public class Client {

	public static void main(String[] args) throws Exception {
		String server = args.length > 0 ? args[0] : "";
		ManagedChannel channel = ManagedChannelBuilder.forTarget(server).usePlaintext().build();
		try {
			KeyStoreGrpc.KeyStoreBlockingStub blockingStub = KeyStoreGrpc.newBlockingStub(channel);
			Handler handler = HandlerBuilder.build(blockingStub, args);
			handler.handle();
		}catch (InvalidActionException | MissingParamException e) {
			System.err.println(e.getMessage());
		} finally {
			channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
		}
	}
}
