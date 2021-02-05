package client.handler;

import client.exception.InvalidActionException;
import client.exception.MissingParamException;
import io.grpc.keystore.KeyStoreGrpc;

public class HandlerBuilder {

	public static Handler build(KeyStoreGrpc.KeyStoreBlockingStub blockingStub, String... args)
			throws InvalidActionException, MissingParamException {
		String action = args.length > 1 ? args[1] : "";
		if (action.equals("put"))
			return new HandlerPut(blockingStub, args);
		else if (action.equals("get"))
			return new HandlerGet(blockingStub, args);
		else if (action.equals("getAllKeys"))
			return new HandlerGetAll(blockingStub, args);
		throw new InvalidActionException(action);
	}
}
