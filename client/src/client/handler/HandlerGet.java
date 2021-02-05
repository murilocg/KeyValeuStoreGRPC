package client.handler;

import client.exception.MissingParamException;
import io.grpc.StatusRuntimeException;
import io.grpc.keystore.GetRequest;
import io.grpc.keystore.GetResponse;
import io.grpc.keystore.KeyStoreGrpc.KeyStoreBlockingStub;

public class HandlerGet extends Handler {

	private String key;

	public HandlerGet(KeyStoreBlockingStub blockingStub, String... args) throws MissingParamException {
		super(blockingStub, args);
	}

	@Override
	public void handle() {
		GetRequest req = GetRequest.newBuilder().setKey(key).build();
		try {
			GetResponse res = blockingStub.get(req);
			if (!res.getValue().isEmpty())
				System.out.println("The value for the key " + this.key + " is: " + res.getValue());
			else
				System.err.println("The Key not found!");
		} catch (StatusRuntimeException e) {
			System.err.println(e);
		}

	}

	@Override
	public void parseParams(String... args) throws MissingParamException {
		key = args.length > 2 ? args[2] : "";
		if (key.isEmpty())
			throw new MissingParamException("key");
	}

}
