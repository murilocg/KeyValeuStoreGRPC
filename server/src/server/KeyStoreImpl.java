package server;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import io.grpc.keystore.GetAllRequest;
import io.grpc.keystore.GetRequest;
import io.grpc.keystore.GetResponse;
import io.grpc.keystore.KeyResponse;
import io.grpc.keystore.KeyStoreGrpc;
import io.grpc.keystore.PutRequest;
import io.grpc.keystore.PutResponse;
import io.grpc.stub.StreamObserver;

public class KeyStoreImpl extends KeyStoreGrpc.KeyStoreImplBase {

	private Map<String, String> store;

	public KeyStoreImpl() {
		super();
		this.store = new HashMap<String, String>();
	}

	@Override
	public void put(PutRequest req, StreamObserver<PutResponse> observer) {
		System.out.println("action=put, key=" + req.getKey() + ", value=" + req.getValue());

		synchronized (store) {
			store.put(req.getKey(), req.getValue());
		}
		PutResponse res = PutResponse.newBuilder().setSuccess(true).setMessageStatus("item successfully inserted")
				.build();
		observer.onNext(res);
		observer.onCompleted();
	}

	@Override
	public void get(GetRequest req, StreamObserver<GetResponse> observer) {
		System.out.println("action=get, key=" + req.getKey());
		String value;
		synchronized (store) {
			value = store.get(req.getKey());
		}
		GetResponse res = GetResponse.newBuilder().setValue(value != null ? value : "").build();
		observer.onNext(res);
		observer.onCompleted();
	}

	@Override
	public void getAllKeys(GetAllRequest request, StreamObserver<KeyResponse> observer) {

		Iterator<String> i;
		synchronized (store) {
			i = store.keySet().iterator();
		}
		while (i.hasNext()) {
			String next = i.next();
			KeyResponse build = KeyResponse.newBuilder().setName(next).build();
			observer.onNext(build);
		}
		observer.onCompleted();
	}

}