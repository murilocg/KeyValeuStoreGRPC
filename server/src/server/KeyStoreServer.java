package server;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.grpc.Server;
import io.grpc.ServerBuilder;


public class KeyStoreServer {

	private Server server;
	private static final int SERVER_PORT = 50051;

	private void start() throws IOException {
		server = ServerBuilder.forPort(SERVER_PORT).addService(new KeyStoreImpl()).build().start();
		Thread shutdown = new Thread(() -> stop());
		System.out.println("Servidor executando na porta " + SERVER_PORT);
		Runtime.getRuntime().addShutdownHook(shutdown);
	}

	private void stop() {
		if (server != null) {
			try {
				server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace(System.err);
			}
		}
	}

	private void blockUntilShutdown() throws InterruptedException {
		if (server != null)
			server.awaitTermination();
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		final KeyStoreServer server = new KeyStoreServer();
		server.start();
		server.blockUntilShutdown();
	}
}