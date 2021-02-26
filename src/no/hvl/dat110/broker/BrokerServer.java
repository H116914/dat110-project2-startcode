package no.hvl.dat110.broker;

import no.hvl.dat110.common.Logger;

public class BrokerServer extends Thread {
	public static Storage storage;
	private static int BROKER_DEFAULTPORT = 8080;
	
	public static void main(String[] args) {
		
		int port = BROKER_DEFAULTPORT;
		System.out.println("1 BrokerServer");
		if (args != null) {
			if (args.length > 0) {
				port = Integer.parseInt(args[0]);
			}
		}
		System.out.println("2 BrokerServer");
		Logger.log("Broker server : " + port);
		
		storage = new Storage();
		Dispatcher dispatcher = new Dispatcher(storage);
		Broker broker = new Broker(dispatcher,port);
		System.out.println("3 BrokerServer");
		// start dispatcher and broker threads
		dispatcher.start();
		broker.start();
		System.out.println("4 BrokerServer");
		// wait for termination of dispatcher and broker threads before stopping broker server
		try {
			broker.join();
			dispatcher.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Logger.log("Broker server stopping ... ");
		
	}

}
