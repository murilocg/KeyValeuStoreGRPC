package client.handler;

import client.exception.MissingParamException;
import io.grpc.keystore.KeyStoreGrpc;

public abstract class Handler {
	
	protected final KeyStoreGrpc.KeyStoreBlockingStub blockingStub;

	public Handler(KeyStoreGrpc.KeyStoreBlockingStub blockingStub, String... args) throws MissingParamException {
		this.blockingStub = blockingStub;
		this.parseParams(args);
	}
	
	public abstract void handle();

	public abstract void parseParams(String... args) throws MissingParamException;

}
