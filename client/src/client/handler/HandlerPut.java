package client.handler;

import client.exception.MissingParamException;
import io.grpc.StatusRuntimeException;
import io.grpc.keystore.KeyStoreGrpc;
import io.grpc.keystore.PutRequest;
import io.grpc.keystore.PutResponse;

public class HandlerPut extends Handler {

	private String key;
	private String value;

	public HandlerPut(KeyStoreGrpc.KeyStoreBlockingStub blockingStub, String... args) throws MissingParamException {
		super(blockingStub, args);
	}

	@Override
	public void handle() {
		PutRequest req = PutRequest.newBuilder().setKey(key).setValue(value).build();
		try {
			PutResponse res = blockingStub.put(req);
			String status = res.getSuccess() ? "Sucess" : "Failed";
			System.out.println("result=" + status + ", message=" + res.getMessageStatus());
		} catch (StatusRuntimeException e) {
			System.err.println(e);
		}
	}

	@Override
	public void parseParams(String... args) throws MissingParamException {
		key = args.length > 2 ? args[2] : "";
		value = args.length > 3 ? args[3] : "";
		if (key.isEmpty())
			throw new MissingParamException("key");
		if (value.isEmpty())
			throw new MissingParamException("value");
	}
}
