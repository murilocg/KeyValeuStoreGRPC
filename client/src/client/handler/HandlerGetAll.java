package client.handler;

import java.util.Iterator;

import client.exception.MissingParamException;
import io.grpc.StatusRuntimeException;
import io.grpc.keystore.GetAllRequest;
import io.grpc.keystore.KeyResponse;
import io.grpc.keystore.KeyStoreGrpc.KeyStoreBlockingStub;

public class HandlerGetAll extends Handler {

	public HandlerGetAll(KeyStoreBlockingStub blockingStub, String... args) throws MissingParamException {
		super(blockingStub, args);
	}

	@Override
	public void handle() {
		GetAllRequest req = GetAllRequest.newBuilder().build();
		try {
			Iterator<KeyResponse> res = blockingStub.getAllKeys(req);
			while (res.hasNext()) {
				KeyResponse next = res.next();
				System.out.println("Key=" + next.getName());
			}
		} catch (StatusRuntimeException e) {
			System.err.println(e);
		}
	}

	@Override
	public void parseParams(String... args) throws MissingParamException {
	}

}
